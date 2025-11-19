package Java;

class Encaps{
	
	 private int age;
	 private String name;
	 private double salary;
	 
	 void setAge(int age){
		 this.age = age;
		 
	 }
		
	int getAge() {
		return age;
		
	}
		
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
		
	}
		void setSalary(double salary) {
			this.salary =salary;
			
		}
		
		double getSalary() {
			return  salary;
			
		}
	}


	public class Encapsulation {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encaps en =new Encaps();
			en.setName("Kunal Kumar");
			en.getName();
			System.out.println("Your name : "+en.getName());
			en.setAge(27);
			en.getAge();
			System.out.println("Your Age is : "+en.getAge());
		    en.setSalary(1000000);
		    en.getSalary();
		    System.out.println("Your Salary is : " + en.getSalary() +" per month");
					

		}

	}
