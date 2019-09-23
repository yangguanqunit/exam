/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class trailTree {

    public static void main(String[] args) {
        treeNode currency=null;
        int currencyValue=-1;
        int i=0;
        Scanner sca = new Scanner(System.in);
        int count = sca.nextInt();
        Scanner sca1 = new Scanner(System.in);
        String str = sca1.nextLine();
        ArrayList<Integer> numlist = new ArrayList<>();
        ArrayList<treeNode> nodelist = new ArrayList<>();
        for(String a:str.split(" ")){
            numlist.add(Integer.parseInt(a));
        }
        for(int a : numlist){
            treeNode treenode = new treeNode();
            treenode.setFather(currency);
            treenode.setValue(a);
            treenode.setLeftnode(null);
            treenode.setRightnode(null);
            nodelist.add(treenode);
        }
        nodelist.get(0).setFather(currency);
        treeNode root=nodelist.get(0);
        currency=root;
        for(treeNode treenode:nodelist){
            if(treenode.getValue()==root.getValue())
                continue;
            while(true){
                if(treenode.getValue()>currency.getValue()){
                    
                    if(currency.getRightnode()==null){
                        currency.setRightnode(treenode);
                        treenode.setFather(currency);
                        System.out.print(currency.getValue());
                        break;
                        
                    }
                    currency=currency.rightnode;
                    
                    
                    
                }
                else{
                    if(currency.getLeftnode()==null){
                        currency.setLeftnode(treenode);
                        treenode.setFather(currency);
                        System.out.print(currency.getValue());
                        break;
                        
                    }
                    currency=currency.leftnode;
                    
                }
            }
            
            
        }
        
        
        
        
    }
    
    public static void getTree(treeNode treenode,treeNode currency){
        if((currency!=null)){
            treenode.setFather(currency);
            if(currency.getValue()>treenode.getValue())
                getTree(treenode, currency.getLeftnode());
            else
                getTree(treenode, currency.getRightnode());
        }
        else{
            System.out.println(treenode.getFather().getValue());
            currency=treenode;
        }
    }

}

class treeNode {

    treeNode leftnode;
    treeNode rightnode;
    treeNode father;

    public treeNode getFather() {
        return father;
    }

    public void setFather(treeNode father) {
        this.father = father;
    }
    int value;

    public treeNode getLeftnode() {
        return leftnode;
    }

    public void setLeftnode(treeNode leftnode) {
        this.leftnode = leftnode;
    }

    public treeNode getRightnode() {
        return rightnode;
    }

    public void setRightnode(treeNode rightnode) {
        this.rightnode = rightnode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
