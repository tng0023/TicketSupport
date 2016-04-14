package com.tommy;

import java.util.*;

public class Ticket {

    private int priority;
    private String reporter;
    private String description;
    private Date dateReported;
    private static int staticTicketIDCounter = 1;
    protected int TicketID;

    public Ticket(String desc, int p, String rep, Date date){
        this.description = desc;
        this.priority = p;
        this.reporter = rep;
        this.dateReported = date;
        this.TicketID = staticTicketIDCounter;
        staticTicketIDCounter++;
    }

    protected int getPriority(){
        return priority;
    }

    //called automatically if a Ticket object is an argument to System.out.println
    public String toString() {
        return("Ticket ID: " + this.TicketID + " " +  this.description + " Priority: " + this.priority + " Reported by: " + this.reporter
                + " Reported on: " + this.dateReported);
    }
}


