package hello;

		class DynamicBinding2{  
			 void eat(){System.out.println("animal is eating...");}  
			 
			 void rice() {
				 System.out.println("rice vegie");
				 }
			}  
			  
			public class DynamicBinding extends DynamicBinding2 {  
			 void eat(){System.out.println("dog is eating...");
			 }
			 void rice() {
			 System.out.println("rice fruits");
			 }
			   
			  
			 public static void main(String args[]){  
			  DynamicBinding2 a=new DynamicBinding();  
			  a.eat(); 
			  a.rice();
			   
			 }  
			}  

	


