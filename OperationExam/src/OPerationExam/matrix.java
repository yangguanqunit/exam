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
public class matrix {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int k = sca.nextInt();

        int[][] matrix = new int[n][n];

        for (int j = 0; j < n; j++) {
            for (int j1 = 0; j1 < n; j1++) {
                matrix[j][j1] = sca.nextInt();
            }

            
        }

        mulMa(matrix, n, k - 1);

    }

    public static void mulMa(int[][] a, int n, int k) {
        int[][] result = null;
        int[][] tmp = a;
        for (int times = 0; times < k; times++) {
            result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int p = 0; p < n; p++) {
                        result[i][j] = result[i][j] + tmp[i][p] * a[p][j];
                    }
                }
            }
            tmp = result;

        }

        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(result.length==0){
                    System.exit(0);
                }
                System.out.print(result[i][j]);
                if(j==n-1){
                    System.out.println();
                }
                else
                    System.out.print(" ");
            }
            

        }

    }

}
