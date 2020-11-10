package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		a.add("Merwyn");
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(1);
		a.remove("Java");
		System.out.println(a);*/
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Merwyn"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
