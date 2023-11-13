package com.example.demo.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private String id;
	
	private String name;
	private Integer rollNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rollNumber) == Double.doubleToLongBits(other.rollNumber);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", id=" + id + "]";
	}
	
	
}
