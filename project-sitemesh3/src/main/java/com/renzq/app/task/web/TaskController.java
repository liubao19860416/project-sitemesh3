package com.renzq.app.task.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renzq.app.task.model.Task;
import com.renzq.app.task.service.ITaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	
	@Autowired
	ITaskService taskService;
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	
	@RequestMapping(value="/test2", method=RequestMethod.GET)
	public String[] test2(){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		return list.toArray(new String[list.size()]);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Task> get(){
		Task t = new Task();
		t.setName("task1");
		t.setCommand("dir");
		taskService.createTask(t);
		return taskService.getAllTasks();
	}
	
}
