package ua.skorobahatyi.games.sudoku;

public class ValidSudoku {
    private static final int SIZE=9;
    private static final int INDEX_ANSI_DIGIT=48;
    private static char[][] board1= {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};

    private static char[][] board2= {{'8','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};
    public static void main(String[] args) {
        int[][] board = convertToInt(board2);
        showBoard(board);
    }

    private static boolean isValidSudoku(char[][] board) {

        return false;
    }

    private static int[][] convertToInt(char[][] board) {

        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]!='.'){
                    arr[i][j]=board[i][j]-INDEX_ANSI_DIGIT;
                } else {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    private static void showBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }

    private static boolean checkBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

            }
            System.out.println();

        }
        return false;
    }


}
