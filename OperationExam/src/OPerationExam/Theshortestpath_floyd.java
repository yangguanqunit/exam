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
public class Theshortestpath_floyd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        int line, row;
        int[][] cost;
        int[][] path;
        int tmp;
        while (scanner.hasNext()) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            if (m + n == 0) {
                break;
            }
            cost = new int[m][m];
            path = new int[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    path[i][j] = Integer.MAX_VALUE;
                }
            }
            for (int i = 0; i < n; i++) {
                row = scanner.nextInt() - 1;
                line = scanner.nextInt() - 1;
                path[row][line] = scanner.nextInt();
                cost[row][line] = scanner.nextInt();
            }

            for (int k = 0; k < m; k++) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        if (path[i][k] == Integer.MAX_VALUE || path[k][j] == Integer.MAX_VALUE) {
                            continue;
                        }
                        if (path[i][j] == Integer.MAX_VALUE || path[i][k] + path[k][j] <= path[i][j]) {
                            path[i][j] = path[i][k] + path[k][j];
                        }
                        if(path[i][k] + path[k][j] == path[i][j]&&cost[i][j] > cost[i][k]+cost[k][j])
                            cost[i][j] = cost[i][k]+cost[k][j];
                    }
                }
            }
            row = scanner.nextInt() - 1;
            line = scanner.nextInt() - 1;
            System.out.println(path[row][line] + " " + cost[row][line]);
        }
    }

}
