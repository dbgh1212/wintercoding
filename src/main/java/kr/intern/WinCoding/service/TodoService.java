package kr.intern.WinCoding.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.intern.WinCoding.dao.TodoDAO;
import kr.intern.WinCoding.model.Todo;

@Service
public class TodoService {
	@Autowired
	private TodoDAO todoDAO; 
	
	public List<Todo> getTodoList() {
		
		return todoDAO.getTodoList();
	}

	public List<Todo> getDeadlineList() throws ParseException {
		// TODO Auto-generated method stub
		return todoDAO.getDeadlineList();
	}

	public void insertTodo(Todo todo) {
		todoDAO.insertTodo(todo);
		
	}

	public List<Todo> getCompleteTodo() {
		// TODO Auto-generated method stub
		return todoDAO.getCompleteTodo();
	}

	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		todoDAO.deleteTodo(id);
	}

	public Todo getTodo(int id) {
		// TODO Auto-generated method stub
		return todoDAO.getTodo(id);
	}

	public void updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		todoDAO.updateTodo(todo);
	}

	public void setCompleteTodo(int id) {
		// TODO Auto-generated method stub
		todoDAO.setCompleteTodo(id);
	}

}
