package org.freedom.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.freedom.boot.bean.Book;
import org.freedom.boot.bean.CollectExample;
import org.freedom.boot.bean.CollectExample.Criteria;
import org.freedom.boot.dao.BookMapper;
import org.freedom.boot.dao.CollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookMapper bookMapper;

	@Autowired
	CollectMapper collectMapper;

	/**
	 * 查询书本集合
	 * 
	 * @return
	 */
	public List<Book> getBookList() {
		return bookMapper.selectByExampleWithType(null);
	}

	/**
	 * 返回某本书，还要带有自己是否收藏的信息
	 * 
	 * @param bookId
	 * @param userId
	 * @return
	 */
	public BookWithCollect getBook(Integer bookId, Integer userId) {
		
		//查询收藏表，是否有该用户收集过该书
		CollectExample collectExample = new CollectExample();
		Criteria criteria = collectExample.createCriteria();
		criteria.andBookIdEqualTo(bookId);
		criteria.andUserIdEqualTo(userId);

		//是否收藏过
		Integer ifCollect = collectMapper.selectByExample(collectExample).isEmpty() ? 0 : 1;
		BookWithCollect bookWithCollect = new BookWithCollect(ifCollect, bookMapper.selectByPrimaryKey(bookId));

		return bookWithCollect;
	}

}

class BookWithCollect {

	Integer ifCollect;

	Book book;

	public Integer getIfCollect() {
		return ifCollect;
	}

	public void setIfCollect(Integer ifCollect) {
		this.ifCollect = ifCollect;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookWithCollect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookWithCollect(Integer ifCollect, Book book) {
		super();
		this.ifCollect = ifCollect;
		this.book = book;
	}

}
