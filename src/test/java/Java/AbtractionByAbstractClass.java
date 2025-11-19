package Java;

abstract class Math{
	abstract int add(int a, int b);
	
	int sub(int a, int b) {
		return a-b;

		
	}
}

public class AbtractionByAbstractClass extends Math {
     
    int add(int a, int b){
	return a+b;	
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbtractionByAbstractClass a = new AbtractionByAbstractClass();
        a.add(8, 6);
        System.out.println(  a.add(8, 6));
        a.sub(9,2);
        System.out.println(  a.sub(9, 2));
        
	}

}
