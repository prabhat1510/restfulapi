package com.restapiexample.restfulapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapiexample.restfulapi.entities.Book;
import com.restapiexample.restfulapi.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book getBookId(Integer bookId) {
		Optional<Book> bok = bookRepo.findById(bookId);
		if (!bok.isEmpty()) {
			return bok.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Book> getBooks() {
		return (List<Book>) bookRepo.findAll();
	}

	@Override
	public void deleteBookById(Integer bookId) {
		Optional<Book> bok = bookRepo.findById(bookId);
		if (!bok.isEmpty()) {
			bookRepo.deleteById(bok.get().getBookId());
		} else {
			System.out.println("Book Id not found");
		}
	}

	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
