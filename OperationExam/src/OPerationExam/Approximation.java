/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Approximation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int n;
        while((n=scanner.nextInt())!=0){
            for(int i=0;i<n;i++){
                numList.add(scanner.nextInt());
            }
            countApproximation(numList);
            numList.clear();
        }
    }
    
    public static void countApproximation(ArrayList<Integer> list){
        int count;
        for(int i : list){
            count=0;
            for(int j=1;j<Math.sqrt(i);j++){
                if(j*j==i)
                    count++;
                if(i%j==0)
                    count+=2;   
            }
            System.out.println(count);
        }
        
    }
}
