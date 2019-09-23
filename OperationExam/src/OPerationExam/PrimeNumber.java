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
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int boundary =(int)Math.sqrt(num)+1;
        boolean flag = false;
        if(num<=1)
            flag=!flag;
        for(int i=2;i<=boundary;i++){
            if(num%i==0){
                flag=!flag;
                break;
            }
        }
        System.out.print(flag?"no":"yes");
    }
}
