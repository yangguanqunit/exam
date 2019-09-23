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
public class LCM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a*b/gcd(a, b));
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    
}
