package com.livingoncodes.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livingoncodes.crud.entity.Book;

public interface BookRepository extends JpaRepository<Book ,Long> {

	public Book findById(Long id);
}

