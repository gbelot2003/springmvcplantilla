package com.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/costumers")
public class CostumersController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/")
	public ModelAndView show(Model model) {
		ModelAndView mv = new ModelAndView("costumers/index");
		model.addAttribute("customer", new Costumer());
		return mv;
	}

	@RequestMapping("/store")
	public String store(@ModelAttribute("customer") @Valid Costumer costumer, BindingResult results) {
		System.out.println(results.getErrorCount());
		if (results.hasErrors()) {
			return "costumers/index";
		}
		return "costumers/confirmation";

	}
}
