/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Deputy {
    public static void main(String[] args){
        List<String> target = new ArrayList<>();
        List<String> local = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String space = scanner.nextLine();
        for(int i=0;i<n;i++)
            local.add(scanner.nextLine());
        int m =scanner.nextInt();
        space = scanner.nextLine();
        for(int i=0;i<m;i++)
            target.add(scanner.nextLine());
        minSwitch(target, local, 0);
    }
    public static void minSwitch(List<String> target,List<String> local,int times){
        if((local.size()==1)&&(target.contains(local.get(0)))){
            System.out.print("-1");
            return;
        }
        int index=0;
        for(String LOCAL : local){
            if(!target.contains(LOCAL)){
                System.out.print(times);
                return;
            }
            else if(index<target.indexOf(LOCAL)){
                index=target.indexOf(LOCAL);
            }
        }
        minSwitch(target.subList(index+1, target.size()), local, ++times);
        
    }
    
}
