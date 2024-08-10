package org.algo.mania.array;

import java.util.HashSet;
import java.util.Set;


public class IsValidSudoku_LC_36 {
    public static void main(String[] args) {

        System.out.println(1 / 3);
        System.out.println();
        IsValidSudoku_LC_36 isValidSudokuLc366 = new IsValidSudoku_LC_36();

        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        System.out.println(isValidSudokuLc366.isValidSudoku(board));
    }


    private boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!set.add("row " + i + "having val " + board[i][j]) ||
                            !set.add("col " + i + "having val " + board[i][j]) ||
                            !set.add("Box " + i + "-" + j + "having val " + board[i][j])) {
                        return false;
                    }
                }
            }
        }

        return true;

    }

}
