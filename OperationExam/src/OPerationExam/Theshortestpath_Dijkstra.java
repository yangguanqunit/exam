/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Scanner;
public class Theshortestpath_Dijkstra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, a, b;
        int S, T, length, cs;
        boolean[] hasUsed;
        int[] distance;
        int[] cost;
        edge[][] edges;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n + m == 0) {
                break;
            }
            hasUsed = new boolean[n];
            distance = new int[n];
            cost = new int[1001];
            edges = new edge[1001][1001];
            for (int i = 0; i < m; i++) {
                a = scanner.nextInt() - 1;
                b = scanner.nextInt() - 1;
                length = scanner.nextInt();
                cs = scanner.nextInt();
                if(edges[a][b]!=null&&edges[b][a]!=null){
                    if(length>edges[a][b].length)
                        continue;
                    else if(length==edges[a][b].length&&cs>edges[a][b].cost)
                        continue;
                }
                edge e = new edge();
                e.length = length;
                e.cost = cs;
                e.next = b;
                edges[a][b] = e;
                e = new edge();
                e.length = length;
                e.cost = cs;
                e.next = a;
                edges[b][a] = e;
            }
            for (int i = 0; i < n; i++) {
                hasUsed[i] = false;
                distance[i] = -1;
            }
            S = scanner.nextInt() - 1;
            int newP = S;
            hasUsed[newP] = true;
            distance[newP] = 0;
            T = scanner.nextInt() - 1;
            for (int j = 0; j < n; j++) {
                for (edge e : edges[newP]) {
                    if (e == null) {
                        continue;
                    }
                    int t = e.next;
                    int l = e.length;
                    int c = e.cost;
                    if (hasUsed[t]) {
                        continue;
                    }
                    if (distance[t] == -1 || distance[t] > distance[newP] + l||(distance[t] == distance[newP] + l && cost[t] > cost[newP] + c)) {
                        distance[t] = distance[newP] + l;
                        cost[t] = cost[newP] + c;
                    }
                }
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (hasUsed[i]) {
                        continue;
                    }
                    if (distance[i] == -1) {
                        continue;
                    }
                    if (distance[i] < min) {
                        min = distance[i];
                        newP = i;
                    }
                }
                hasUsed[newP] = true;
            }
            System.out.println(distance[T]+" "+cost[T]);

        }
    }
    private static class edge {

        int next;
        int length = Integer.MAX_VALUE;
        int cost = Integer.MAX_VALUE;
    }

}
