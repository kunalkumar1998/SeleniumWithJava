package Java;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Collections;

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
		
		//Collections.sort()
		
		//clear
		mylist.clear();
		System.out.println("Empty Arraylist :" +mylist.isEmpty());
		
		

        ArrayList al = new ArrayList();
        
        al.add("x");
        al.add("y");
        al.add("a");
        al.add("b");
        al.add(4 ,"e");
        //sorting 
        Collections.sort(al);
        Collections.sort(al , Collections.reverseOrder());        
       System.out.println(al);
       //shuffle
     Collections.shuffle(al);
     System.out.println(al);
     
     //replace 
     al.set(2, "C");
     
     //isEmpy 
     al.isEmpty();
     System.out.println("list is Empty : " +al.isEmpty());
     
     //contains
     //#Search
     al.contains("e");
     System.out.println("E contains in list " + al.contains("e"));
     
     
     ArrayList al_dup = new ArrayList();
     al_dup.addAll(al);
            System.out.println(al_dup);
     al_dup.removeAll(al);
            System.out.println(al_dup);
		
		
	}

}