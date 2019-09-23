/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class ProjectOpening_Kruskal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        edge[] edges;
        int[] root = new int[100];
        int n, a, b,c,d;
//        int num;

        while (scanner.hasNext()) {
            int cost = 0;
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            n = n * (n - 1) / 2;
            edges = new edge[n];
            for (int i = 1; i < 100; i++) {
                root[i] = -1;
            }
            for (int i = 0; i < n; i++) {
                edges[i] = new edge();
                edges[i].a = scanner.nextInt();
                edges[i].b = scanner.nextInt();
                edges[i].value = scanner.nextInt();
                edges[i].state = scanner.nextInt();
            }
            Arrays.sort(edges, new Comparator<edge>() {
                @Override
                public int compare(edge o1, edge o2) {
                    if (o1.value > o2.value) {
                        return 1;
                    } else if (o1.value < o2.value) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
            );
            for (int i = 0; i < n; i++) {
                if (edges[i].state == 1) {
                    a = findroot(edges[i].a, root);
                    b = findroot(edges[i].b, root);
                    if(a!=b)
                        root[a]=b;
                    
                }
            }
            for (int i = 0; i < n; i++) {
                a = findroot(edges[i].a, root);
                b = findroot(edges[i].b, root);
                if (a != b && edges[i].state == 0) {
                    root[a] = b;
                    cost += edges[i].value;
                }
            }
            System.out.println(cost);

        }

    }

    public static int findroot(int x, int[] table) {
        int tmp;
        if (table[x] == -1) {
            return x;
        } 
        else {
            tmp = findroot(table[x], table);
            table[x] = tmp;
            return tmp;
        }
    }

    private static class edge {

        int a, b;
        int value;
        int state;
    }

}
