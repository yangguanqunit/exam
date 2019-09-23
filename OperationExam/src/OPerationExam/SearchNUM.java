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
public class SearchNUM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int n = scanner.nextInt();
        int[] targetnum = new int[n];
        for(int i=0;i<n;i++){
            targetnum[i]=scanner.nextInt();
        }
        int m =scanner.nextInt();
        int[] sourcenum = new int[m];
        for(int j=0;j<m;j++){
            sourcenum[j]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            flag=false;
            for(int j=0;j<n;j++){
                if(sourcenum[i]==targetnum[j]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
