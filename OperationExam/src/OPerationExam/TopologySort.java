/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author yangguanqun
 */
public class TopologySort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] inDegree=new int[50];
        int[][] edges=new int[50][50];
        Queue<Integer> s = new ArrayBlockingQueue(50);
        int n,m,tmp;
        int count=0;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            m=scanner.nextInt();
            if(n+m==0)
                break;
            inDegree[m]++;
            edges[n][m]=1;
            count++;
        }
        inDegree[0]=-1;
        for(int i=0;i<=count;i++){
            if(inDegree[i]==0){
                s.offer(i);
                inDegree[i]=-1;
            }
        }
        while(!s.isEmpty()){
            tmp=s.poll();
            System.out.print(tmp+" ");
            for(int i=0;i<=count;i++){
                if(edges[tmp][i]==1){
                    inDegree[i]--;
                }
            }
            for(int j=0;j<=count;j++){
                if(inDegree[j]==0){
                    s.offer(j);
                    inDegree[j]=-1;
                }
            }   
        }
        
        
        
    }
    
}
