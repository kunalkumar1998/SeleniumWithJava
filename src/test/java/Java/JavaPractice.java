package Java;

public class JavaPractice {
	int age ;
	String name;
	
	
	// Methods 
	void Display() {
		System.out.println(age);
		System.out.println(name);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation
          JavaPractice obj = new JavaPractice();
          //invoke Methods and variable through object
          
          obj.age = 27;
          obj.name ="Kunal Kumar";
          obj.Display();
          
	}

}


