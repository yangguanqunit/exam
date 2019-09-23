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
public class Coincidence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        int len1=str1.length();
        int len2=str2.length();
        int[][] dp = new int[len1+1][len2+1];
        char[] str_1=str1.toCharArray();
        char[] str_2=str2.toCharArray();
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str_1[i-1]!=str_2[j-1]){
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
                else
                    dp[i][j]=dp[i-1][j-1]+1;
            }
        }
        System.out.print(dp[len1][len2]);
    }
    
}
