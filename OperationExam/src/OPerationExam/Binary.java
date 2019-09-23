/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import static java.lang.System.out;
import java.util.*;

/**
 *
 * @author yangguanqun
 */
public class Binary {
    public static void main(String[] args){
        int count=0;
        Scanner scanner = new Scanner(System.in);
        
        count=scanner.nextInt();
        if(count>100000000)
        {
            System.exit(0);
        }
        //System.out.println(count);
        int[] iList = new int[count];
        for(int i=0;i<count;i++)
        {
            iList[i]=scanner.nextInt();
//            System.out.println(iList[i]);
        }
        for(int a : iList){
            System.out.println(a);
        }
        for(int a : iList){
            
            System.out.println(Integer.toBinaryString(a));
        }
        
        
                
        
        
    }
}
