package hello;


class MethodOverriding{
	void current()
	{
		System.out.println("temper");
	}
}

public class MethodOverloading extends MethodOverriding{
	 void current() {
		System.out.println("temp"); 
	 }
	 void current(int a)
	 {
		 System.out.println("temperature");
	 }
	 

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
         mo.current(5);
         mo.current();
         
         
	}

}
