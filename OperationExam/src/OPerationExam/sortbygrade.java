/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author yangguanqun
 */
public class sortbygrade {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int count;
        int method;
        int num = 0;
        //Scanner sca1 = new Scanner(System.in);

        Map<String, Integer> map = new TreeMap<>();
        count = sca.nextInt();
            method = sca.nextInt();
//        String str = null;
        while (sca.hasNext()) {
            

            while (num != count) {
//            str = sca1.nextLine();
//            map.put(str.split(" ")[0], Integer.valueOf(str.split(" ")[1]));
                map.put(sca.next(), sca.nextInt());
                num++;
            }
            break;
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        switch (method) {
            case 1:
                bubbleN(list);
                break;
            case 0:
                bubbleP(list);
                break;
            default:
                System.exit(0);
        }

    }

    public static void bubbleP(ArrayList<Map.Entry<String, Integer>> list) {
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> mapping : list) {
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }

    }

    public static void bubbleN(ArrayList<Map.Entry<String, Integer>> list) {

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> mapping : list) {
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }

    }
}
