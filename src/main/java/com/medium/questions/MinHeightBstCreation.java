package com.medium.questions;

import java.util.*;

class MinHeightBstCreation {

    public static BST minHeightBst(List<Integer> array, BST bst, int startIdx, int endIdx) {

        int midIdx = (startIdx + endIdx) / 2;

        BST newBst = new BST(array.get(midIdx));
        if (bst == null) {
            newBst.insert(array.get(midIdx));
        } else {

            if (array.get(midIdx) < bst.value) {
                bst.left = newBst;
                bst = bst.left;
            } else {
                bst.left = newBst;
                bst = bst.right;
            }
        }
        minHeightBst(array, bst, startIdx,
                midIdx - 1);
        minHeightBst(array, bst, midIdx + 1,
                endIdx);
        return bst;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 5, 7, 10, 13, 14, 15});
        minHeightBst(list);
    }

    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        return minHeightBst(array, null, 0, array.size() - 1);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
