package com.example.backend.model;
import java.time.LocalDateTime;
import java.util.ArrayList;




public class Task {
	int taskid;
	String description;
	String name;
	LocalDateTime deadline;            // LocalDateTime stores time and date
	int durationinhrs;				   // input pratyush decides but for algorithm, we are using in hours before creating class, we should format it
	boolean costumised;              // if he want to fix it on a day, we need to specify algorithm that using this boolean
    ArrayList<Timerange> timeSlots;
    
    public Task(int taskid,String description,String name,LocalDateTime deadline,int durationinhrs,boolean costumised,ArrayList<Timerange> timeSlots) {
    	this.taskid=taskid;
    	this.description = description;
    	this.name = name;
    	this.deadline = deadline;
    	this.durationinhrs = durationinhrs;
    	this.costumised = costumised; 	
    	
    	this.timeSlots = timeSlots;
    }
}