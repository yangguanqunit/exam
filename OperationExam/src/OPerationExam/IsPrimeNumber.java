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
public class IsPrimeNumber {
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        boolean NULL = true;
        String result="";
        for(int i=2;i<end;i++){
            if(isPrime(i)&&(i%10==1||i%100==1||i%1000==1)){
                result+=i+" ";
                NULL=false;
            }
        }
        System.out.print(NULL?"-1":result.substring(0, result.length()-1));
    }
    public static boolean isPrime(int num){
        int boundary =(int)Math.sqrt(num)+1;
        boolean flag = true;
        if(num<=1)
            flag=!flag;
        for(int i=2;i<=boundary;i++){
            if(num%i==0){
                flag=!flag;
                break;
            }
        }
        return flag;
    }
    
}
