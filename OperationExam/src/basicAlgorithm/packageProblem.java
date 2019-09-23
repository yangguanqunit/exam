/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicAlgorithm;

import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class packageProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int space=scanner.nextInt();
        int n=scanner.nextInt();
        herb[] list = new herb[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new herb();
            list[i].cost=scanner.nextInt();
            list[i].value=scanner.nextInt();
        }
        
        int[][] dp = new int[100][1001];
        for(int i=1;i<=n;i++){
            for(int j=space;j>=list[i].cost;j--){
                dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-list[i].cost]+list[i].value);//不选的值或选择并找到能满足空间大小的前值
            }
            for(int j=list[i].cost-1;j>=0;j--){
                dp[i][j]=dp[i-1][j];//dp[i][j]   j剩余空间
            }
        }
        System.out.print(dp[n][space]);
    }
    public static class herb{
        int cost;
        int value;
    }
}
