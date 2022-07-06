package com.example.test.vo;

import lombok.Data;

@Data
public class MemberVO {
	private String no;
	private String id;
	private String password;
	private String name;
	private String createdate;
	
	 
	
	public String getNo() {
		return no;
	}



	public void setNo(String no) {
		this.no = no;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCreatedate() {
		return createdate;
	}



	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}



	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", createdate="
				+ createdate + "]";
	}



	public MemberVO(String no, String id, String password, String name, String createdate) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.createdate = createdate;
	}
	
	
	
}
