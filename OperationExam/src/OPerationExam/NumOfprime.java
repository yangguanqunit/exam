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
public class NumOfprime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tmp = num;
        int count = 0;
        for (int factor = 2; factor <= Math.sqrt(tmp) + 1; factor++) {
            while (num % factor == 0) {
                count++;
                num /= factor;
            }
            if (num == 1) {
                break;
            }
        }
        if (num > 1) {
            count ++;
        }
        System.out.print(count);
    }
}


