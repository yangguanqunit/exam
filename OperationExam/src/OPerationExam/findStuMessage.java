/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class findStuMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<student> stulist = new ArrayList<>();
        ArrayList<String> qSeq = new ArrayList<>();
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            stulist.add(new student(scanner.nextLine()));
        }
        Collections.sort(stulist, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.id.compareTo(o2.id);
            }
        });
        int M = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < M; i++) {
            qSeq.add(scanner.nextLine());
        }
        int result;
        for (String query : qSeq) {
            result = binarySearch(stulist, query);
            if (result == -1) {
                System.out.println("No Answer!");
            } else {
                System.out.println(stulist.get(result).id + " " + stulist.get(result).name + " " + stulist.get(result).gender + " " + stulist.get(result).age);
            }
        }
    }

    public static int binarySearch(ArrayList<student> sqlist, String key) {
        int low = 0, high = sqlist.size() - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key.endsWith(sqlist.get(mid).id)) {
                return mid;
            } else if (Integer.parseInt(key) < Integer.parseInt(sqlist.get(mid).id)) {
                high = mid - 1;
            } else if (Integer.parseInt(key) > Integer.parseInt(sqlist.get(mid).id)) {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static class student {

        String id;
        String name;
        String gender;
        String age;

        public student(String message) {
            this.id = message.split(" ")[0];
            this.name = message.split(" ")[1];
            this.gender = message.split(" ")[2];
            this.age = message.split(" ")[3];
        }

    }

}
