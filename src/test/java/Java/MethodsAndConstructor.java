package Java;

public class MethodsAndConstructor {

	 private static final String Kunal = null;
	 int age ; 
	 String name ;
	 char grade;
	 float salary;
	 
	 //methods
	
	//No parameter No return
	void MethodName () {
		System.out.println("Method with no return and no parameter");
		
	}
	//method with return value but no parameter 
	String Method() {
		return("Hello World");
	}
	
	//take parameter but no return value 
	void MethodNoReturn (int age) {
		System.out.println("Your Age "+age);
	}
	
	//Take parameter and return 
	String MethodWithParamAndReturn (String Name) {
		
		return(Name);
	}
	
	//Constructor 
	//Constructor are two types default and Parameterized Constructor 
	 MethodsAndConstructor () { //default 
		 age = 28;
		 name ="Raghav Raj";
		 grade = 'C';
		 salary =(float) 70.09; 
	 }
	 
	 //Parameterized Constructor 
	 MethodsAndConstructor(int age, String name, char grade , float salary){
		 
		 this.age =age;
		 this.name = name;
		 this.grade =grade;
		 this.salary =salary;
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 void Display() {
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(grade);
		 System.out.println(salary);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAndConstructor mth = new MethodsAndConstructor();
		String s = mth.Method();
		System.out.println(s);
		mth.MethodName();
		mth.MethodNoReturn(25);
		String s1 = mth.MethodWithParamAndReturn("Kunal");
		System.out.println(s1);
		
		MethodsAndConstructor m = new MethodsAndConstructor();
		m.Display();
      MethodsAndConstructor mm = new MethodsAndConstructor(27,"un", 'p', (float) 29.98);
      mm.Display();
	}

}