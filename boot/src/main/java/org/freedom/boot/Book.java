package org.freedom.boot;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {
	private Integer bookId;

	private String name;

	private Float price;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
