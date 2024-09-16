package hello;


class Animals{  
			String color="white";
			int s= 5;
			
			}  
			class Dogs extends Animals{  
			String color="black";  
			void printColor(){  
			System.out.println(color);//prints color of Dog class  
			System.out.println(super.color);//prints color of Animal class  
			}  
			}  
			
			
			public  class Superkeyword{  
			public static void main(String args[]){  
			Dogs d=new Dogs();  
			d.printColor();  
			Animals a = new Animals();
			
			System.out.println(a.color + a.s);
			
			}
			} 
	


