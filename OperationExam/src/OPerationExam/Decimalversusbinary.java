/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Decimalversusbinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigint = scanner.nextBigInteger();
        ArrayList<BigInteger> result = new ArrayList<>();
        String binary = null;
        while (bigint.compareTo(BigInteger.valueOf(0)) > 0) {
            binary = binary + bigint.remainder(BigInteger.valueOf(2));
            bigint = bigint.divide(BigInteger.valueOf(2));
        }
        binary = new StringBuffer(binary.substring(4)).reverse().toString();
        int power = 0;
        for (char a : binary.toCharArray()) {
            result.add(BigInteger.valueOf((long)Integer.valueOf(a+"")).multiply(BigInteger.valueOf(2).pow(power++)));
        }
        BigInteger tmp = BigInteger.valueOf(0);
        for (BigInteger bi : result) {

            tmp = tmp.add(bi);
        }
        System.out.print(tmp);
    }
}
