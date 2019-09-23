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
public class Gradesort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<stu> stulist = new ArrayList<>();
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            stulist.add(new stu(scanner.nextInt(),scanner.nextInt()));           
        }
        Collections.sort(stulist, new Comparator<stu>() {
            @Override
            public int compare(stu o1, stu o2) {
                if(o1.id>o2.id){
                    return 1;
                }
                else if(o1.id<o2.id){
                    return -1;
                }
                else 
                    return 0;
            }
        });
        Collections.sort(stulist, new Comparator<stu>() {
            @Override
            public int compare(stu o1, stu o2) {
                if(o1.grade>o2.grade){
                    return 1;
                }
                else if(o1.grade<o2.grade){
                    return -1;
                }
                else 
                    return 0;
            }
        });
        for(stu student : stulist){
            System.out.print(student.id+" ");
            System.out.println(student.grade);   
        }
        
     
    }
    private static class stu{
        int id;
        int grade;

        public stu(int id, int grade) {
            this.id = id;
            this.grade = grade;
        }
        
        
        
    }
    
}
