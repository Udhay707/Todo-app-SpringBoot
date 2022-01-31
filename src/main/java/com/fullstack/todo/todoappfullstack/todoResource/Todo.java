package com.fullstack.todo.todoappfullstack.todoResource;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	
	
	private String user;
	private String description;
	@Id
	@GeneratedValue
	private Integer id;
	private Date targetDate;
	private boolean done;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public Todo() {
		super();
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Todo(String user, String description, int id, Date targetDate, boolean done) {
		this.user = user;
		this.description = description;
		this.id = id;
		this.targetDate = targetDate;
		this.done = done;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Todo [user=" + user + ", descripton=" + description + ", id=" + id + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}
}
