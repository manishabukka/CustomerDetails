package custimer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Registration  {
	static int count=0;
	
	public static User register()
	{
		
		System.out.println("enter the details "+count);
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		long acc=r.nextLong();
		
		
		User user = new User();
		user.setAccno(acc);
		
		user.setFirstname(sc.next());
		user.setPhno(sc.nextLong());
		user.setPassword(sc.nextLong());
		
		count++;
		
		return user;
	
	}
		public static void method()
		{
			ArrayList<User> list=new ArrayList<>();
			int t=1;
			for (int i = 0; i <=t; i++) 
			list.add(register());
			
		System.out.println("acc no:"+list.get(0).getAccno());
	//	System.out.println("acc no:"+list.get(0).getPassword());
		System.out.println(list);
		try {
			FileOutputStream fileOutputStream= new FileOutputStream("D://programs//Register.txt");
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
	

	public static void main(String[] args) {
		
		Registration r = new Registration();
		r.method();
			
		}



	}


