package com.tommy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TicketManager {

    private static Scanner scanner;

    public static void main(String[] args) throws IOException {

        TicketSupport ticketSupport = new TicketSupport();

//        LinkedList<Ticket> ticketQueue = new LinkedList<Ticket>();
//
//        Scanner sc = new Scanner(System.in);
//
//        String description;
//        String reporter;
//        Date dateReported = new Date();
//        int priority;
//
////        boolean moreProblems = true;
////        while(moreProblems){
////            System.out.println("Enter Problem: ");
////            description = ("Description of problem: " + (sc.nextLine()));
////            System.out.println("Who reported this problem?");
////            reporter=sc.nextLine();
////            System.out.println("Enter priority of " + description);
////            priority = Integer.parseInt(sc.nextLine());
////
////            com.tommy.Ticket t = new com.tommy.Ticket(description, priority, reporter, dateReported);
////            ticketQueue.add(t);
////
////            printAllTickets(ticketQueue);
////
////            System.out.println("More tickets?");
////            String more = sc.nextLine();
////            if(more.equalsIgnoreCase("N")){
////                moreProblems = false;
////            }
////        }
////        sc.close();
//
//
//        while (true) {
//
//            System.out.println("Support Ticket Manager:\n1. Enter Ticket\n2. Delete Ticket\n3. Display All Tickets\n4. Quit");
//            int task = Integer.parseInt(sc.nextLine());
//
//            if (task == 1) {
//                //Call addTickets, which will let us enter any number of new tickets
//                System.out.println("Enter Problem: ");
//                description = ("Description of problem: " + (sc.nextLine()));
//                System.out.println("Who reported this problem?");
//                reporter = sc.nextLine();
//                System.out.println("Enter priority of " + description);
//                priority = Integer.parseInt(sc.nextLine());
//
//                Ticket t = new Ticket(description, priority, reporter, dateReported);
//                ticketQueue.add(t);
//
//                printAllTickets(ticketQueue);
//
//            } else if (task == 2) {
//                //delete a ticket
//                deleteTicket(ticketQueue);
//            } else if (task == 4) {
//                //Quit. Future prototype may want to save all tickets to a file
//                System.out.println("Quitting program");
//                break;
//            } else {
//                printAllTickets(ticketQueue);
//            }
//        }
//        sc.close();
//    }
//
//    protected static void printAllTickets(LinkedList<Ticket> tickets) {
//        System.out.println("---------ALL tickets----------");
//
//        for (Ticket t : tickets) {
//            System.out.println(t + "\n"); //Write a toString method in Ticket Class
//        }
//    }
//
//
//    protected static void deleteTicket(LinkedList<Ticket> ticketQueue) {
//        printAllTickets(ticketQueue);
//
//        if (ticketQueue.size() == 0) {
//            System.out.println("No tickets to delete!\n");
//            return;
//        }
//
//        Scanner deleteScanner = new Scanner(System.in);
//        System.out.println("Enter ID of ticket to delete");
//        int deleteID = deleteScanner.nextInt();
//
//        boolean found = false;
//        for (Ticket ticket : ticketQueue) {
//            if (ticket.TicketID == deleteID) {
//                found = true;
//                ticketQueue.remove(ticket);
//                System.out.println(String.format("Ticket %d deleted\n", deleteID));
//            } else {
//                if (ticket.TicketID != deleteID) {
//                    System.out.println("Ticket " + deleteID + " is not a valid Ticket ID.\n");
//                    return;
//                }
//
//                printAllTickets(ticketQueue);
//            }
//        }
//    }
//
//    //move the adding ticket code to a method
//    protected static void addTickets(LinkedList<Ticket> ticketQueue) {
//        Scanner sc = new Scanner(System.in);
//
//        boolean moreProblems = true;
//        String description;
//        String reporter;
//
//    }
//
//    private static int getPositiveIntInput() {
//
//        while (true) {
//            try {
//                String stringInput = scanner.nextLine();
//                int intInput = Integer.parseInt(stringInput);
//                if (intInput >= 0) {
//                    return intInput;
//                } else {
//                    System.out.println("Please enter a positive number");
//                    continue;
//                }
//            } catch (NumberFormatException ime) {
//                System.out.println("Please type a positive number");
//            }
//        }
    }
    }
