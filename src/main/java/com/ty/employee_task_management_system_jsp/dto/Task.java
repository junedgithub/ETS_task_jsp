package com.ty.employee_task_management_system_jsp.dto;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String description;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public int hashCode() {
	return Objects.hash(description, id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Task other = (Task) obj;
	return Objects.equals(description, other.description) && id == other.id;
}

@Override
public String toString() {
	return "Task [id=" + id + ", description=" + description + "]";
}
  
  
}
