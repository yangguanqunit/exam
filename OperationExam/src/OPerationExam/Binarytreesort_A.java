/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Binarytreesort_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        int n;
        String source;
        String sPreOrder;
        String sMidOrder;
        node root;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            if(n==0)
                break;
            scanner.nextLine();
            source=scanner.nextLine();
            for(int i=0;i<n;i++)
                strList.add(scanner.nextLine());
            sMidOrder="";
            sPreOrder="";
            root=null;
            for(char ch : source.toCharArray())
                root=insert(Integer.parseInt(ch+""), root);
            
            sPreOrder=pre(root, sPreOrder);
            sMidOrder=inOrder(root, sMidOrder);
            for(String str : strList){
                root=null;
                for(char ch : str.toCharArray())
                    root=insert(Integer.parseInt(ch+""), root);
                if(sPreOrder.equals(pre(root, ""))&&sMidOrder.equals(inOrder(root, "")))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            strList.clear();
                
            
        }
    }

    public static String pre(node nodes,String preStr) {
            
        if (nodes != null) {
            preStr=nodes.value+"";
            preStr+=pre(nodes.leftchild,preStr);
            preStr+=pre(nodes.rightchild,preStr);
            return preStr;
        }
        return "";
        
    }

    public static String inOrder(node nodes,String midStr) {

        if (nodes != null) {
            midStr=inOrder(nodes.leftchild,midStr);
            midStr+=nodes.value+"";
            midStr+=inOrder(nodes.rightchild,midStr);
            return midStr;
        }
        return "";
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
