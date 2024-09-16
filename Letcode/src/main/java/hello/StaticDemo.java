package hello;

public class StaticDemo {
	 static int a=5;
	 static void win()
	{
		System.out.println("im going to win");
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a=0;
	
      StaticDemo sd = new StaticDemo();
      sd.win();
      System.out.println(a); 
      
	}

}
