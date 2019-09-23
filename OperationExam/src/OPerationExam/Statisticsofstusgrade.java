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
public class Statisticsofstusgrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int numList[]=new int[101];
        String result="";
        while((Integer.parseInt(scanner.nextLine()))!=0){
            for(String str : scanner.nextLine().split(" ")){
                numList[Integer.parseInt(str)]++;
            }
            result+=numList[Integer.parseInt(scanner.nextLine())]+" ";
            numList=new int[101];
        }
        
        for(String ch : result.split(" ")){
            System.out.println(ch);
        }   
    }
}
