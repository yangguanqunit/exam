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
public class Binarytreesort_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<String> strList = new ArrayList();
        while (scanner.hasNext()) {
            n=scanner.nextInt();
            if(n==0)
                break;
            scanner.nextLine();
            String source = scanner.nextLine();

            for (int i = 0; i < n; i++) {
                strList.add(scanner.nextLine());
            }
            String subStr = divid(source)[0];
            String preStr = divid(source)[1];
            for (String target : strList) {
                if (divid(target)[0].equals(subStr) && divid(target)[1].equals(preStr)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            strList.clear();
        }
    }

    public static String[] divid(String source) {
        String subStr = "";
        String preStr = "";
        char head = source.charAt(0);
        for (char element : source.toCharArray()) {
            if (element > head) {
                preStr += element;
            } else if (element < head) {
                subStr += element;
            }
        }
        return new String[]{subStr, preStr};
    }

}
