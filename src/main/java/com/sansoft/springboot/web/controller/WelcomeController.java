package com.sansoft.springboot.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

public class WelcomeController {
	
	/*
	 * Here the "LoginService is the dependency of the LoginController"
	 * The LoginService has to be defined in order for fine working of the LoginController
	 * 
	 * Spring provides a concept called "Dependency Injection(DI)"
	 * The DI framework will make sure that the LoginService will be AutoWired
	 */

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
	public String showWelcomePage(ModelMap model) {
		model.put("name", getLoggedInUserName());
		return "welcome";
	}
	
	public String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}
	
}
