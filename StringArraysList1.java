package collections1;

import java.util.ArrayList;

public class StringArraysList1 {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		a.add("praveen");
		a.add("john");
		a.add("smith");
		a.add("jason");
		a.add("katy");
		a.add("sky");
		System.out.println(a);
		a.forEach(x->{if(x.startsWith("s")) {System.out.println(x);}});
		
 String max=a.get(0);
        for(String b:a) {
        	if(b.length()>max.length()) {
        		max=b;
        	}
        }
        System.out.println(max);
        System.out.println();
        
        for(String b:a) {
        	if(b.contains("a")||b.contains("e")||b.contains("i")||b.contains("o")||b.contains("u")) {
        		System.out.println(b);
        	}
        }
	}

}
