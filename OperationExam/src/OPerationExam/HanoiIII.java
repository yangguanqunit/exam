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
public class HanoiIII {
    public static void main(String[] args){
        int[] count=new int[]{0};
        hanoi(12,'x','y','z',count);
        System.out.print(count[0]);
    }
    public static void move(int n,char x,char y,int[] count){
        count[0]++;
//        System.out.println(n+"."+x+"---->"+y);
    }
    
    public static void hanoi(int n,char x,char y,char z,int[] count){
        if(n==1){
            move(1,x,y,count);
            move(1,y,z,count);
        }
        else{
            hanoi(n-1, x, y, z,count);
            move(n,x,y,count);
            hanoi(n-1,z,y,x,count);
            move(n,y,z,count);
            hanoi(n-1,x,y,z,count);
        }
        
    }
    
}
