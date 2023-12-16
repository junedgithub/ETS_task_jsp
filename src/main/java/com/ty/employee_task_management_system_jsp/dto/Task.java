package com.ty.employee_task_management_system_jsp.dto;

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
}
