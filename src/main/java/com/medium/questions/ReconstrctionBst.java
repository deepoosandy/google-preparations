package com.medium.questions;

import java.util.*;

class ReconstrctionBst {
	static class BST {
		public int value;
		public BST left = null;
		public BST right = null;

		public BST(int value) {
			this.value = value;
		}
	}

	static class TreeInfo{
		public int rootIdx;
		public TreeInfo(int rootIdx){
			this.rootIdx=rootIdx;
		}
	}

	public BST reconstructBstFromRange(int lowerBound,
									   int upperBound,
									   List<Integer> preOrderTraversalValues,
									   TreeInfo currentSubtreeInfo){

		if(currentSubtreeInfo.rootIdx==preOrderTraversalValues.size())
			return null;

		int rootValue=
				preOrderTraversalValues.get(currentSubtreeInfo.rootIdx);

		if(rootValue < lowerBound || rootValue >=upperBound ) return null;


		currentSubtreeInfo.rootIdx+=1;


		BST leftSubtree=
				reconstructBstFromRange( lowerBound,
						rootValue,
						preOrderTraversalValues,
						currentSubtreeInfo);

		BST rightSubTree=
				reconstructBstFromRange( rootValue,
						upperBound,
						preOrderTraversalValues,
						currentSubtreeInfo);

		BST bst= new BST(rootValue);
		bst.left=leftSubtree;
		bst.right=rightSubTree;
		return bst;

	}


	public BST reconstructBst(List<Integer> preOrderTraversalValues) {
		TreeInfo treeInfo= new TreeInfo(0);

		return reconstructBstFromRange( Integer.MIN_VALUE,
				Integer.MAX_VALUE,
				preOrderTraversalValues,
				treeInfo);
	}
}
