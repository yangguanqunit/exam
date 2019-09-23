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
public class sort {

    public static void main(String[] args) {
        ArrayList<Numset> nsetlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            nsetlist.add(new Numset(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(nsetlist, new Comparator<Numset>() {
            @Override
            public int compare(Numset o1, Numset o2) {
                if (o1.last > o2.last) {
                    return 1;
                } else if (o1.last < o2.last) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        Collections.sort(nsetlist, new Comparator<Numset>() {
            @Override
            public int compare(Numset o1, Numset o2) {
                if (o1.first > o2.first) {
                    return 1;
                } else if (o1.first < o2.first) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.print(nsetlist.get(0).first + " " + nsetlist.get(0).last);
    }
    
    private static class Numset {

        public int first;
        public int last;
        
        public Numset(int first, int last) {
            this.first = first;
            this.last = last;
        }
        
    }
}
