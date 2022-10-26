package com.bugswatter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class BugController {

		@Autowired
		private BugRepository bugRepository;
		
		@GetMapping(value="/")
		public String index(Bug bug) {
			return "bugtracker/home";
		}
		
		@PostMapping(value = "/")
		public String addNewBug(Bug bug, Model model) {
			bugRepository.save(new Bug(bug.getTitle(), bug.getDescription(), bug.getTargetDateString()));
			model.addAttribute("title", bug.getTitle());
			model.addAttribute("description", bug.getDescription());
			model.addAttribute("targetDateString", bug.getTargetDateString());
			return "bugtracker/newBugConfirmation";
		}
}
