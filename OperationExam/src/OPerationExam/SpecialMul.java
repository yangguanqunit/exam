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
public class SpecialMul {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String str1=input.split(" ")[0];
        String str2=input.split(" ")[1];
        int result=0;
        for(char ch1 : str1.toCharArray()){
            for(char ch2 : str2.toCharArray()){
                result+=Integer.parseInt(ch1+"")*Integer.parseInt(ch2+"");
            }
        }
        System.out.print(result);
    }
    
}
