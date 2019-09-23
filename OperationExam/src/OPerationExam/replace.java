/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class replace {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String wordslist = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(wordslist.split(" ")));
        String word_1 = scanner.next();
        String word_2 = scanner.next();
        ArrayList<Integer> index = new ArrayList<>();
        for (String words : list) {

            if (word_1.equals(words)) {
                index.add(count);

            }
            count++;
        }
        for (int i : index) {
            list.remove(i);
            list.add(i, word_2);
        }
        String result=null;
        for (String str : list) {
            result=result+str+" ";
        }
        System.out.println(result.substring(0, result.length()-1));
    }

}
