package org.freedom.crud.controller;

import org.freedom.crud.bean.Msg;
import org.freedom.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@Autowired
     StudentService studentService;
	
	
	@RequestMapping("/stus")
	@ResponseBody

	public Msg getStus() {
		return null;

	}

	
	/**
	 * Ñ§Éú£¬°à¼¶
	 * @return
	 */
	@RequestMapping("/stuinfo")
	@ResponseBody
	public Msg getStudentClass()
	{
		return Msg.success().add("data", studentService.getStudentClass());
	}
	
	 

}
