package com.tsr.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
public class Book {
	String author;
	String isbn;
	String title;
	String publisher;
	int version;
	double price;

	public Book() {
		super();
	}

	public Book(String author, String isbn, String title, String publisher, int version, double price) {
		super();
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.version = version;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", isbn=" + isbn + ", title=" + title + ", publisher=" + publisher
				+ ", version=" + version + ", price=" + price + "]";
	}

}
