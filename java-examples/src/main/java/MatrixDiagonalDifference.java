
/*
given a square matrix , calculate the absolute difference between sum of its diagonals

1 2 3
4 5 6
9 8 9

left to right diagonal = 1 + 5 + 9 = 15
right to left diagonal = 3 + 5 + 9 = 17

Absolute difference = 15 - 17 = 2
 */

import java.util.Arrays;

public class MatrixDiagonalDifference {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 9;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        printMatrix(matrix);
        System.out.print("\n");
       // System.out.println("matrix = " + Arrays.deepToString(matrix));

        int result = diagonalDifference(matrix);
        System.out.println("result = " + result);
        int result1 = diagonalDifferenceSingleLoop(matrix);
        System.out.println("result1 = " + result1);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0; i< matrix.length; i++){
            System.out.print("\n");
            for(int j=0 ; j<matrix[i].length ;j++){
                System.out.print(matrix[i][j] +" ");
            }
        }
    }

    private static int diagonalDifference(int[][] matrix) {
        int leftToRightDiagolalLength = getLeftTorightDiagonalLength(matrix);
        //System.out.println("leftToRightDiagolalLength = " + leftToRightDiagolalLength);
        int rightToLeftDiagolalLength = getRightToLeftDiagonalLength(matrix);
        //System.out.println("rightToLeftDiagolalLength = " + rightToLeftDiagolalLength);
        return Math.abs(leftToRightDiagolalLength - rightToLeftDiagolalLength);
    }

    private static int getRightToLeftDiagonalLength(int[][] matrix) {
        int diagonalLength = 0;
        int i = 0;
        int j = matrix[0].length -1 ;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        while(i<rowLength && colLength >= 0){
            diagonalLength = diagonalLength + matrix[i][j];
            i =i+1;
            j= j-1;
        }
        return diagonalLength;
    }

    private static int getLeftTorightDiagonalLength(int[][] matrix) {
        int diagonalLength = 0;
        int i = 0;
        int j = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        while(i<rowLength && j <colLength){
            diagonalLength = diagonalLength + matrix[i][j];
            i =i+1;
            j= j+1;
        }
        return diagonalLength;
    }

    private static int diagonalDifferenceSingleLoop(int[][] matrix) {
        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        int rowSize = matrix.length;
        int colSize = matrix[0].length;


        int i = 0;
        int j = 0;
        int k = 0;
        int l = colSize -1;
        while( i< rowSize && j < colSize && k < rowSize && l >=0 ){
            leftToRightSum += matrix[i][j];
            rightToLeftSum += matrix[k][l];
            i++;
            j++;
            k++;
            l--;

        }
        return Math.abs(leftToRightSum-rightToLeftSum);
    }
}
