package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


class Solution {

    public boolean isValidBst(TreeNode node, Boolean result) {

        if (node != null && node.left == null && node.right == null)
            return result;

        if (node.left != null && node.left.val < node.val) {
            result = true;
            result = isValidBst(node.left, result);
        }else if(node.left != null && node.left.val > node.val){
            return false;
        }

        if (node.right != null && node.right.val > node.val) {
            result = true;
            result = isValidBst(node.right, result);
        }else if(node.right != null && node.right.val < node.val){
            return false;
        }

        return result;

    }

    public boolean isValidBST(TreeNode root) {

        return isValidBst(root, false);

    }
    public List<Integer> preorderTraversal(TreeNode node, List<Integer> list){

        if(node==null) {
            return list;
        }
        else if(node!=null && node.left==null && node.right==null)
        {
            list.add(node.val);
        }

        if(node!=null && node.left!=null){
            preorderTraversal( node.left, list);
        }
        if(node!=null && node.right!=null){
            preorderTraversal( node.right, list);
        }

        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list= new ArrayList<>();
        return preorderTraversal(root, list);

    }


}