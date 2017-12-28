package com.livingoncodes.crud.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livingoncodes.crud.entity.Book;

import com.livingoncodes.crud.repository.BookRepository;



@Service
public class BookService {

	@Autowired
	public BookRepository bookRepository;

	public void save(Book book) {
		bookRepository.save(book);

	}
	
	
	public List<Book> findAllBooks(){
	
		List <Book> books = new ArrayList<Book>();
		try{
			
			for(Book book:bookRepository.findAll()){
				books.add(book);
			}
			
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}
		
		
		return books;
	}
	
	public void delete(long id){
		
		bookRepository.delete(id);
	}
	
	public Book findOne(long id){
		
		return bookRepository.findOne(id);
	}
	

}
