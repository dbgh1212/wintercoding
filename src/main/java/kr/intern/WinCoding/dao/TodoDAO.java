package kr.intern.WinCoding.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.intern.WinCoding.model.Todo;

@Repository
public class TodoDAO {

	private List<Todo> todoArray = new ArrayList<Todo>();
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private int id = 0;

	public List<Todo> getTodoList() {

		List<Todo> todolist = new ArrayList<Todo>();

		for (int i = 0; i < todoArray.size(); i++) {
			if (todoArray.get(i).getDone().equals("N"))
				todolist.add(todoArray.get(i));
		}

		return todolist;
	}

	public List<Todo> getDeadlineList() throws ParseException {
		List<Todo> deadlineList = new ArrayList<Todo>();
		Date now = new Date();
		for (int i = 0; i < todoArray.size(); i++) {

			if (todoArray.get(i).getDeadline().equals(""))
				continue;

			Date deadlineDate = format.parse(todoArray.get(i).getDeadline());
			System.out.println("현재날짜 : " + now);
			System.out.println("마감날짜 : " + deadlineDate);

			if (now.after(deadlineDate)) {
				deadlineList.add(todoArray.get(i));
			}
		}

		return deadlineList;
	}

	public void insertTodo(Todo todo) {
		todo.setId(id);
		id++;
		if (todo.getRank().equals("")) {
			todo.setRank("5");
		}
		todoArray.add(todo);
	}

	public List<Todo> getCompleteTodo() {

		List<Todo> completeTodo = new ArrayList<Todo>();

		for (int i = 0; i < todoArray.size(); i++) {
			if (todoArray.get(i).getDone().equals("Y")) {
				completeTodo.add(todoArray.get(i));
			}
		}

		return completeTodo;
	}

	public void deleteTodo(int id) {
		todoArray.remove(id);
		for (int i = id; i < todoArray.size(); i++) {
			todoArray.get(i).setId(i);
		}
	}

	public Todo getTodo(int id) {
		// TODO Auto-generated method stub
		return todoArray.get(id);
	}

	public void updateTodo(Todo todo) {
		int id = todo.getId();
		todoArray.set(id, todo);

	}

	public void setCompleteTodo(int id) {
		// TODO Auto-generated method stub
		todoArray.get(id).setDone("Y");
	}
}
