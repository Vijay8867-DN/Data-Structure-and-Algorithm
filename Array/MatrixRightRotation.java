package Array;

public class MatrixRightRotation {

	public static void rightRotate(int[][] matrix) {
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=2; j>=0; j--) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void leftRotate(int[][] matrix) {
		
		for(int i=2; i>=0; i--) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rightRotate(matrix);
		System.out.println();
		leftRotate(matrix);
	}
}
