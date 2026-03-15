package Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {

        String arr[] = {"Bat","cat", "RAT", "cat","mat"};
        
        //convert array to arrayList
        ArrayList al = new ArrayList(Arrays.asList(arr));
        
        System.out.println(al);
        
        for(Object list : al){
            System.out.println(list);
        }
 }
}