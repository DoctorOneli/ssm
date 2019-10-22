package org.freedom.crud.controller;

import org.freedom.crud.bean.Msg;
import org.freedom.crud.service.StuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuClassController {

	@Autowired
	StuClassService stuClassService;

	@RequestMapping("/course")
	@ResponseBody
	public Msg getCourse() {
		return Msg.success().add("data", stuClassService.getCourse());
	}

	@RequestMapping("/stuClass")
	@ResponseBody
	public Msg getStuClass()
	{
		return Msg.success().add("stuClass", stuClassService.getStuClass());
	}

}
