import java.util.Scanner;

public class MatrixAddition
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:" + " ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols:" + " ");
        int cols = sc.nextInt();

        //defining array of elements

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] sub = new int[rows][cols];

        System.out.println("Enter matrix1 Data" + " ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix2 Data" + " ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix1 is " + " ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                System.out.print(matrix1[i][j]+ "\t");
            }
            System.out.println();
        }

        System.out.println("Your matrix2 is " + " ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                System.out.print(matrix2[i][j]+ "\t");
            }
            System.out.println();
        }

        System.out.println("Sum of both matrix");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                sum[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Sub of both matrix");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {

                sub[i][j] = matrix1[i][j]-matrix2[i][j];
                System.out.print(sub[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
