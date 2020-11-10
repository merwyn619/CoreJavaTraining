package coreJavaTraining;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Javatraining";
	    System.out.println(a.charAt(3));
	    System.out.println(a.indexOf("e"));
	    System.out.println(a.substring(2, 7));
	    System.out.println(a.substring(5));
	    System.out.println(a.concat("rahul teaches"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
	}

}
