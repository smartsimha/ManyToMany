package com.tysspl.many_to_many_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String courseName;
	private int cost;
	@ManyToMany
	private List<Student> sl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Student> getSl() {
		return sl;
	}

	public void setSl(List<Student> sl) {
		this.sl = sl;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", cost=" + cost + ", sl=" + sl + "]";
	}

}
