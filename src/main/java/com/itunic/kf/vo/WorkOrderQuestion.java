package com.itunic.kf.vo;

import java.io.Serializable;

public class WorkOrderQuestion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1665812547149104802L;
	private String id;
	private String resultDate;
	private String startTime;
	private String endTime;
	private String question;
	private String num;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResultDate() {
		return resultDate;
	}

	public void setResultDate(String resultDate) {
		this.resultDate = resultDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
