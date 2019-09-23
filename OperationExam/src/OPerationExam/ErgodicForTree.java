package OPerationExam;

import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class ErgodicForTree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] pre = scanner.nextLine().toCharArray();
        char[] mid = scanner.nextLine().toCharArray();
        postOrder(build(0, pre.length-1, 0, mid.length-1, pre, mid));
    }
    
    public static void postOrder(node nodes){
        if(nodes.leftchild!=null)
            postOrder(nodes.leftchild);
        if(nodes.rightchild!=null)
            postOrder(nodes.rightchild);
        System.out.print(nodes.value);
    }
    
    public static node build(int s1,int e1,int s2,int e2,char[] pre,char[] mid){
        node root=new node();
        int index=-1;
        root.value=pre[s1];
        for(int i=s2;i<=e2;i++){
            if(pre[s1]==mid[i]){
                index=i;
            }
        }
        if(index!=s2){
            root.leftchild=build(s1+1,s1+index-s2 , s2, index-1, pre, mid);
        }
        if(index!=e2){
            root.rightchild=build(s1+index-s2+1, e1, index+1, e2, pre, mid);
        }
        return root;
    }
    
    private static class node{
        node leftchild=null;
        node rightchild=null;
        char value;
    }
    
}
