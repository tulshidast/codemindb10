package b10.javapractices;

public class MultiDimentionalArray {

	public static void main(String[] args) {

//		int multi[][] = new int[2][3];
//
//		multi[0][0] = 10;
//		multi[0][1] = 20;
//		multi[0][2] = 30;
//
//		multi[1][0] = 40;
//		multi[1][1] = 40;
//		multi[1][2] = 80;

		int multi[][] = { { 10, 20, 30 }, { 40, 40, 80, 50 }, { 2, 4, 60 } };

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// this is used to get length of or number of rows
		System.out.println("rows= " + multi.length);

		// this is used to get number of columns from specific index row
		System.out.println("1 rows columns = " + multi[1].length);

		// changing value of index
		multi[1][1] = 90;

		// accessing value by using index
		System.out.println(multi[1][2]);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// printing by using for loop
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
