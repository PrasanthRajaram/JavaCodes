package hello;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		int b=0,c = 0,a;
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
	
		try {
			b=a/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Thread.sleep(5000);
		
		System.out.println(b);
		

	}

}
