package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalOfTree {
    public void post_order(TreeNode node, List<Integer> list){
        if(node== null) return;

        post_order(node.left, list);
        post_order(node.right, list);

        if(node!=null){
            list.add(node.val);
        }

    }
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list= new ArrayList<>();

        post_order(root,  list);
        return list;

    }
}
