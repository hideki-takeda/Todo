package model;

import java.io.Serializable;
import java.util.Date;

public class Todo implements Serializable {
	private Date date;
	private String task;
	private Date deadline;
	private String priority;
	
	public Todo() { }
	public Todo(Date date, String task, Date Date deadline, String priority) {
		this.date = date;
		this.task = task;
		this.deadline = deadline;
		this.priority = priority;
	}
	
	public Date getDate() {return date;}
	public void setDate(Date date) {this.date = date;}
	public String getTask() {return task;}
	public void setTask(String task) {this.task = task;}
	public Date getDeadline() {return deadline;}
	public void setDeadline(Date deadlin) {this.deadline = deadline;}
	public String getPriority() {return priority;}
	public void setPriority(String priority) {this.priority = priority;}	
}
