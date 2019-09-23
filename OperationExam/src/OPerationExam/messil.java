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
public class messil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[n+1];
        int[] dp = new int[n+1];
        int tmax;
        for(int i=1;i<=n;i++){
            count[i]=scanner.nextInt();
        }
        for(int i=1;i<=n;i++){
            tmax=1;
            for(int j=1;j<i;j++){
                if(count[j]>count[i])
                    tmax=Math.max(tmax, dp[j]+1);
            }
            dp[i]=tmax;
        }
        tmax=1;
        for(int i=1;i<=n;i++){
            tmax=Math.max(tmax, dp[i]);
        }
        System.out.print(tmax);
    }
    
}
