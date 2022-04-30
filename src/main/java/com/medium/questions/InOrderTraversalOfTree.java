package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalOfTree {
    public void in_order(TreeNode node, List<Integer> list){
        if(node== null) return;

        in_order(node.left, list);
        if(node!=null){
            list.add(node.val);
        }

        in_order(node.right,list);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        in_order(root, list);

        return list;
    }
}
