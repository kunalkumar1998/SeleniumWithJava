package Java;

public class thisAndStatic {

	 int x , y;
	 //static 
	 static int age;
	 //static 
	static void  Add(int x ,int y) {
		 System.out.println(x+y);
		 
	 }

	 thisAndStatic(int x, int y) {
		 this.x =x;
		 this.y =y;
		 
	 }
	  void display() {
		  System.out.println(x);
		  System.out.println(y);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          thisAndStatic th = new thisAndStatic(5,10);
          th.display();
          age =10;
          Add(10,6);
          
	}

}
