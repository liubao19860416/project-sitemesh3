package com.renzq.app.task.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.renzq.app.task.model.Task;

public interface ITaskService {

	public List<Task> getAllTasks();
	public void createTask(Task task);
	public void saveTask(Task task);
}
