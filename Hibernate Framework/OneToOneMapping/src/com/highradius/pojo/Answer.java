package com.highradius.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Answer {
	
	@Id
	private int aid;
	
	private String ans;
	
	@OneToOne(mappedBy = "answer")
	private Question question;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + "]";
	}
	
}
