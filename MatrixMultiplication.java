
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of rows in First Matrix:" +" ");
        int rowInFirst = sc.nextInt();

        System.out.print("Enter No. of cols in First Matrix and No. of rows in First:" +" ");
        int colsInFirstrowsInSecond = sc.nextInt();

        System.out.print("Enter Number of cols in Second Matrix:" +" ");
        int colsInSecond = sc.nextInt();

        //defining Matrix now

        int[][] matrix1 = new int[rowInFirst][colsInFirstrowsInSecond];
        int[][] matrix2 = new int[colsInFirstrowsInSecond][colsInSecond];
        int[][] product = new int[rowInFirst][colsInSecond];

        System.out.println("Enter Matrix1 data"+" ");

        for(int i=0;i<rowInFirst;i++){
            for(int j=0;j<colsInFirstrowsInSecond;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix2 data"+" ");

        for(int i=0;i<colsInFirstrowsInSecond;i++){
            for(int j=0;j<colsInSecond;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix1 is =  "+ " ");

        for(int i=0;i<rowInFirst;i++){
            for(int j=0;j<colsInFirstrowsInSecond;j++){
                System.out.print(matrix1[i][j] +"\t");


            }
            System.out.println();
        }

        System.out.println("Matrix2 is =  "+ " ");

        for(int i=0;i<colsInFirstrowsInSecond;i++){
            for(int j=0;j<colsInSecond;j++){
                System.out.print(matrix2[i][j] +"\t");


            }
            System.out.println();
        }
        System.out.println("Product is =  "+ " ");

        for(int i=0;i<rowInFirst;i++)
        {
            for(int j=0;j<colsInSecond;j++){
                for (int k=0;k<colsInFirstrowsInSecond;k++){
                    product[i][j] += matrix1[i][k] * matrix2[k][j];

                }
                System.out.print(product[i][j] +"\t");

            }

            System.out.println();


    }
        /*for(int i=0;i<rowInFirst;i++)
        {
            for(int j=0;j<colsInSecond;j++)
            {
                System.out.print(product[i][j] +"\t");
            }
            System.out.println();
        }
*/
}}


