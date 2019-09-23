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
public class StrReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        reverse(scanner.nextLine());
        
    }
    public static void reverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.toCharArray()[i];
        }
        System.out.println(result);
    }
}
