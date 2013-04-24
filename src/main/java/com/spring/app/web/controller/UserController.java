package com.spring.app.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.entity.UserAccount;
import com.spring.app.entity.UserView;
import com.spring.app.manager.UserManager;

@Controller
public class UserController extends BaseController {
	/*
	 * @RequestMapping("/index") public void index(){
	 * 
	 * }
	 */
	@RequestMapping("/login")
	public ModelAndView createAccount(HttpServletRequest request, Model model) {
		model.addAttribute("user", new UserAccount());

		System.out.println("usercontroller");

		String name = request.getParameter("uname");
		int pwd = Integer.parseInt(request.getParameter("upass"));
		userAccount.setUserName(name);
		userAccount.setPwd(pwd);
		userAccount.setUserId(1);

		String str = "welcome to u";
		String errorStr = "user does not exists";

		userManager.createAccount(name, pwd);
		if (true)
			return new ModelAndView("success", "model", str);
		else
			return new ModelAndView("error", "model", errorStr);
		// return jsonView("mdnd");
		// return new ModelAndView(new RedirectView("error.jsp",true));

	}
	public ModelAndView save(HttpServletRequest req,Model model){
		model.addAttribute("userView",new UserView());
		
		return null;
		
	}
	@Autowired
	private UserManager userManager;
	UserAccount userAccount;
}
