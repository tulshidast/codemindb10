package b10.javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringPrograms {

	public static void main(String[] args) {

		// reverse a given String
		String s = "Welcome to codemind";// dnimedoc ot emocleW
		String s2 = "";
		for (int i = (s.length() - 1); i >= 0; i--) {

			s2 = s2 + s.charAt(i);

			// System.out.print(s.charAt(i));
		}

		System.out.println(s2);

		// Word reverse
		// emocleW ot dnimedoc

		String array[] = s.split(" ");
		String s4 = "";
		for (String s3 : array) {

			for (int i = (s3.length() - 1); i >= 0; i--) {

				s4 = s4 + s3.charAt(i);
			}
			s4 = s4 + " ";

		}

		System.out.println(s4.trim());

		// find only digits and do addition of digits
		String s5 = "@##$#$#$#sfsdffd2423fgdfgd @#$@#$dfdffd6u67";// 9

		String s6 = s5.replaceAll("[^0-9]", "");// 2423667

		int add = 0;

		for (int i = 0; i < s6.length(); i++) {

			int num = Character.getNumericValue(s6.charAt(i));

			add = add + num;
		}

		char arr[] = s.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!(map.containsKey(arr[i]))) {
				map.put(arr[i], 0);
			}

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		Set<Entry<Character, Integer>> mm = map.entrySet();
		for (Entry<Character, Integer> e : mm) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
