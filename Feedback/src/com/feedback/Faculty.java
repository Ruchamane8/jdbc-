package com.feedback;

import java.util.*;

public class Faculty {
	public Faculty() {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Faculty Feedback Page");
		System.out.println();
		System.out.println("Please Enter Your current semester(1-4): ");
		int sem = s.nextInt();
		
		switch(sem) {
        case 1:
			System.out.println("Please give subject wise feedback to faculty with 0-10 ratings-");
			System.out.println("Please Note: 0 means worst & 10 means Fabulus");
			
			System.out.print("Java:");			
			int java = s.nextInt();			
			System.out.print("DSA:");
			int dsa = s.nextInt();			
			System.out.print("Networking:");
			int net = s.nextInt();
			System.out.print("Operating System:");
			int os = s.nextInt();
			System.out.print("OOSE:");
			int oose = s.nextInt();
			System.out.println();
			System.out.println();
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
			System.exit(0);
			break;

		case 2:
			System.out.println("Please give subject wise feedback to faculty with 0-10 ratings-");
			System.out.println("Please Note: 0 means worst & 10 means Fabulus");
			System.out.print("Python:");
			int python = s.nextInt();
			System.out.print("SPM:");
			int spm = s.nextInt();
			System.out.print("AIT:");
			int ait = s.nextInt();
			System.out.print("OT:");
			int ot = s.nextInt();
			System.out.print("ADBMS:");
			int adbms = s.nextInt();
			System.out.println();
			System.out.println();
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
			System.exit(0);
			break;
		case 3:
			System.out.println("Please give subject wise feedback to faculty with 0-10 ratings-");
			System.out.println("Please Note: 0 means worst & 10 means Fabulus");
			System.out.print("STQA:");
			int stqa = s.nextInt();
			System.out.print("DWDM:");
			int dwdm = s.nextInt();
			System.out.print("KR&AI:");
			int krai = s.nextInt();
			System.out.print("CC:");
			int cc = s.nextInt();
			System.out.print("MAD:");
			int mad = s.nextInt();
			System.out.println();
			System.out.println();
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
			System.exit(0);
			break;
		case 4:
			System.out.println("Please give subject wise feedback to faculty with 0-10 ratings-");
			System.out.println("Please Note: 0 means worst & 10 means Fabulus");
			System.out.print("DevOps:");
			int devops= s.nextInt();
			System.out.print("PPM:");
			int ppm= s.nextInt();
			System.out.println();
			System.out.println();
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
			System.exit(0);
			break;
		default:
			System.out.println("Please Enter valid semester(1-4)");
			new Faculty();
		}
	}
}
