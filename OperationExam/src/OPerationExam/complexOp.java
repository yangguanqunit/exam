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
public class complexOp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<complex> list = new ArrayList<>();
        int n;
        n = scanner.nextInt();
        String nulll = scanner.nextLine();
        for(int i=0;i<n;i++){
            strList.add(scanner.nextLine());
        }
        for(String str : strList){
            switch(str.split(" ")[0]){
                case "Pop":
                    if(list.size()==0){
                        System.out.println("empty");
                    }
                    else
                        pop(list);
                    break;
                case "Insert":
                    insert(list, new complex(Integer.parseInt(str.substring(7).split("\\+")[0]), Integer.parseInt(str.substring(7).split("i")[1])));
            }
            
            
        }
        
        
//        list.add(new complex(1, 1));
//        list.add(new complex(2, 2));
//        for(complex a : list){
//            System.out.println(a.real+"  "+a.virtual);
//        }
//        pop(list);
//        for(complex a : list){
//            System.out.print(a.real+"  "+a.virtual);
//        }
        
        
        
        
        
        
        
        
    }
    
    public static void pop(ArrayList<complex> complexs){
        complex tmp=complexs.get(0);
        int flag=0;
        int i=0;
        double value= Math.sqrt(Math.pow(complexs.get(0).real, 2)+Math.pow(complexs.get(0).virtual, 2));
        for(complex cpx:complexs){
            if(value<Math.sqrt(Math.pow(cpx.real, 2)+Math.pow(cpx.virtual, 2))){
                flag=i;
                tmp=cpx;
                
            }
            else if(value==Math.sqrt(Math.pow(cpx.real, 2)+Math.pow(cpx.virtual, 2))){
                if(tmp.virtual>cpx.virtual){
                    flag=i;
                    tmp=cpx;
                }
            }
            value = Math.sqrt(Math.pow(tmp.real, 2)+Math.pow(tmp.virtual, 2));
            i++;
        }
        complexs.remove(flag);
        System.out.println(tmp.real+"+i"+tmp.virtual);
        System.out.println("SIZE = "+complexs.size());
        
    }
    public static void insert(ArrayList<complex> complexs,complex cpx){
        
        
        
        complexs.add(cpx);
        System.out.println("SIZE = "+complexs.size());
        
        
    }
    
    static private class complex{
        public int real;
        public int virtual;

        public complex(int real, int virtual) {
            this.real = real;
            this.virtual = virtual;
        }
        
    }
    
}
