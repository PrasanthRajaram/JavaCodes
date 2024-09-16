package hello;



	
 class Bike9{  
		int speedlimit=90;//final variable  
		 void run1(){  
		  speedlimit=400;  
		 }  
		 
		  
	} 
		 
		 
		 class Bike{  
			 void run(){System.out.println("running");}  
			}  
			     
		 public class Finalkeyword extends Bike{  
			   void run(){System.out.println("running safely with 100kmph");}  
			     
			   public static void main(String args[]){  
				   Finalkeyword honda= new Finalkeyword();  
			   honda.run(); 
			  
			   
			   }
			}  
			
			
			
			class Bike1{
				
			}  
			  
			class Honda1 extends Bike1{  
			  void run2(){
				  System.out.println("running safely with 100kmph");
				  }  
			    
			  
			 
			}
		 
			

