package exam;

import java.util.Scanner;

public class C_2017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] pre = scanner.nextLine().toCharArray();
		char[] in = scanner.nextLine().toCharArray();
		node root = build(0, pre.length-1, 0, in.length-1, pre, in);
		postOrder(root);
	}
	
	public static node build(int s1,int e1,int s2,int e2,char[] pre,char[] in) {
		
		char ch = pre[s1];
		node root = new node();
		root.value=ch;
		int index=0;
		for(int i=s2;i<=e2;i++) {
			if(ch==in[i]) {
				index=i;
				break;
			}
		}
		if(index!=s2)
			root.leftchild=build(s1+1,s1+index-s2 , s2, index-1, pre, in);
		if(index!=e2) {
			root.rightchild=build(s1+index-s2+1, e1, index+1, e2, pre, in);
		}
		return root;
	}
	public static void postOrder(node root) {
		if(root!=null) {
			postOrder(root.leftchild);
			postOrder(root.rightchild);
			System.out.print(root.value);
		}
	}
	
	
	private static class node{
		char value;
		node leftchild=null;
		node rightchild=null;
	}

}
