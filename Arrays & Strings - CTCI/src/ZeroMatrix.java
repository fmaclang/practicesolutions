import java.util.*;

public class ZeroMatrix {

	public static int[][] zeroMatrix(int[][] matrix, int size){

		//find the zero in the matrix
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++)
				if(matrix[i][j] == 0)
					return setZero(matrix, i, j, size);

		return matrix;

	}

	public static int[][] setZero(int[][] matrix, int i, int j, int size) {

		//once zero is found in matrix, set whole row and column to 0
		for(int k=0; k<size; k++) {
			matrix[k][j] = 0;
			matrix[i][k] = 0;
		}

		return matrix;

	}

	public static void displayMatrix(int[][] matrix, int size){

		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int n = 3;
		int count = 0;
		int[][] matrix = new int[n][n];
		int[] list = {1,2,3,0,5,6,7,8,9};

		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				matrix[i][j] = list[count++];

		System.out.println("0)");
		displayMatrix(matrix, n);

		matrix = zeroMatrix(matrix, n);
		System.out.println();

		System.out.println("1)");
		displayMatrix(matrix, n);

	}

}
