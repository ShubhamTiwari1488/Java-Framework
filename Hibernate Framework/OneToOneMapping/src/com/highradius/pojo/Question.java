package com.highradius.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Question {
	
	@Id
	private int qid;
	
	private String ques;
	
	@OneToOne
	private Answer answer;
	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", answer=" + answer + "]";
	}
	
}
