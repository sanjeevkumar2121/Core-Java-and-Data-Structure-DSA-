import java.util.Scanner;

public class MatrixCreation
{

    public static void main(String[] args)
    {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter number of rows:"+" ");

        int row = sc.nextInt();

        System.out.print("Enter number of col:"+" ");

        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter Matrix Data :" + " ");

        for(int i=0;i<row;i++)
        {
            for(int j = 0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j = 0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
