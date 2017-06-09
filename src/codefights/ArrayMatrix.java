package codefights;

public class ArrayMatrix {

	int matrixElementsSum(int[][] matrix) {
		int s = 0;
		for (int c = 0; c < matrix[0].length; ++c) // iterate over columns
			for (int r = 0; r < matrix.length; ++r) { // iterate over rows
				if (matrix[r][c] > 0)
					// add value if it is a non zero - returns to iterate over
					// the next row in the column
					s += matrix[r][c];
				// if not break out of the loop (and thereby cancel out any
				// other values in that column with a value of zero
				else {
					break;
				}
			}
		return s;
	}
}
