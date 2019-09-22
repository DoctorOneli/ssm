package org.freedom.boot.controller;

import java.util.List;

import org.freedom.boot.bean.Book;
import org.freedom.boot.bean.Msg;
import org.freedom.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	
	/**
	 * 返回书本集合，分页查询
	 * @param pageIndex
	 * @return
	 */
	@GetMapping("/booklist")
	public Msg getBookList(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex)
	{
		PageHelper.startPage(pageIndex, 10);
		List<Book> bookList=bookService.getBookList();
		PageInfo pageInfo=new PageInfo(bookList);
		return Msg.success().add("book",pageInfo );
		
	}
	
	/**
	 * 返回某本书的信息，还要包括自己是否收藏过
	 * @param book_id
	 * @param user_id
	 * @return
	 */
	@GetMapping("/book")
	public Msg getBook(Integer book_id,Integer user_id)
	{
		return Msg.success().add("book", bookService.getBook(book_id, user_id));
	}
	
	 
	
	
	
}
