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
public class compareOdd {

    public static void main(String[] args) {
        int n;
        ArrayList<Integer> numlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numlist.add(scanner.nextInt());
        }
        System.out.print(compare(numlist));

    }

    static public String compare(ArrayList<Integer> list) {
        String yes = "YES";
        String no = "NO";
        int ODD = 0;
        int EVEN = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                EVEN++;
            } else if (num % 2 == 1) {
                ODD++;
            }
        }
        if (EVEN > ODD) {
            return no;
        } else {
            return yes;
        }

    }

}
