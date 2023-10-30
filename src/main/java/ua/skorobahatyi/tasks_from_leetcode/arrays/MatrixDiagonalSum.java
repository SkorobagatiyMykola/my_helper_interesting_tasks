package ua.skorobahatyi.tasks_from_leetcode.arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        diagonalSum(mat);
    }

    private static int diagonalSum(int[][] mat) {
        int sum=0;

        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[mat.length-1-i][i];
        }

        if (mat.length%2==1){
            int t=mat.length/2;
            sum-=mat[t][t];

        }

        System.out.println("Matrix diagonal sum is: " +sum);

        return sum;
    }
}
