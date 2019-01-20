package Lab2;

public class Lab02Matrix {
	// switches opposing rows
	public static void switchRows(int[][] anArray) {
		for (int i = 0; i < anArray.length / 2.0; i++) {
			for (int k = 0; k < anArray[i].length; k++) {
				// calculation goes through each value in a row and sets it to
				// the opposing row
				int temp = anArray[i][k];
				anArray[i][k] = anArray[anArray.length - i - 1][k];
				anArray[anArray.length - i - 1][k] = temp;
			}
		}
	}

	public static void switchColumns(char[][] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			for (int k = 0; k < anArray[i].length / 2; k++) {
				char temp = anArray[i][k];
				anArray[i][k] = anArray[i][anArray[i].length - k - 1];
				anArray[i][anArray[i].length - k - 1] = temp;
			}
		}
	}
}
