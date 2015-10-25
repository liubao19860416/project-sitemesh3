package com.renzq.app.task.dao;

import org.springframework.stereotype.Repository;

import com.renzq.app.common.dao.GenericDAO;
import com.renzq.app.task.model.Task;

@Repository
public class TaskDao extends GenericDAO<Task> implements ITaskDao {

}
