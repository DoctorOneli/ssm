package org.freedom.crud.controller;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.freedom.crud.bean.Msg;
import org.freedom.crud.bean.User;
import org.freedom.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 按学号检查学生
	 * 
	 * @param stuNo
	 * @return true表示用户可添加
	 */
	@RequestMapping("/check_user")
	@ResponseBody
	public Msg checkUser(String stuNo) {
		String regex = "^[0-9_-]{10,12}$";
		if (!stuNo.matches(regex)) {
			return Msg.fail().add("reason", "学号由10到12位数字组合");
		}

		if (userService.checkUser(stuNo)) {
			return Msg.success();
		}

		else {
			return Msg.fail().add("reason", "该学号已存在");
		}

	}

	/**
	 * 根据主键查询学生
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getUser(@PathVariable("id") Integer id) {
		User user = userService.getUser(id);
		return Msg.success().add("user", user);
	}

	/**
	 * 更新学生
	 * 
	 * @param user
	 * @return
	 */

	@RequestMapping(value = "/user/{uid}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateUser(User user) {
		userService.updateUser(user);
		return Msg.success();

	}

	/**
	 * 删除(可单个，可批量)
	 * 
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "/user/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteUser(@PathVariable("ids") String ids) {

		if (ids.contains("-")) {
			String idStringArr[]=ids.split("-");
			List<Integer> idArr=new ArrayList<Integer>();
			for (String item : idStringArr) {
				idArr.add(Integer.parseInt(item));
			}
			
			userService.deleteBatch(idArr);

		}

		else {
			Integer id=Integer.parseInt(ids);
			userService.deleteUserById(id);
		}

		return Msg.success();

	}

	/**
	 * 添加学生
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public Msg addUser(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {

			Map<String, Object> errorMap = new HashMap<String, Object>();
			// 校验失败，返回错误信息
			List<FieldError> fieldErrors = result.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}

			return Msg.fail().add("error", errorMap);
		} else {
			userService.addUser(user);
			return Msg.success();
		}

	}

	/**
	 * 查询所有学生
	 * 
	 * @param pageIndex
	 * @param model
	 * @return
	 */

	@RequestMapping("/users")
	@ResponseBody
	public Msg getStusWithJson(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex) {
		// 引入pageHelper
		// 查询前调用，传入页码，每页数据量
		PageHelper.startPage(pageIndex, 5);

		List<User> stus = userService.getAll();

		PageInfo page = new PageInfo(stus, 5);

		return Msg.success().add("pageInfo", page);
	}

	/*
	 * public String getStus(@RequestParam(value = "pageIndex", defaultValue =
	 * "1") Integer pageIndex, Model model) {
	 * 
	 * // 引入pageHelper // 查询前调用，传入页码，每页数据量 PageHelper.startPage(pageIndex, 5);
	 * 
	 * List<User> stus = userService.getAll();
	 * 
	 * PageInfo page = new PageInfo(stus, 5); model.addAttribute("pageInfo",
	 * page);
	 * 
	 * return "list"; }
	 */

}
