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
public class binarySearchTree {
    public static void main(String[] args){
        
    }
    
    
    
    public static node build(node nodes,int value){
        if(nodes==null){
            nodes = new node(value);
            return nodes;
        }
        else if(nodes.value>value){
            nodes.leftchild=build(nodes.leftchild, value);
        }else if(nodes.value<value){
            nodes.rightchild=build(nodes.leftchild, value);
        }
        return nodes;
        
    }
    
    private static class node{
        node leftchild=null;
        node rightchild=null;
        int value;
        public node(int value) {
            this.value = value;
        }
    }
    
}
