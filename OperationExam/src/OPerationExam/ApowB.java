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
public class ApowB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> resList = new ArrayList<>();
        int A = scanner.nextInt() % 1000;
        int B = scanner.nextInt();
        while (A+B!=0) {
            int tmp = 1;
            for (int i = 0; i < B; i++) {
                tmp *= A;
                if (tmp > 999) {
                    tmp = tmp % 1000;
                }
            }
            resList.add(tmp);
            A=scanner.nextInt() % 1000;
            B = scanner.nextInt();
        }
        for(int i : resList){
            System.out.println(i);
        }
    }

}
