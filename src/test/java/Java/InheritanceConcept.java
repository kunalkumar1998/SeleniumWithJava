package Java;

class dog {
	String petName;
	void Display() {
		System.out.println(petName);
		
		
		
	}
}
//Inheritance  //single inheritance 
class cat extends dog{
	String type;
	void Type() {
		System.out.println(type);
	}
}



public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		cat c =new cat();
		//cat object can invoke both methods
		c.petName= "Tocky";
		c.Display();
		c.type ="Dog";
		c.Type();
		

	}

}
