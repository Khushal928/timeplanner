package com.example.backend.model;
import java.time.LocalTime;



public class Timerange {
    private LocalTime startTime;
    private LocalTime endTime;

    public Timerange(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
