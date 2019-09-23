/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Scanner;
public class Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] beDivid = new int[1000];
        int[] divid = new int[1000];
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int inTmp;
        int tmp=a;
        int flag=0;
        int min=1000;
        for (int i = n; i > 1; i--) {
            inTmp=i;
            for (int factor = 2; factor <= Math.sqrt(i) + 1; factor++) {
                while (inTmp % factor == 0) {
                    beDivid[factor]++;
                    inTmp /= factor;
                }
                if (inTmp == 1) {
                    break;
                }
            }
            if (inTmp>1) {
                beDivid[inTmp]++;
            }
        }
        for(int factor=2;factor<=Math.sqrt(a)+1;factor++){
            while(tmp%factor==0){
                    divid[factor]++;
                    tmp/=factor;
            }
            if(tmp==1){
                    break;
                }
        }
        if(tmp>1){
            divid[tmp]++;
        }
        for(int i=0;i<divid.length-1;i++){
            if(divid[i]>0&&beDivid[i]>0&&beDivid[i]<min){
                min=beDivid[i];
                flag=i;
            }
        }
        System.out.println(beDivid[flag]/divid[flag]);  
    }

}
