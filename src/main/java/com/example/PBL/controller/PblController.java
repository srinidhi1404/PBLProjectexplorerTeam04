/**
 * 
 */
package com.example.PBL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Samyuktha Pandula
 *
 */
@Controller
public class PblController {

	@RequestMapping("adminDashboard")
	public String admin() {
		return "AdminDashboard.html";
	}
	@RequestMapping("userDashboard")
	public String user() {
		System.out.println("in userdashboard controller");
		return "userdashboard.html";
	}
	@RequestMapping("postaproject")
	public String postaproject() {
		return "postaproject.html";
	}
	@RequestMapping("myprojects")
	public String myprojects() {
		return "myprojects.html";
	}
	@RequestMapping("userprofile")
	public String userProfile() {
		return "userprofile.html";
	}
	@RequestMapping("Usermanagement")
	public String Usermanagement() {
		return "Usermanagement.html";
	}
	@RequestMapping("requestonproject")
	public String projectRequests() {
		return "Requestsontheproject.html";
	}
	@RequestMapping("flaggeditems")
	public String flaggeditems() {
		return "FlaggedItems.html";
	}
	@RequestMapping("userRequests")
	public String userRequests() {
		return "userRequests.html";
	}
	@RequestMapping("login")
	public String login() {
		return "LoginPage.html";
	}
	@RequestMapping("signup")
	public String signup() {
		return "Signup.html";
	}
//	@RequestMapping("dashboard")
//	public String index() {
//		return "index.html";
//	}
	@RequestMapping("lookings")
	public String goToLookings() {
		return "Lookingspage.html";
	}
}
