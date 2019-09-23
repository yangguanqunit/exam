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
public class ArrayOfchorus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] height = new int[N+1];
        int[] dp;
        int tmax;
        int lmax;
        int rmax;
        int result=0;
        for (int i = 1; i <= N; i++) {
            height[i] = scanner.nextInt();
        }
        for (int middle=2;middle<N;middle++ ) {
            dp=new int[N+1];
            lmax=0;
            rmax=1;
            for (int i = 1; i < middle; i++) {
                tmax = 1;
                for (int j = 1; j < i; j++) {
                    if (height[j] < height[i]) {
                        tmax = Math.max(tmax, dp[j] + 1);
                    }
                }
                dp[i] = tmax;
            }
            for(int i=1;i<middle;i++){
                if(height[i]<height[middle]&&dp[i]>lmax)
                    lmax=dp[i];
            }
            for (int i = middle+1; i <= N; i++) {
                if(height[i]>height[middle])
                    continue;
                tmax = 1;
                for (int j = middle+1; j < i; j++) {
                    if (height[j] > height[i]) {
                        tmax = Math.max(tmax, dp[j] + 1);
                    }
                }
                dp[i] = tmax;
            }
            for(int i=middle+1;i<=N;i++){
                if(dp[i]>rmax){
                    rmax=dp[i];
                }
            }
            if(result<rmax+lmax){
                result=rmax+lmax+1;
                System.out.println(lmax+" "+rmax);
            }
        }
        System.out.print(N-result);

    }
}
