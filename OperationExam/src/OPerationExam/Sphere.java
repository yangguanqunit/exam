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
public class Sphere {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y =scanner.nextInt();
        int z = scanner.nextInt();
        double radius = Math.sqrt(Math.pow(scanner.nextInt()-x, 2)+Math.pow(scanner.nextInt()-y, 2)+Math.pow(scanner.nextInt()-z, 2));
        System.out.print(String.format("%.3f", radius)+" ");
        System.out.println(String.format("%.3f", 4/3.0*Math.PI*Math.pow(radius, 3)));
        
    }
}
