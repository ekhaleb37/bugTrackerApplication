package com.bugswatter.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bug{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long bugId;
    private String title;
    private String description;
    private Date createdDate;//date bug was created
    private String targetDateString;
    private Date targetDate;//target date for the bug to be resolved


    //constructor
    public Bug(){

    }
    public Bug(String title,String description) {
        this.title = title;
        this.description = description;
        this.createdDate = new Date( );
    }
    public Bug(String title,String description, String targetDateString) {
        this.title = title;
        this.description = description;
//        this.createdDate = new Date( );
        this.targetDateString = targetDateString;
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
    public Date getDateCreated() {
        return createdDate;
    }
    public String getTargetDateString() {
		return targetDateString;
	}
	public void setTargetDateString(String targetDateString) {
		this.targetDateString = targetDateString;
	}
    public void setTargetDate() throws ParseException {
    	String datePattern = "MM-dd-yyyy";
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        this.targetDate = simpleDateFormat.parse(targetDateString);
    }
    public Date getTargetDate() {
        return targetDate;
    }
    //methods
	

}