package exam;

import java.util.Scanner;

public class GCP {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	node root = build();
	System.out.println(lca(root,4,3).value);
	}
	public static node lca(node nodes,int p,int q) {
		if(nodes==null)
			return null;
		if(nodes.value==q||nodes.value==p)
			return nodes;
		node left = lca(nodes.leftchild,p,q);
		node right = lca(nodes.rightchild,p,q);
		if(left==null)
			return right;
		if(right==null)
			return left;
		return nodes;
					
	}
	public static node build() {
		int value = scanner.nextInt();
		if(value==-1)
			return null;
		node root = new node();
		root.value=value;
		root.leftchild=build();
		root.rightchild=build();
		return root;
	}
	
	private static class node{
		int value;
		node leftchild=null;
		node rightchild=null;
	}

}
