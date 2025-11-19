package Java;

interface Shape{
	static int a =20 ;
	static int x= 98;
	
	void circle(); // 
	
	static void rectangle() {
		System.out.println("rectangle");
	}
	
	default void Square() {
		System.out.println("Square");
	}
	
}



public class InterfaceConcept implements Shape {
    public  void circle(){
    	 System.out.println("Abstract merthod");
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           InterfaceConcept i =new InterfaceConcept();
           i.circle();
           i.Square();
           Shape.rectangle();
           
           Shape sh = new InterfaceConcept(); // interface object and initiaties Class
           sh.circle();
           sh.Square();
           Shape.rectangle();
        
            
           
	}

}