package collections1;

import java.util.ArrayList;

public class Arraylistloopings {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(55);
		a.add(54);
		a.add(7);
		a.add(12);
		a.add(23);
		a.add(5);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println();
		System.out.println();

		
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2!=0) {
				System.out.println(a.get(i));
				}
			else {
				System.out.println("no");
			}
		}
		
		for(Integer b:a) {
			System.out.println(b);
		}
		System.out.println();
		System.out.println();
		System.out.println();


  //For each looping -> lambda expression symbol
		a.forEach(x->System.out.println(x));
		a.forEach(y->{if(y%2==0) {System.out.println(y);}else {System.out.println("no");}});
	}

}
