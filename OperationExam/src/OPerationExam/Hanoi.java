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
public class Hanoi {
    public static void main(String[] args){
        hanoi(3,'x','y','z');
    }
    public static void move(char x,int n,char y){
        System.out.println(n+"."+x+"---->"+y);
        
    }
    public static void hanoi(int n,char x,char y,char z){
        if(n==1)
            move(x,1,z);
        else{
            hanoi(n-1,x,z,y);
            move(x,n,z);
            hanoi(n-1,y,x,z);
        }
    }
}
