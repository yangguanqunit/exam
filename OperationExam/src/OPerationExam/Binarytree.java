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
public class Binarytree {

    public static void main(String[] args) {
        ArrayList<Integer> numlist = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String empty = "EMPTY";
        int high;
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            numlist.add(scanner.nextInt());
        }
        high = scanner.nextInt();
        if((Math.pow(2, high-1)-1)>count){
            System.out.println(empty);
            System.exit(0);
        }
        int sum = (int) Math.pow(2, high) - 1;
        int countInHigh = (int) Math.pow(2, high - 1);
        
        if (count - sum >= 0) {
            for (int i = sum - countInHigh; i < sum; i++) {
                System.out.print(numlist.get(i));
                if (i == sum - 1) {
                    continue;
                }
                System.out.print(" ");
            }
        } else {
            for (int i = sum - countInHigh; i < count; i++) {
                System.out.print(numlist.get(i));
                if (i == count - countInHigh - 1) {
                    continue;
                }
                System.out.print(" ");
            }
        }

    }

}
