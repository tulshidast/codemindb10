package b10.javapractices;

public class StringClassMethods {

	public static void main(String[] args) {

		String s = "Welcome to codemind";
		String s1 = "WelcomE to codemind";

		/*
		 * Returns the char value at thespecified index. An index ranges from 0 to
		 * length() - 1. The first char value of the sequenceis at index 0, the next at
		 * index 1,and so on, as for array indexing.
		 */

		char c = s.charAt(5);
		System.out.println(c);

		/*
		 * Compares two strings lexicographically.The comparison is based on the Unicode
		 * value of each character inthe strings. The character sequence represented by
		 * this String object is compared lexicographically to thecharacter sequence
		 * represented by the argument string. The result isa negative integer if this
		 * String objectlexicographically precedes the argument string. The result is
		 * apositive integer if this String object lexicographicallyfollows the argument
		 * string. The result is zero if the stringsare equal; compareTo returns 0
		 * exactly whenthe equals(Object) method would return true
		 */
		System.out.println(s.compareTo(s1));

		/*
		 * Compares two strings lexicographically, ignoring casedifferences. This method
		 * returns an integer whose sign is that ofcalling compareTo with case folded
		 * versions of the stringswhere case differences have been eliminated by calling
		 * Character.toLowerCase(Character.toUpperCase(int)) oneach Unicode code point.
		 */
		System.out.println(s.compareToIgnoreCase(s));

		// Concatenates the specified string to the end of this string.
		System.out.println(s.concat(" technology pune"));

		// Returns true if and only if this string contains the specified sequence of
		// char values
		System.out.println(s.contains("pune"));

		System.out.println(s.contains("to codemind"));

		// Tests if this string ends with the specified suffix.
		System.out.println(s.endsWith("to codemind"));

		/*
		 * Compares this string to the specified object. The result is true if and only
		 * if the argument is not null and is a String object that represents the same
		 * sequence of characters as this object.
		 */
		System.out.println(s.equals("Welcome to codemind"));

		/*
		 * Compares this String to another String, ignoring caseconsiderations. Two
		 * strings are considered equal ignoring case if theyare of the same length and
		 * corresponding Unicode code points in the twostrings are equal ignoring case.
		 */
		System.out.println(s.equalsIgnoreCase("WELCOME TO Codemind"));

		/*
		 * Returns the index within this string of the first occurrence ofthe specified
		 * character. If a character with value ch occurs in the character sequence
		 * represented bythis String object, then the index (in Unicodecode units) of
		 * the first such occurrence is returned.
		 */
		System.out.println(s.indexOf('m'));
		System.out.println(s.indexOf("to"));
		System.out.println(s.indexOf('m', 6));
		System.out.println(s.indexOf("mind", 6));

		// Returns the length of this string.
		System.out.println(s.length());

		// Returns true if, and only if, length() is 0.
		System.out.println(s.isEmpty());
		// String s3="";
		System.out.println("".isEmpty());

		/*
		 * Returns a string whose value is this string, with all leading and trailing
		 * space removed
		 */ System.out.println("     my name    is      ".trim());

		// Converts all of the characters in this String to upper case using the rules
		// of
		// the default locale
		System.out.println(s.toUpperCase());

		/*
		 * Converts all of the characters in this String to lower case using the rules
		 * of the default locale
		 */
		System.out.println(s.toLowerCase());

		// Converts this string to a new character array.
		char[] array = s.toCharArray();

		for (char cc : array) {
			System.out.println(cc);
		}

		/*
		 * Returns a string that is a substring of this string. The substring begins
		 * with the character at the specified index and extends to the end of this
		 * string.
		 */
		System.out.println(s.substring(8));

		/*
		 * Returns a string that is a substring of this string. The substring begins at
		 * the specified beginIndex and extends to the character at index endIndex - 1.
		 * Thus the length of the substring is endIndex-beginIndex.
		 */
		System.out.println(s.substring(0, 10));

	}

}
