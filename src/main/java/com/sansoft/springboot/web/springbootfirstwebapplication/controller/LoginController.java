package com.sansoft.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sansoft.springboot.web.springbootfirstwebapplication.service.LoginService;

// /login => "Hello World"
/*
 * To make this class as a Controller class
 * We make use of @Controller Annotation
 */

@Controller

/*
 * @SessionAttributes("name")
 * Stores the value of the name attribute on to the Session variable
 */
@SessionAttributes("name")
public class LoginController {
	
	/*
	 * Here the "LoginService is the dependency of the LoginController"
	 * The LoginService has to be defined in order for fine working of the LoginController
	 * 
	 * Spring provides a concept called "Dependency Injection(DI)"
	 * The DI framework will make sure that the LoginService will be AutoWired
	 */
	
	@Autowired
	LoginService service;

	/*
	 * @RequestMapping()
	 * Maps the URL request to a specific Controller
	 */
	
	/*
	 * "/" means that whenever a user types in any URL he/she will be directed to the Welcome page directly.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	/*
	 * @ResponseBody
	 * This annotation is used to directly render the content returned from the Controller 
	 * on to the Web page instead of searching for the particular View associated with that Controller
	 */
	
	/*
	 * @RequestParam is an annotation that is use to accept the GET parameter from the URL
	 */
	public String showLoginMessage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "welcome";
	}
	
}
