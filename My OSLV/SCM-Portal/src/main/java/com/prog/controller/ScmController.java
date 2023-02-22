package com.prog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.entity.SCM;
import com.prog.service.ScmService;


import jakarta.servlet.http.HttpSession;

@Controller
public class ScmController {
	@Autowired
	private ScmService service;
	
	@GetMapping("/")
	public String home(Model m) {
		
		List<SCM> scm = service.getAllDetails();
		m.addAttribute("scm",scm);
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_entity";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute SCM s,HttpSession session) 
	{
		System.out.println(s);
		service.addScm(s);
		session.setAttribute("msg", "Employee Added Successfully..");
		return "redirect:/";
		
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		
		SCM s = service.getDetailsById(id);
		
		m.addAttribute("scm",s);
		
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute SCM s,HttpSession session) {
		service.addScm(s);
		session.setAttribute("msg", "Emp Data Update Sucessfully");
		
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id, HttpSession session) {
		service.deleteDetails(id);
		session.setAttribute("msg", "Emp Data deleted Sucessfully");
		return "redirect:/";
	}
}
