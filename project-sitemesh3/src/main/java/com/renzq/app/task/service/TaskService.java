package com.renzq.app.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renzq.app.task.dao.ITaskDao;
import com.renzq.app.task.model.Task;

@Service
public class TaskService implements ITaskService {

	@Autowired
	ITaskDao taskDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Task> getAllTasks() {
		return taskDao.queryAll();
	}

	@Override
	public void createTask(Task task) {
		taskDao.create(task);
	}

	@Override
	public void saveTask(Task task) {
		taskDao.saveOrUpdate(task);
	}
	
	

}
