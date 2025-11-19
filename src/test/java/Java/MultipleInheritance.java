package Java;

//multiple inheritance example
interface I1{
	
	int x=10;
	void m1(); //abstract method
	
}

interface I2 {
	int y=12;
	void m2(); //abstract method
}

public class MultipleInheritance implements  I1, I2 {
	
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MultipleInheritance obj =new MultipleInheritance();
       obj.m1();
       obj.m2();
       
	}

}