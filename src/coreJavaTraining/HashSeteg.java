package coreJavaTraining;

import java.util.HashSet;
import java.util.Iterator;

public class HashSeteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("India");
		hs.add("He");
		hs.add("She");
		hs.add("India");
		//System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
