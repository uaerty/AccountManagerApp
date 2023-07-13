package com.accounts.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Account> listAccount = accountService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listAccount", listAccount);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newAccountForm(Map<String, Object> model) {
		Account account = new Account();
		model.put("account", account);
		return "new_account";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAccount(@ModelAttribute("account") Account account) {
		accountService.save(account);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editAccountForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_account");
		Account account = accountService.get(id);
		mav.addObject("account", account);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteAccountForm(@RequestParam long id) {
		accountService.delete(id);
		return "redirect:/";		
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Account> result = accountService.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		
		return mav;		
	}	
}
