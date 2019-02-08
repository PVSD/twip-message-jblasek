package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner jbReader = new Scanner(System.in);

        System.out.println("Hi welcome to the archaic messenger! Do you want to start a conversation? (yes or no)");
        String response1 = jbReader.next();

        if (response1.equalsIgnoreCase("yes")) {

            System.out.println("Please enter the names of the people you want to talk. (Your name then your friends name.)");

            String name = jbReader.next(); //your name being added to the group

            String friendName = jbReader.next(); //name of the friend being added to the group

            messageList mL1 = new messageList(name, friendName);
            messageList mL2 = new messageList(name, friendName);
            System.out.println(name + " is going to be person 1 and " + friendName + " is going to be person 2, begin your messaging! ");

            boolean continuee = true;
            int onList = 1;


            while (continuee) {

                System.out.println("If you want to type into the first list, type in 'first'. If you want to enter into the second list, type in 'second'.");
                //System.out.println("Please enter a message. After you type the message, please type in your number after it. If you want to remove a message, type 'remove'. "
                             //   + "If you want to leave your current list, type in 'exit'.");
                String response2 = jbReader.next();


                if (response2.equalsIgnoreCase("first")) {
                    onList = 1;
                    System.out.println("Welcome to list 1, please enter a message. After you type the message, please type in your number after it. If you want to remove a message, type 'remove'. If you want to leave your current list, type in 'exit'.");
                    while (true) {
                        String responseL1 = jbReader.nextLine();
                        responseL1 = jbReader.nextLine();

                        if (responseL1.equalsIgnoreCase("remove")) {
                            System.out.println("What message do you want to remove? (Type it in exactly how it is written, then type in who wrote it.)");
                            responseL1 = jbReader.nextLine();
                            responseL1 = jbReader.nextLine();
                            mL1.removeMessage(responseL1, mL1);
                        } else if (responseL1.equalsIgnoreCase("exit")) {
                            System.out.println("Goodbye!");
                            break;
                        } else {
                            int personNum = jbReader.nextInt();
                            mL1.addMessage(responseL1, personNum);

                        }
                    }
                } else if (response2.equalsIgnoreCase("second")) {
                    onList = 2;
                    System.out.println("Welcome to List 2, please enter a message. After you type the message, please type in your number after it. If you want to remove a message, type 'remove'. If you want to leave your current list, type in 'exit'.");

                    while (true) {
                        String responseL2 = jbReader.nextLine();
                        responseL2 = jbReader.nextLine();

                        if (responseL2.equalsIgnoreCase("remove")) {
                            System.out.println("What message do you want to remove? (Type it in exactly how it is written, then type in who wrote it.)");
                            responseL2 = jbReader.nextLine();
                            responseL2 = jbReader.nextLine();
                            mL2.removeMessage(responseL2, mL1);
                        } else if (responseL2.equalsIgnoreCase("exit")) {
                            System.out.println("Goodbye!");
                            break;
                        } else {
                            int personNum = jbReader.nextInt();
                            mL2.addMessage(responseL2, personNum);

                        }
                    }
                }
                else {
                    System.out.println("Sorry i didn't get that, try again.");
                }
            }


        }
        else {
            System.out.println("Bro get out then");
        }
    }
}




