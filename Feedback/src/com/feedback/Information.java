package com.feedback;

public class Information {
	public Information() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t-----------This is about my project --------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\n\nProject Name: ASM IBMR College Student Feedback System\r\n"
				+ "\r\n"
				+ "Description:  This student feedback system allows students of ASM IBMR College to provide constructive feedback on their faculty and campus facilities. The feedback collected will be used to improve the quality of education and enhance the overall student experience at the college.\r\n"
				+ "\r\n"
				+ "Developed By:  Rucha Mane.\r\n"
				+ "\r\n"
				+ "Developed For: ASM IBMR College");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		new Main();
	}
}
