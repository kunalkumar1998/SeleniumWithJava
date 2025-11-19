package Java;

import java.util.Iterator;

import com.google.common.collect.Multiset.Entry;

;


public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 HashMap<Integer, String> hm = new HashMap<Integer,String>();
	        
	        hm.put(101, "kunal");
	        hm.put(103, "kumar");
	        
	     
		   hm.put(102,"Kunal");
		  hm.put(103,"Kunal");
		   hm.put(104,"Kunal");
		   
		   System.out.println(hm);
		   hm.remove(103);
		   System.out.println(hm.size());
		   System.out.println(hm.keySet());
	        System.out.println(hm.values());
	        System.out.println(hm.entrySet());
	        
	        
	        //for 
	        for(int k: hm.keySet()){
	            System.out.println(k + "   "+hm.get(k));
	        }
	        
	    Iterator<Entry<Integer,String>> it =hm.entrySet().iterator();
	        while(it.hasNext()){
	            Entry<Integer,String> entry = it.isnext();
	            System.out.println(entry.keySet() + "    "+entry.values());
	            
	        }
		
			}

}