package com.bugswatter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BugTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
		
		Bug testBug = new Bug("Test", "This bug is a test for making sure constructors work properly");
        Project testProject = new Project("Bug Tracker Test", "This is a test to make sure the bug tracker projects are correctly storing bug objects");
        testProject.addBug(testBug);
	}

}
