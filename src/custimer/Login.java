package custimer;

import java.io.*;
import java.util.*;

public class Login {
	static int count = 1;

	public static void setInfo() {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter login details" + count);
		System.out.println("enter ac");
		long t1=sc.nextLong();
		System.out.println("enter pwd");
		long t2=sc.nextLong();
		count++;
		

	


		
		try {
			FileInputStream file = new FileInputStream("D://programs//Register.txt");
			ObjectInputStream out = new ObjectInputStream(file);
			ArrayList<User> userlist2 = (ArrayList<User>) out.readObject();
			int t = userlist2.size();
			

			// System.out.println(t1+" "+t2);
			for (int i = 0; i < t; i++) {
				//System.out.println(userlist2.get(i).getAccno() + " " + t1);
				//System.out.println(userlist2.get(i).getPassword() + " " + t2);
				if (userlist2.get(i).getAccno() == t1) {
					if (userlist2.get(i).getPassword() == t2) {
						System.out.println("Banking Process Initiated");
					}
					else{
						System.out.println("password is incorrect");
					}
				} else {
					System.out.println("Not a registered user");
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String args[]) {
		Login l = new Login();
		l.setInfo();
	}
}
