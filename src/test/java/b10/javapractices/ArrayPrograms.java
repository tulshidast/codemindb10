package b10.javapractices;

public class ArrayPrograms {

	public static void main(String[] args) {

		int numbers[] = { 12, 45, 0, 45, 7, 8, 34, 564, 47 };

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}

		}

		for (int a : numbers) {
			System.out.println(a);
		}

		System.out.println("#######################################################");

		char chars[] = { 'a', 'b', 'C', 'z', 'k', 'd' };

		for (int i = 0; i < chars.length; i++) {

			for (int j = i + 1; j < chars.length; j++) {

				if (chars[i] > chars[j]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}

		for (char a : chars) {
			System.out.println(a);
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
																			

	}

}
