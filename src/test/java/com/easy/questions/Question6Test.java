
package com.easy.questions;

import org.junit.Test;

public class Question6Test {

    public Question6.BST createBSTData(int root) {
        Question6.BST bst = new Question6.BST(10);
        int[] arr = {10, 5, 5, 2, 1, 15, 13, 14, 22};
        int idx = 1;
        Question6.BST currentLeft = bst.left;
        Question6.BST currentRight = bst.right;


        while (idx != arr.length) {

            if(arr[idx] >= 10){
                Question6.BST right = new Question6.BST(arr[idx]);
                currentRight=right;
                currentRight=currentRight.right;
            }else{
                Question6.BST left = new Question6.BST(arr[idx]);
                currentLeft=left;
                currentLeft=currentLeft.left;
            }

            idx++;
        }

        return bst;
    }

    @Test
    public void test(){
        Question6.BST bst=createBSTData(10);
        System.out.println(bst);
    }
}


