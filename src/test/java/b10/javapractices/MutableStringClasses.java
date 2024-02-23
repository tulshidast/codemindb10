package b10.javapractices;

public class MutableStringClasses {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Welcome to codemind");

		sb.append(" technology pune");

		System.out.println(sb);

		sb.reverse();

		System.out.println(sb);

		System.out.println("#################################################");

		StringBuilder sb1 = new StringBuilder("Welcome to codemind");

		sb1.append(" technology pune");

		System.out.println(sb1);

		sb1.reverse();

		System.out.println(sb1);

	}

}
