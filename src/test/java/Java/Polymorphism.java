package Java;


//polymorphism 
class Calculation{
	  
	  int a, b;
	  //function or method overloading is way to do polymorphism
	  
	  int sum () {
		  return a+b;
	  }
	  
	  int sum(int  x, int y) {
		  a =x;
		  b=y;
		  
		  return  a+b;                                                                                                                                                                          
	  }
	  
	  int sum(int a, int b, int c) {
		  return a+b+c;
	  }
}

public class Polymorphism {
	
	
	public static void main(String[] args) {
		//invoking object
		Calculation mycal = new Calculation();
		mycal.a = 7;
		mycal.b=9;
		mycal.sum();
		System.out.println(mycal.sum());
		mycal.sum(9, 10);
		System.out.println(mycal.sum(9,10));
		mycal.sum(10,20,30);
		System.out.println(mycal.sum(10,20,30));
		
	}
	
}