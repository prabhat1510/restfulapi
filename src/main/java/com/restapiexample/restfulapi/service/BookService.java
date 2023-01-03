package com.restapiexample.restfulapi.service;

import java.util.List;

import com.restapiexample.restfulapi.entities.Book;

public interface BookService {
	public Book getBookId(Integer bookId);
	public List<Book> getBooks();
	public void deleteBookById(Integer bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
}
