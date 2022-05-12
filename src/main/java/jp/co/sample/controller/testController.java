package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.repository.EmployeeRepository;

@Controller
@RequestMapping("/test")
public class testController {
	@Autowired
	private EmployeeRepository repository;

	@RequestMapping("")
	public String index() {

		return "test";
	}
}
