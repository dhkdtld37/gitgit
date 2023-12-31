/*
 Video class
 - title 비디오제목
 - lend 대여여부
 - lendName 대여자 (고객명)
 - lendDate 대여일자 
 
 Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료 출력하는
 프로그램 작성
 */
package day12.quiz0103;

import java.util.Date;

public class Video {
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private Date lendDate;
	
	public Video() {
		this.title = "None title";
		this.category = "None category";
		this.lend = false;
		this.lendName = "None lendName";
		this.lendDate = new Date();
	}
	public Video(String title) {
		super();
		this.title = title;
		this.category = "";
		this.lend = false;
		this.lendName = "";
		this.lendDate = new Date();
	}
	public Video(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = "";
		this.lendDate = new Date();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Video other = (Video) obj;
		if (!title.equals(other.title))
			return false;
		return true;
	}	
}
