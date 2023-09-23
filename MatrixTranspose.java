import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of rows :" + " ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of cols :" + " ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[rows][cols];

        System.out.println("Enter Matrix Data :" + " ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("Your Matrix is :" + " ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        //System.out.println("Transponse of  Matrix is :" + " ");

        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transponse of  Matrix is :" + " ");

        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++)
            {
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
