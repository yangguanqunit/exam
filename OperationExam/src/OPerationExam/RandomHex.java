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
public class RandomHex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int originHex = Integer.parseInt(input[0]);
        String originNum = input[1];
        int targetHex = Integer.parseInt(input[2]);
        
        System.out.print(Integer.toString(toDecimal(originHex, new StringBuilder(originNum.toUpperCase()).reverse().toString()),targetHex).toUpperCase());
        

    }
    
    public static int toDecimal(int hex,String num){
        int pow=0;
        int result=0;
        int value=0;
        for(char ch : num.toCharArray()){
            if(48<=ch&&ch<=57){
                result += Integer.parseInt(ch+"")*Math.pow(hex, pow);
            }
            else{
                switch(ch){
                    case 'A':
                        value=10;
                        break;
                    case 'B':
                        value=11;
                        break;
                    case 'C':
                        value=12;
                        break;
                    case 'D':
                        value=13;
                        break;
                    case 'E':
                        value=14;
                        break;
                    case 'F':
                        value=15;
                        break;
                }
                result+=value*Math.pow(hex,pow);
            }
            pow++;


            
        }
        
        
        return result;
    }
    
}
