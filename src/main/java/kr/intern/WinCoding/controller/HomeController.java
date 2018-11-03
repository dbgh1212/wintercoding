package kr.intern.WinCoding.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.intern.WinCoding.model.Todo;
import kr.intern.WinCoding.service.TodoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}

	@RequestMapping(value = "/todolist", method = RequestMethod.GET)
	public String todolist(Model model) {

		List<Todo> todolist = bubbleSort(todoService.getTodoList());
		
		
		model.addAttribute("todolist", todolist);

		return "todolist";
	}

	@RequestMapping(value = "/deadlinelist", method = RequestMethod.GET)
	public String deadlinelist(Model model) throws ParseException {

		List<Todo> deadlineList = bubbleSort(todoService.getDeadlineList());

		model.addAttribute("deadlineList", deadlineList);

		return "deadlinelist";
	}

	@RequestMapping(value = "/inserttodo", method = RequestMethod.GET)
	public String inserttodo(Model model) {

		model.addAttribute("todo", new Todo());

		return "inserttodo";
	}

	@RequestMapping(value = "/insertok", method = RequestMethod.POST)
	public String insertok(Model model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("not");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "inserttodo";

		}

		todoService.insertTodo(todo);
		System.out.println(todo);

		return "insertok";
	}

	@RequestMapping(value = "/completetodo", method = RequestMethod.GET)
	public String completetodo(Model model) {

		List<Todo> completeTodoList = todoService.getCompleteTodo();
		model.addAttribute("completeTodoList", completeTodoList);
		return "completetodo";
	}
	
	
	@RequestMapping(value = "/deletetodo/{id}", method = RequestMethod.GET)
	public String deletetodo(Model model, @PathVariable int id) {
		
		todoService.deleteTodo(id);
		List<Todo> todolist = bubbleSort(todoService.getTodoList());
		model.addAttribute("todolist",todolist);
		return "todolist";
	}
	
	@RequestMapping(value = "/updatetodo/{id}", method = RequestMethod.GET)
	public String updatetodo(Model model, @PathVariable int id) {
		
		Todo todo = todoService.getTodo(id);
		model.addAttribute("todo", todo);
		
		return "updatetodo";
	}
	
	@RequestMapping(value = "/updatetodo", method = RequestMethod.POST)
	public String updatetodoPost(Model model, @Valid Todo todo, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println("not");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "updatetodo";

		}
		
		todoService.updateTodo(todo);
		List<Todo> todolist = bubbleSort(todoService.getTodoList());
		model.addAttribute("todolist",todolist);
		return "todolist";
	}
	
	@RequestMapping(value = "/completetodo/{id}", method = RequestMethod.GET)
	public String completetodoId(Model model, @PathVariable int id) {

		todoService.setCompleteTodo(id);
		
		List<Todo> todolist = bubbleSort(todoService.getTodoList());
		model.addAttribute("todolist",todolist);
		return "todolist";
	}
	

	public List<Todo> bubbleSort(List<Todo> list) {
		
		Todo temp = null;

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (Integer.parseInt(list.get(j).getRank()) > Integer.parseInt(list.get(j + 1).getRank())) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
		return list;
	}

}
