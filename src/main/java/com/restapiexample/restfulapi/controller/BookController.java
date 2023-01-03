package com.restapiexample.restfulapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapiexample.restfulapi.entities.Book;
import com.restapiexample.restfulapi.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	//"http://localhost:8080/getbookbyid/1"
	@GetMapping("/getbookbyid/{id}")
	public Book getBookId(@PathVariable(name="id") Integer bookId) {
		Book book = bookService.getBookId(bookId);
		return book;
	}
	//"http://localhost:8080/getbooks"
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	
	//"http://localhost:8080/deletebookbyid/1"
	@GetMapping("/deletebookbyid/{id}")
	public void deleteBookById(@PathVariable(name="id") Integer bookId) {
		bookService.deleteBookById(bookId);
	}
	
	//"http://localhost:8080/addbook"
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	//"http://localhost:8080/updatebook"
	@PostMapping("/updatebook")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
}
