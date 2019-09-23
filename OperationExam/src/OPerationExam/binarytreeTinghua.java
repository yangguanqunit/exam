/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

//import static OPerationExam.Binarytreesort.inOrder;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class binarytreeTinghua {
    static int num;
    {num=0;}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.nextLine().toCharArray();
        node root=new node(str[0]);
        int end = str.length;
        builtTree(str, root,end);
//        System.out.print(root.value);
        InOrder(root);
//        System.out.print(root.value);
    }
    
    public static void InOrder(node nodes){
        if(nodes!=null){
            InOrder(nodes.leftchild);
            System.out.print(nodes.value);
            InOrder(nodes.rightchild);
        }
        
    }
    
    public static void builtTree(char ch[],node nodes,int end){
        
        if(num==end){
            return;
        }
        num++;
        if(ch[num]=='#'){
        }
        else
        {
            builtTree(ch, nodes.leftchild = new node(ch[num]),end);
            builtTree(ch, nodes.rightchild= new node(ch[num]),end);
        }
    }
    
    public static class node{
        char value;
        node leftchild=null;
        node rightchild=null;
        public node(char value) {
            this.value = value;
        }
        
    }
    
}
