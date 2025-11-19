package Java;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper class used for store data in object format and convert data from one format to another format
        //string to int 
		String s1 ="10";
		String s2 = "20";
		
		int a= Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("convert string to int :" + Integer.parseInt(s1) +Integer.parseInt(s2) );
		
		System.out.println(a+b);
		
		//string to double
		String a1 = "23.98";
		String a2 = "27.45";
		
		System.out.println(a1+a2);
		
		//convert to double from string
		double d = Double.parseDouble(a1);
		double e = Double.parseDouble(a2);
		System.out.println("After converting to double Sum is : " + (d+e));
		
		//String to boolean
		String s = "false";
		
		boolean bool = Boolean.parseBoolean(s);
		System.out.println("cONVERT TO BOOLEAN " + s);
		
		// convert all primitive data type to string format
		int a3 =10;
		double d4 = 23.44;
		boolean bool1 =true;
		char c = 'p';
		
		//stringMethod
		String intval = String.valueOf(a3);
		System.out.println("Convert int to string :" +a3);
		
		String doublval = String.valueOf(d4);
		System.out.println("Convert double to string :" +d4);
		
		String booleanval = String.valueOf(bool1);
		System.out.println("Conevert bool to string :" +bool1);
		
		String charval =String.valueOf(c);
		System.out.println("Convert char to string:" + charval);
		
		
	
		
	}

}
