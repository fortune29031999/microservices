 
package collections1;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(55);
		a.add(54);
		a.add(7);
		a.add(12);
		a.add(23);
		a.add(5);
		System.out.println(a);
		
		//set() is used to set the values in list
		a.set(3, 15);
		System.out.println(a);
		a.remove(4); // used to remove elements from the list
		System.out.println(a);
		//get is used o get the values;
		System.out.println(a.get(3));
		//size is used to calculate the length
		System.out.println(a.size());
		
		//add(index,integer) is used to add numbers in that position and memory shifting is occured like element in that palce is shifted to 5th position and so on.
		a.add(4,56);
		System.out.println(a);
		System.out.println("kiki");

	}

}
