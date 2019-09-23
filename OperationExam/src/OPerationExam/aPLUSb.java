/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class aPLUSb {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.println(a.add(b));
    }
    
}
