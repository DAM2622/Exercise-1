package com.matthewsdavid.movietickets;

import java.util.Calendar;
import java.util.Scanner;


public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String name;
    private static int adultPrice;
    private static int oapPrice;
    private static int studentPrice;
    private static int childPrice;
    private static int adult;
    private static int oap;
    private static int student;
    private static int child;
    private static int totalPrice;
    private static int number;
    private static int discount;

// using scanner function to allow data to be inputted
    //get customer's name

    private static void getName(){
        System.out.println("Please input your name" );
        name=scan.nextLine();
        System.out.println("Hello " + name);
    }

    // get number of adult tickets required, then confirm number of adult tickets required and show undiscounted price of adult tickets
    // could remove print out information to speed up programme
    // adult tickets are £8 each

    private static void getAdultTickets(){
        System.out.println("Please select how many adult tickets you would like to buy" );
        adult= Integer.valueOf(scan.next());
        System.out.println("You would like " + adult + "  adult ticket(s)");
        adultPrice = adult*8;
        System.out.println("The price for " + adult + " adult ticket(s) is £" + adultPrice );
    }

    //  get number of OAP tickets required
    // OAP tickets are £6 each

    private static void getOAPTickets(){
        System.out.println("Please select how many oap tickets you would like to buy" );
        oap= Integer.valueOf(scan.next());
        System.out.println("You would like " + oap + "  oap ticket(s)");
        oapPrice = oap*6;
        System.out.println("The price for " + oap + " oap ticket(s) is £" + oapPrice );
    }

    // get number of student tickets required
    // student tickets are £6 each

    private static void getStudentTickets() {
        System.out.println("Please select how many student tickets you would like to buy");
        student= Integer.valueOf(scan.next());
        System.out.println("You would like " + student + "  student ticket(s)");
        studentPrice = student*6;
        System.out.println("The price for " + student + " student ticket(s) is £" + studentPrice );
    }

    // get number of child tickets required
    // child tickets are £4 each

    private static void getChildTickets() {
        System.out.println("Please select how many child tickets you would like to buy");
        child = Integer.valueOf(scan.next());
        System.out.println("You would like " + child + "  child ticket(s)");
        childPrice = child*4;
        System.out.println("The price for " + child + " child ticket(s) is £" + childPrice );

    }

    // Calculate total ticket price for the tickets requested
    // Calculate number of tickets requested

    private static void getTotalPrice(){
        totalPrice = adultPrice + oapPrice + studentPrice + childPrice;
        number =adult + oap + student + child;

    }

    // Calculate discount to apply on Wednesdays

    private static void applyDiscount(){
        discount = (number * 2);
    }

    public static void main(String[] args) {

        getName();
        getAdultTickets();
        getOAPTickets();
        getStudentTickets();
        getChildTickets();
        getTotalPrice();
        applyDiscount();

        // Determine the day of the week

        Calendar myDate = Calendar.getInstance();
        int dow = myDate.get (Calendar.DAY_OF_WEEK);

        // Determine if it is Wednesday - if it is apply the £2 / ticket discount

        if (dow == Calendar.WEDNESDAY) {
            System.out.println("Today is Wednesday");
            System.out.println("There is £2 off each ticket");
            System.out.println("You have purchased " + number  + " tickets");
            System.out.println("The total price for your tickets is £" + (totalPrice-discount));
            System.out.println("Thank you " + name);
        }else{

            System.out.println( name + " " +
                    "You have purchased " + number  + " tickets");
            System.out.println("The total price for your tickets is £" + totalPrice);
            System.out.println("Thank you");
        }


    }

}


