package com.easy.questions;

public class Question6 {
    public static int findClosestValueInBst(BST tree, int target) {
        int value = tree.value;
        if (target == value) return value;
        while (tree != null) {

            if (Math.abs(tree.value - target) < Math.abs(target - value)) {
                value = tree.value;
            }
            if (target > tree.value) {
                tree = tree.right;
            } else if (target < tree.value) {
                tree = tree.left;
            } else {
                break;
            }

        }
        return value;

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
