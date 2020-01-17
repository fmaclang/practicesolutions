import java.util.*;
import java.util.concurrent.TimeUnit;

public class RotateMatrix {

	public static int[][] rotateMatrix(int[][] matrix, int size) {

		int[][] temp = new int[size][size];

		//simply copy the original matrix to the temp matrix, but bottom up
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++)
				temp[(size-1)-j][i] = matrix[i][j];

		return temp;

	}

	public static void displayMatrix(int[][] matrix, int size) {

		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Random rnd = new Random();
		int n = 3;
		int count = 0;
		int[][] matrix = new int[n][n];
		int[] list = {1,2,3,4,5,6,7,8,9};

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = list[count++];
			}
		}

		System.out.println("0)");
		displayMatrix(matrix, n);
		System.out.println();

		for(int i=0; i<5; i++) {
			System.out.println(i+1 + ")");
			matrix = rotateMatrix(matrix, n);
			displayMatrix(matrix, n);
			System.out.println();
		}

	}

}
