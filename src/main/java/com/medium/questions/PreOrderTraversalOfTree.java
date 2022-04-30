package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalOfTree {
    public void preorderTraversal(TreeNode node, List<Integer> list){

        if(node==null) {
            return ;
        }
        if(node!=null){
            list.add(node.val);

        }
        preorderTraversal( node.left,  list);
        preorderTraversal( node.right, list);



    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list= new ArrayList<>();
        preorderTraversal(root, list);
        return list;

    }
}
