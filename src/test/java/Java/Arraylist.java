package Java;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList mylist = new ArrayList();
		mylist.add(true);
		mylist.add("Kunal");
		mylist.add(37);
		mylist.add(null);
		mylist.add(null);
		mylist.add(37);
		
		
		//size of arraylist 
		System.out.println("Size :" +mylist.size());
		
		//get element of arraylist 
		System.out.println("Arraylist value at 3 index :"+mylist.get(3));
		
		
		//Accessing all elements
		
		for(int i =0 ; i< mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		
		//insert elemnt in arraylist
				mylist.add(2,"Raghav");
		
		//for enhances
		for ( Object list:mylist) {
			System.out.println(list);
		}
		//by iteration 
		Iterator<Object> it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		//print arraylist 
		System.out.println("print Arraylist :"+mylist);
		//removeall
		
		ArrayList<Integer>mylist2 =new ArrayList<Integer>();
		mylist2.add(2);
		mylist2.add(5);
		
		//remove all
		mylist.removeAll(mylist2);
		System.out.println(" Arraylist :" +mylist);
		
		
		//clear
		mylist.clear();
		System.out.println("Empty Arraylist :" +mylist.isEmpty());
		
		
	}

}