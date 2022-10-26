package com.bugswatter.demo;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long projectId;
    private String title;
    private String description;
    private ArrayList<Bug> bugList = new ArrayList<Bug>();
    private int numOfBugs;
    private int numOfDeadBugs;

    //constructors
    public Project(){

    }
    public Project(String title, String description){
        this.title = title;
        this.description = description;
    }
    //getters and setters
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setBugList(ArrayList<Bug> bugList){ 
        this.bugList = bugList;
    }
    public ArrayList<Bug> getBugList() {
        return bugList;
    }

    //methods
    public void addBug(Bug bug ){
        bugList.add(bug);
    }
    public void deleteBug(Bug bug){
        bugList.remove(bug);
    }
//    public void displayDetails(){
//        System.out.println("The title of this project is " + title);
//        System.out.println("Project Description: "+description);
//        System.out.println("Here is a list of all known bugs/issues: ");
//        for(int i : bugList){
//            System.out.println(bugList.get(i));
//        }
//    }

}
