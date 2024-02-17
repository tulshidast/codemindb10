package b10.javapractices;

public class ArrayInJava {

	public static void main(String[] args) {

		// array declaration
		String a[];

		// declaration + initialization
		String ss[] = new String[4];

		// storing elements in array
		ss[0] = "sachin";
		ss[1] = "nitin";
		ss[2] = "ram";
		ss[3] = "ravi";

		// ss[4]="rohit";

		// how to access element from array

		ss[0] = "hardik";

		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);

		System.out.println("size of aaray= " + ss.length);

		System.out.println("#################################################");

		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// array declaration + initialization
		String s[] = { "Sachin", "nitin" };

		for (String sss : s) {
			System.out.println(sss);
		}

	}

}
