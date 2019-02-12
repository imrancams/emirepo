package com.omniwyse.ReadingExcel;

import java.util.Date;
/**
 * 
 * 
 * @author imran ahmad
 *  this is a  class which is having the log in log out record
 *
 */
public class LogInLogOut {
	private Date date;
	private Date InTime;
	private Date outTime;
	
	//setters and getters
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getInTime() {
		return InTime;
	}
	public void setInTime(Date inTime) {
		InTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	@Override
	public String toString() {
		return "LogInLogOut [date=" + date + ", InTime=" + InTime + ", outTime=" + outTime + "]";
	}
	
	
	

}
