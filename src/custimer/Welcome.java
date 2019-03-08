package custimer;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 System.out.println("enter 1.Registration 2.Login");
 int choice= sc.nextInt();
 switch(choice)
 {
 
	 case 1:
		 Registration reg = new Registration();
		 
		 reg.method();
		 break;
	 case 2:
		 Login l = new Login();
		 l.setInfo();
		 break;
		 
		 
		 
		 }
 

	}

}
