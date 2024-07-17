package com.feedback;

import java.util.Scanner;

public class Main {
    public Main() {
        System.out.println("\t\t\t\t\t\t\t ------------- Welcome to ASM IBMR's Student Feedback System ------------------------");
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Please select the appropriate option below to proceed further!");
        System.out.println();
        System.out.println("Press 1 for -> Information about this project");
        System.out.println("Press 2 for -> Give feedback for Faculty");
        System.out.println("Press 3 for -> Give feedback for Campus");
        System.out.println("Press 4 for -> Exit");

        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter choice: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                new Information();
                break;
            case 2:
                new Faculty();
                break;
            case 3:
                new Campus();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter valid choice!!!");
                new Main();
                break;
                
        }
    }
    public static void main(String[] args) {
		new Main();
	}
}
