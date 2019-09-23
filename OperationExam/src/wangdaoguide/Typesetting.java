package wangdaoguide;

import java.util.Scanner;
public class Typesetting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int sum = (h-1)*2+h;
        for(int i=0;i<h;i++){
            for(int j=0;j<sum-h-i*2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<h+i*2;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
