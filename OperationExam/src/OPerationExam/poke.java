/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class poke {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine() + '#';
        String b = scanner.nextLine() + '#';
        char[] hand = a.toCharArray();
        char[] show = b.toCharArray();
        Map<Character, Integer> handmap = getmap(hand);
        Map<Character, Integer> handmapbp = getmap(hand);
        Map<Character, Integer> showmap = getmap(show);
        int count = 0;
        boolean judge = false;
        int sum = showmap.keySet().size();
        int max = (Integer) showmap.values().toArray()[0];
        char start = (Character) showmap.keySet().toArray()[0];
        char flag = (Character) handmap.keySet().toArray()[0];
        for (char ch : handmap.keySet()) {
            if (handmap.get(ch) < max) {
                handmapbp.remove(ch);
            }
        }
        for (char ch : handmapbp.keySet()) {
            //System.out.print(ch);
            if (ch >= start) {
                if ((flag == ch) || (ch == flag + 1)) {
                    count++;
                } else {
                    count = 1;
                }
                flag = ch;
                if (count >= sum) {
                        judge = !judge;
                        break;
                    }

            }
        }
        System.out.print(judge ? "YES" : "NO");

    }

    public static Map<Character, Integer> getmap(char[] hand) {
        Map<Character, Integer> map = new HashMap();
        char flag = hand[0];
        int count = 0;
        for (char ch : hand) {
            if (ch == flag) {
                count++;
                flag = ch;
                continue;
            }
            map.put(flag, count);
            flag = ch;
            count = 1;
        }
        return map;
    }

}
