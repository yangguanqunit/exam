/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Nsteps {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long[] count = new long[20];
        count[1]=1;
        count[2]=2;
        for(int i=3;i<20;i++){
            count[i]=count[i-1]+count[i-2];
        }
        System.out.print(count[scanner.nextInt()]);
        
    }
}
