package com.vinay.fuppino.messenger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement

public class Message {
	private long id;
	private String message;
	private Date created;
	private String author;
	private Map<Long,Comment> comments = new HashMap<>();  
	
	public Message() {
		super();
	}

	public Message(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
		generateComments();
	}

	private void generateComments() {
		comments.put(1L, new Comment(1, "Hi", "Kaushik"));
		comments.put(2L, new Comment(2, "Lol", "Vinay"));
		comments.put(3L, new Comment(3, "Sample", "Vikram"));
		comments.put(4L, new Comment(4, "nice", "Vinel"));
		comments.put(5L, new Comment(5, "temp", "Vinath"));		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
}
