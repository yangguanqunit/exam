/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

/**
 *
 * @author yangguanqun
 */
import java.util.ArrayList;
import java.util.Scanner;
public class BinaryTree_huake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        node root=null;
        for (int i = 0; i < n; i++) {
            root=insert(scanner.nextInt(), root);
        }
        
        pre(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static void pre(node nodes) {

        if (nodes != null) {
            System.out.print(nodes.value+" ");
            pre(nodes.leftchild);
            pre(nodes.rightchild);

        }
    }

    public static void inOrder(node nodes) {

        if (nodes != null) {
            inOrder(nodes.leftchild);
            System.out.print(nodes.value+" ");
            inOrder(nodes.rightchild);
        }
    }

    public static void postOrder(node nodes) {
        if (nodes != null) {
            postOrder(nodes.leftchild);
            postOrder(nodes.rightchild);
            System.out.print(nodes.value+" ");
        }
    }

    
    public static node insert(int value,node root){
        if(root==null){
            root = new node(value);
            return root;
        }
        else if(root.value>value){
            root.leftchild=insert(value, root.leftchild);
        }
        else if(root.value<value){
            root.rightchild=insert(value, root.rightchild);
        }
        return root;
    }

    private static class node {

        public int value = -1;
        public node leftchild = null;
        public node rightchild = null;
        public node(int value) {
            this.value = value;
        }
    }
}

