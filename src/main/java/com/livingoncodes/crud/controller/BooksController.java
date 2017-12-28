package com.livingoncodes.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.livingoncodes.crud.entity.Book;
import com.livingoncodes.crud.services.BookService;

@Controller
public class BooksController {

	@Autowired
	public BookService bookService;

	@RequestMapping(value = "/showBooks", method = RequestMethod.GET)
	public String showBooks(Model model) {

		model.addAttribute("books", bookService.findAllBooks());

		return "allbook";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveNewBook(@ModelAttribute Book book, Model model) {

		bookService.save(book);

		model.addAttribute("books", bookService.findAllBooks());

		return "allbook";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam long id, Model model) {

		bookService.delete(id);

		model.addAttribute("books", bookService.findAllBooks());
		return "allbook";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model, @RequestParam long id) {
		Book book = bookService.findOne(id);
		model.addAttribute("product", book);
		return "newbook";
	}

	@RequestMapping(value = "/addNewBook", method = RequestMethod.GET)
	public String addNewBook(Model model) {
		
		model.addAttribute("product", new Book());
		return "newbook";
	}

	

}
