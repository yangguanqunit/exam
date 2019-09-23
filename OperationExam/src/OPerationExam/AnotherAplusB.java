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
public class AnotherAplusB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        while (Integer.parseInt(input[0]) != 0) {
            strList.add(Hex(input[0], input[1], input[2]));
            input = scanner.nextLine().split(" ");
        }

        for (String str : strList) {
            System.out.println(str);
        }
    }

    public static String Hex(String HEX, String A, String B) {
        String result = "";
        int hex = Integer.parseInt(HEX);
        int num = Integer.parseInt(A) + Integer.parseInt(B);
        while (num != 0) {
            result += num % hex;
            num = num / hex;
        }
        return new StringBuilder(result).reverse().toString();

    }

}
