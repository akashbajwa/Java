package lab;
import java.util.Scanner;

public class Matrix{
    int rows; // attribs
    int cols;
    int [][]matrix;

    Matrix(int _rows, int _cols){

        rows = _rows;
        cols = _cols;

        matrix = new int[rows][cols];
    }
    int Getrows()
    {
        return rows;
    }
    int Getcols()
    {
        return cols;
    }

    public void Input()  //taking input from user
    {

        Scanner input =  new Scanner(System.in);// for input from user
        System.out.println("Enter Rows: ");

        rows = input.nextInt();
        System.out.println("Enter Column: ");

        cols = input.nextInt();
        matrix = new int[rows][cols]; // assigning memory
        System.out.println("    Enter Your Matrix   " + "Rows= " + rows +" Cols= " + cols );
        for (int  i = 0  ; i  < rows ; i++)
        {
            for(int j =  0 ; j < cols ; j++)
            {

                matrix[i][j] = input.nextInt();

            }
        }

    }

    public void Print() // printing matrix over console
    {
        System.out.println("Your Matrix:" );
        for (int  i = 0  ; i  < rows ; i++)
        {
            for(int j =  0 ; j < cols ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean SetAtIndex(int i, int j,int value) // setter
    {
        if(i <= rows && j <= cols)
        {
            matrix[i][j] = value;
            return true;
        }
        System.out.println("Index is out of order ");
        return false;
    }
    public boolean GetFromIndex(int i, int j)
    {
        if(i <= rows && j <= cols)
        {
            System.out.println("Value at (" + rows +"," +cols + ") is " +matrix[i][j]);
            return true;
        }
        System.out.println("Index is out of order ");
        return false;
    }
    public boolean Addition(Matrix obj) //Matrix addition
    {
        if(obj.rows == rows && obj.cols == cols)
        {
            for (int  i = 0  ; i  < rows ; i++)
            {
                for(int j =  0 ; j < cols ; j++)
                {
                    matrix[i][j] += obj.matrix[i][j];
                }
            }
            System.out.println("Addition: ");
            return true;
        }

        System.out.println("Matrices cannot be added!");
        return false;
    }
    public Matrix Multiplication(Matrix obj) // matrix mul.. Foo
    {

        Matrix obj2 = new Matrix(rows,obj.cols);

        for(int i = 0  ; i  < obj.cols ; i++)
        {
            for (int j = 0; j < rows; j++) {

                for (int k = 0; k < obj.rows ; k++) {

                    obj2.matrix[i][j]+=matrix[i][k]*obj.matrix[k][j];
                }
            }

        }

        return obj2;

    }

}