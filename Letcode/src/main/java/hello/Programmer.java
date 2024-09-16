package hello;

class Employee{  
 float salary=40000;  
 float salary()
 {
	 return (2*salary);
 }
}  
public class Programmer extends Employee{  
 int bonus=10000;  
 float bonus()
 {
	 return salary +bonus;
 }
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
   System.out.println(p.bonus());
   System.out.println(p.salary());
   Employee p2 = new Programmer();
  System.out.println("second one" +  p2.salary());
  Employee p3 = new Employee();
  System.out.println( "third one" + p2.salary());
  
} 
} 

	
	  