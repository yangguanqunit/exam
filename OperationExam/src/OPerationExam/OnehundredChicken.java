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
public class OnehundredChicken {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                int z=100-x-y;
                if(x*3*5+y*3*3+z<=n*3){
                    System.out.println("x="+x+","+"y="+y+","+"z="+z);
                }
            }
        }

    }

}
