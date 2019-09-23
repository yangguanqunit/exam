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
public class Matrixconvert {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int j1 = 0; j1 < n; j1++) {
                matrix[j][j1] = sca.nextInt();
            }
        }

        int a = sca.nextInt();
        int b = sca.nextInt();
        int x = sca.nextInt() - 1;
        int y = sca.nextInt() - 1;
        switch (b) {
            case 2:
                if (a == 1) {
                    Clockwise(matrix, x, y, 1, 0);
                } else if (a == 2) {
                    Clockwise(matrix, x, y, 0, 1);
                }
                break;
            case 3:
                if (a == 1) {
                    Clockwise(matrix, x, y, 2, 0);
                    middle(matrix, x, y + 1, 1, 1);
                } else if (a == 2) {
                    Clockwise(matrix, x, y, 0, 2);
                    middle(matrix, x, y + 1, 1, -1);
                }
                break;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Clockwise(int[][] matrix, int x, int y, int length, int lengthY) {
        int tmp;
        tmp = matrix[x][y];
        matrix[x][y] = matrix[x + length][y + lengthY];
        matrix[x + length][y + lengthY] = matrix[x + length + lengthY][y + length + lengthY];
        matrix[x + length + lengthY][y + length + lengthY] = matrix[x + lengthY][y + length];
        matrix[x + lengthY][y + length] = tmp;
    }

    public static void middle(int[][] matrix, int x, int y, int length, int lengthY) {
        int tmp;
        tmp = matrix[x][y];
        matrix[x][y] = matrix[x + length][y - lengthY];
        matrix[x + length][y - lengthY] = matrix[x + 2][y];
        matrix[x + 2][y] = matrix[x + length][y + lengthY];
        matrix[x + length][y + lengthY] = tmp;

    }

}
