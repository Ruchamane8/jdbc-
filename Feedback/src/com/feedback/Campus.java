package com.feedback;

import java.util.Scanner;

public class Campus {
	public Campus() {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Campus Feedback Page");
		System.out.println();
        System.out.println("Please give appropriate ratings(1 to 10) to proceed further!");
        System.out.println();
        System.out.print("How is the Placement Facility?: ");
        int placement = s.nextInt();
        System.out.println();
        System.out.print("How is the campus Environment?: ");
        int env = s.nextInt();
        System.out.println();
        System.out.println("How are the Study Resources availability?: ");
        int res = s.nextInt();
        System.out.println();
        System.out.println("Thank you...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		new Main();
	}
}
