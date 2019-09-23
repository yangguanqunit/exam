/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

/**
 *
 * @author yangguanqun
 */
public class PrimeRingProblem {
    static int[] prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37};
    static boolean[] hash = new boolean[22];
    static int[] ans = new int[22];
    public static void main(String[] args){
        ans[1]=1;
        for(int i=1;i<hash.length;i++){
            hash[i]=false;
        }
        DFS(1,6);
    }
    
    public static void check(int n){
        if(isPrime(ans[n]+ans[1])){
            for(int i=1;i<=n;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
    public static void DFS(int num,int n){
        if(num>1)
            if(!isPrime(ans[num]+ans[num-1]))
                return;
        if(num==n){
            check(n);
            return;
        }
        for(int i=2;i<=n;i++){
            if(!hash[i]){
                hash[i]=!hash[i];
                ans[num+1]=i;
                DFS(num+1,n);
                hash[i]=!hash[i];
            }
        }
        
    }
    
    public static boolean isPrime(int n){
        for(int i : prime){
            if(n==i)
                return true;
        }
        return false;
    }
    
}
