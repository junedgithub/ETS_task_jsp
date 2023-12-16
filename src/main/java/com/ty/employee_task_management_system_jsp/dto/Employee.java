package com.ty.employee_task_management_system_jsp.dto;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String email;
  private String password;
  private String role;
  private double salary;
  
  @OneToMany
  List<Task> tasks;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public List<Task> getTasks() {
	return tasks;
}

public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
}

@Override
public int hashCode() {
	return Objects.hash(email, id, name, password, role, salary, tasks);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
			&& Objects.equals(password, other.password) && Objects.equals(role, other.role)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
			&& Objects.equals(tasks, other.tasks);
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
			+ ", salary=" + salary + ", tasks=" + tasks + "]";
}
  
  
}
