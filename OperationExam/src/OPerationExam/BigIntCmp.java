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
public class BigIntCmp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            strList.add(scanner.nextLine());
        }
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    if (o1.compareTo(o2) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                return 0;
            }
        });
        for (String str : strList) {
            System.out.println(str);
        }
    }
}
