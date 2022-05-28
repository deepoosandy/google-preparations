package com.medium.questions;

import java.util.*;

class ReconstrctionBst {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
   int count=0;
		BST tree= new BST(preOrderTraversalValues.get(0));
		count++;
		BST latestTree= tree;
		while(count< preOrderTraversalValues.size()){
			int value=preOrderTraversalValues.get(count);
			count++;
			BST newBst= new BST(value);
			if(value < latestTree.value){
				 latestTree.left= newBst;
				latestTree=latestTree.left;
			}else{
				latestTree.right=newBst;
				latestTree=latestTree.right;
			}
			// latestTree= 
		}
		
    return tree;
  }
}
