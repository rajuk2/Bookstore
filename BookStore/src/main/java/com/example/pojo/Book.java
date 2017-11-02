package com.example.pojo;

public class Book {
	private Integer id;
	private String name;
	private String writer;
	private String serial_no;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", writer=" + writer + ", serial_no=" + serial_no + "]";
	}
	
	
	
	
	

}
