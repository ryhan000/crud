package com.livingoncodes.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Book extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bookName", length = 100, nullable = false)
    private String bookName;

    @Column(name = "author" ,length = 255, nullable = false)
    private String author;
    
    @Column(name = "purchaseDate", length = 100, nullable = false)
    private String purchaseDate;

    public Book() {}
    
    
    public Book(long id, String  bookName, String author, String purchaseDate) {
    	this.id = id;
		this.bookName =  bookName;
		this.author = author;
		this.purchaseDate = purchaseDate;
	}


	@Override
    public Long getId() {
        return id;
    }

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", purchaseDate=" + purchaseDate
				+ "]";
	}
	
	
	
    
    
	
	}


	
    
