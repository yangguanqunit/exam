/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Xth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numlist.add(scanner.nextInt());
        }
        int num = scanner.nextInt();
        Collections.sort(numlist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        int tmp = 0;
        int rank = 0;
        for (int i : numlist) {
            if (tmp == i) {
                continue;
            } else {
                rank++;
                if (num == rank) {
                    System.out.print(i);
                }
                tmp = i;
            }

        }

    }

}
