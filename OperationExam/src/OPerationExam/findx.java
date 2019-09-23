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
public class findx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seqlist = new int[n];
        int index=0;
        boolean isFind = false;
        for (int i = 0; i < n; i++) {
            seqlist[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        for (int num : seqlist) {
            if (x == num) {
                isFind=!isFind;
                break;
            }
            index++;
        }
        System.out.print(isFind?index:-1);

    }

}
