package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

// end to take care of edage case which is if sr==er
// and sc== ec
public class SpiralOrderingOf2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}

        };
        int sc = 0;
        int ec = arr[0].length - 1;
        int sr = 0;
        int er = arr.length - 1;
        List<Integer> result = new ArrayList<>();
       // printAllElements(arr, sc, ec, sr, er, result);
        System.out.println(useWhileLoop(arr));
    }

    public static void printAllElements(int[][] array, int sc, int ec, int sr, int er, List<Integer> result) {
        if (sc > ec || sr > er)
            return;

        for (int i = sc; i <= ec; i++) {
            System.out.print(" " + array[sr][i]);
            result.add(array[sr][i]);
        }

        for (int i = sr + 1; i <= er; i++) {
            System.out.print(" " + array[i][ec]);
            result.add(array[i][ec]);
        }
        for (int i = ec - 1; i >= sc; i--) {
            System.out.print(" " + array[er][i]);
            result.add(array[er][i]);
        }

        for (int i = er - 1; i > sr; i--) {
            System.out.print(" " + array[i][sc]);
            result.add(array[i][sc]);
        }

        //if(sc < ec || sr < er){
        sc++;
        ec--;
        sr++;
        er--;

        printAllElements(array, sc, ec, sr, er, result);
        //  return;
        // }

    }
    public static List<Integer> useWhileLoop(int[][] array){
        List<Integer> result= new ArrayList<>();
        int startRow=0;
        int endRow= array.length-1;
        int startCol=0;
        int endCol=array[0].length-1;
        while (startCol<= endCol && startRow <= endRow){
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(" " + array[startRow][i]);
                result.add(array[startRow][i]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(" " + array[i][endCol]);
                result.add(array[i][endCol]);
            }
            for (int i = endCol -1; i >=startCol; i--) {
                if(startRow==endRow)break;
                System.out.print(" " + array[endRow][i]);
                result.add(array[endRow][i]);
            }

            for (int i = endRow -1; i >startRow; i--) {
                if(startCol==endCol)break;
                System.out.print(" " + array[i][startCol]);
                result.add(array[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return  result;
    }
}
