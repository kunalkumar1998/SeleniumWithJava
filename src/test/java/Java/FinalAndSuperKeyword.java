package Java;
class finalKey{
	
	final int age =28;
	
	final void  m() {
		System.out.println("final keyword");
	}
	
	
}
class fin extends finalKey{
//	void m() {
//		System.out.println("Fibna== ");
//	}
}

public class FinalAndSuperKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          finalKey k = new finalKey();
   //       k.age= 29; assigned not possible
          k.m();
     //     k.m(1); can overide 
          
	}
}
