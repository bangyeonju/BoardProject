package com.example.test.vo;

import lombok.Data;

@Data
public class BoardVO {
	private Integer bno;
	private String title;
	private String contents;
	private String writer;
	private String regdate;
	private Integer viewcnt;
	
	
	


	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public Integer getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}

	BoardVO(){
		
	}

	public BoardVO(Integer bno, String title, String contents, String writer, String regdate, Integer viewcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}
		
	

	
	
}
