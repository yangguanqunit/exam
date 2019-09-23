package exam;

import java.util.Scanner;

public class Binarytree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] preorder = scanner.nextLine().toCharArray();
		char[] inorder = scanner.nextLine().toCharArray();
		Postorder(buildtree(0, preorder.length-1, 0, inorder.length-1, preorder, inorder));
	}
	
	public static void Postorder(node root) {
		if(root!=null) {
			Postorder(root.leftchild);
			Postorder(root.rightchild);
			System.out.print(root.value);
		}
	}
	
	public static node buildtree(int s1,int e1,int s2,int e2,char[] pre,char[] in) {
		node root = new node();
		char ch = pre[s1];
		root.value=ch;
		int index=0;
		for(int i=s2;i<=e2;i++)
			if(ch==in[i]) {
				index=i;
				break;
			}
		if(index!=s2)
			root.leftchild=buildtree(s1+1, s1+index-s2, s2, index-1, pre, in);
		if(index!=e2)
			root.rightchild=buildtree(s1+index-s2+1,e1, index+1, e2, pre, in);
		return root;
	}
	
	private static class node{
		char value;
		node leftchild;
		node rightchild;
	}

}
