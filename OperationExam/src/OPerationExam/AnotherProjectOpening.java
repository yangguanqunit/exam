/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author yangguanqun
 */
public class AnotherProjectOpening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        int a, b;
        int[] number;
        int cost = 0;
        path[] pathNum;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            pathNum = new path[n];
            m = scanner.nextInt();
            number = new int[m + 1];
            for (int i = 1; i <= m; i++) {
                number[i] = -1;
            }
            for (int i = 0; i < n; i++) {
                pathNum[i] = new path();
                pathNum[i].a = scanner.nextInt();
                pathNum[i].b = scanner.nextInt();
                pathNum[i].value = scanner.nextInt();
            }
            Arrays.sort(pathNum, new Comparator<path>() {
                @Override
                public int compare(path o1, path o2) {
                    if (o1.value > o2.value) {
                        return 1;
                    } else if (o1.value < o2.value) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
            for (int i = 0; i < n; i++) {
                a = findroot(pathNum[i].a, number);
                b = findroot(pathNum[i].b, number);
                if (a != b) {
                    number[a] = b;
                    cost += pathNum[i].value;
                }
            }
            int notOpening = 0;
            for (int i = 1; i <= m; i++) {
                if (number[i] == -1) {
                    notOpening++;
                }
            }
            System.out.println(notOpening++ >= 2 ? "?" : cost);
        }
    }

    public static int findroot(int x, int[] tree) {
        int tmp;
        if (tree[x] == -1) {
            return x;
        } else {
            tmp = findroot(tree[x], tree);
            tree[x] = tmp;
            return tmp;
        }
    }

    private static class path {

        int a;
        int b;
        int value;
    }

}
