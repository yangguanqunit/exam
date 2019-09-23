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
public class FactorialOfN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] result = new int[1000];
        int flag=999;
        result[0]=1;
        for(;N>1;N--){
            multiple(N, result);
        }
        for(int i=999;i>=0;i--){
            if(result[i]!=0){
                flag=i;
                break;
            }
        }
        for(int i=flag;i>=0;i--){
            if(i!=flag){
                 System.out.print(String.format("%04d", result[i]));
            }
            else
                System.out.print(result[i]);
        }
    }
    
    public static void multiple(int n,int[] result){
        int carry=0;
        int index=0;
        int boundary = result.length;
        int tmp;
        for(int i=0;i<boundary;i++){
            tmp=result[i]*n+carry;
            result[index++] = tmp%10000;
            carry = tmp/10000;
        }
        if(carry!=0)
            result[index]=carry;
    }
    
}
