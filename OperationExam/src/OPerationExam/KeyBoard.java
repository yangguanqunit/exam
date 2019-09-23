/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class KeyBoard {

    public static void main(String[] args) {
        char[] ABC = new char[]{'a', 'b', 'c'};
        char[] DEF = new char[]{'d', 'e', 'f'};
        char[] GHI = new char[]{'g', 'h', 'i'};
        char[] JKL = new char[]{'j', 'k', 'l'};
        char[] MNO = new char[]{'m', 'n', 'o'};
        char[] PQRS = new char[]{'p', 'q', 'r', 's'};
        char[] TUV = new char[]{'t', 'u', 'v'};
        char[] WXYZ = new char[]{'w', 'x', 'y', 'z'};
        char[][] list = new char[][]{ABC, DEF, GHI, JKL, MNO, PQRS, TUV, WXYZ};
        Scanner scanner = new Scanner(System.in);
        int time = 0;
        int times=0;
        char[] lastAction = new char[]{'#'};
        String input = scanner.nextLine();
        for (char ch : input.toCharArray()) {
            if (contain(lastAction, ch)) {
                time += 2;
                
            }
            for (char[] chList : list) {
                if(contain(chList, ch)){
                    times=0;
                    while(chList[times++]!=ch);
                    time+=times;
                    lastAction=chList;
                    break;
                }
            }
        }
        System.out.print(time);
    }
    public static boolean contain(char[] tmp, char target) {
        for(char ch : tmp){
            if(ch==target)
                return true;
        }
        return false;
    }

}
