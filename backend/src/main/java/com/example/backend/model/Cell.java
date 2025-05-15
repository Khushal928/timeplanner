package com.example.backend.model;
import java.time.LocalDateTime;

public class Cell {
	int taskid;                       // taskid will be 0 for a break, -1 for a routine for our convenience.
	int cellid;
	boolean fixed;
	LocalDateTime starttime;
	LocalDateTime endtime;
}
