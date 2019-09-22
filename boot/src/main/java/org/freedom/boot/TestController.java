package org.freedom.boot;

import java.util.Date;

import org.freedom.boot.bean.Msg;
import org.freedom.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		return "hi,hi";
	}
	
	 
	
	 
}
