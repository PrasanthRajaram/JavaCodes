package hello;

public class CallByValue {

	 
		 static int data=50;  
		  
		 int change(int data){  
		 data=data+100;//changes will be in the local variable only 
		 return data;
		 }  
		     
		 public static void main(String args[]){  
		   CallByValue op=new CallByValue();  
		  
		   System.out.println("before change "+op.data);
		   System.out.println(op.change(500));
		   int a= op.change(data)+5;
		   System.out.println(a);
		   System.out.println("after change "+op.data);
		 }
		}  