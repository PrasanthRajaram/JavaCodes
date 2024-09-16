package hello;

 
public class Inheritance2 extends Inheritance
	{
		void football()
		{
			System.out.println("football");
		}
	
	public static void main(String[] args) {
		
	
		Inheritance2 j = new Inheritance2();
		j.football();
		j.cricket();
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();
		Inheritance ih = new Inheritance();
		ih.cricket();
	}

	}
 class Inheritance {
	
	void sports() {
		System.out.println("game");
	}
	
	void cricket ()
	{
		System.out.println("cricket");
	}
}
