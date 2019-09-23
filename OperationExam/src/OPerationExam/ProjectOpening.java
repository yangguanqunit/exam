/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class ProjectOpening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        while (scanner.hasNext()) {
            n=scanner.nextInt();
            if(n==0)
                break;
            m=scanner.nextInt();
            int[] table = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                table[i] = -1;
            }
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                a = findroot(a, table);
                b = findroot(b, table);
                if (a != b) {
                    table[a] = b;
                }
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (table[i] == -1) {
                    count++;
                }
            }
            System.out.println(--count);
        }
    }
    public static int findroot(int x, int[] table) {
        int tmp;
        if (table[x] == -1) {
            return x;
        } else {
            tmp = findroot(table[x], table);
            table[x] = tmp;
            return tmp;
        }
    }

}
