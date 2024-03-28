package collections1;

import java.util.ArrayList;

public class UsePhone {

	public static void main(String[] args) {
		Phone p= new Phone("samsung",45000,"black",2020,8.5f);
		System.out.println(p.toString());
		System.out.println();
		System.out.println(); 
		Phone p1= new Phone("nokia",45000,"orange",2010,8.5f);
		Phone p2= new Phone("oppo",23000,"blue",2024,6.0f);
		Phone p3= new Phone("vivo",16500,"yellow",2023,3.25f);
		Phone p4= new Phone("lava",27950,"red",2022,9.5f);
		Phone p5= new Phone("apple",150000,"white",2018,5.9f);
		Phone p6= new Phone("micromax",12000,"green",2015,2.0f);
		ArrayList<Phone>a=new ArrayList<>();
		ArrayList<Phone>z=new ArrayList<>();
		a.add(p);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		a.add(p6);
		a.forEach(x->System.out.println(x));
		System.out.println();
		System.out.println();
		for(Phone r:a) {
			System.out.println(r);
			
		}
		System.out.println();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getPrice()<30000) {
				System.out.println(a.get(i).getBrand());
				
				
			}
			
		}
		System.out.println();
		System.out.println();

		for(Phone c:a) {
			if(c.getColour().equalsIgnoreCase("Blue")) {
				c.setPrice(c.getPrice()+(c.getPrice()*10/100));
			}
		}
          a.forEach(x->System.out.println(x));

     a.forEach(x->{if(x.getBrand().startsWith("s")) {x.setColour(x.getColour().toUpperCase());}});
     System.out.println(a);
     
     for(Phone b:a) {
    	if(b.getEditionyear()>2020) {
    		z.add(b);
    	} 
    	  }
     System.out.println(z);
     
     a.forEach(x->{if(x.getEditionyear()>2020) {z.add(x);x.setBrand(x.getBrand().toUpperCase());}});
     System.out.println(z);
	}

}
