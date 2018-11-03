package kr.intern.WinCoding.model;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class Todo {
	
	
	private Integer id = null;
	
	@NotEmpty(message="제목은 공백으로 할수가 없습니다.")
	private String title;
	
	@NotEmpty(message="할일은 공백으로 할수가 없습니다.")
	private String dowork;
	
	
	@Pattern(regexp="(^0*(?:[1-9][0-9]?|100)$)?", message="숫자를 입력하셔야 합니다.")
	private String rank = null;
	
	private String done = "N";
	
	@Pattern(regexp="((?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31)))?", message="마감날짜의 형식의 맞게 하거나 월의 일자를 넘어가지 않게 입력해야 합니다 ex) 2018-01-01 not)2018-13-45")
	private String deadline = null;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDowork() {
		return dowork;
	}
	public void setDowork(String dowork) {
		this.dowork = dowork;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDone() {
		return done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", dowork=" + dowork + ", rank=" + rank + ", done=" + done
				+ ", deadline=" + deadline + "]";
	}
	
}
