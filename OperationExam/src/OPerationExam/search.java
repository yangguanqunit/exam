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
public class search {

    public static void main(String[] args) {
        ArrayList<String> cmdlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String initialStr = scanner.nextLine();
        int cmdCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cmdCount; i++) {
            cmdlist.add(scanner.nextLine());
        }
        for (String cmds : cmdlist) {
            switch (cmds.charAt(0)) {
                case '0':
                    initialStr = reverse(initialStr, Integer.valueOf(Character.toString(cmds.charAt(1))), Integer.valueOf(Character.toString(cmds.charAt(2))));
                    break;
                case '1':
                    initialStr = replace(initialStr, Integer.valueOf(Character.toString(cmds.charAt(1))), Integer.valueOf(Character.toString(cmds.charAt(2))), cmds.substring(3));
            }
        }
    }

    public static String reverse(String str, int location, int length) {
        String strFront = str.substring(0, location);
        String middle = str.substring(location,location+length );
        String strTail = str.substring(location+length);
        str = strFront + new StringBuilder(middle).reverse() + strTail;
        System.out.println(str);
        return str;
    }

    public static String replace(String str, int location, int length, String RP) {
        String strFront = str.substring(0, location);
        String strTail = str.substring(location + length);
        str = strFront + RP + strTail;
        System.out.println(str);
        return str;
    }

}
