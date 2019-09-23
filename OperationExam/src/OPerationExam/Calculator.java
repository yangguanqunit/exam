/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Calculator {

    public static void main(String[] args) {
        ArrayList<String> optorlist = new ArrayList<>();
        ArrayList<Double> numlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double op1;
        double op2;
        String tmp = "#";
        boolean flag = false;
        for (String ch : input.split(" ")) {
            if (!"+".equals(ch) && !"-".equals(ch) && !"*".equals(ch) && !"/".equals(ch)) {
                numlist.add(Double.valueOf(ch + ""));
            }
            if (flag) {
                op2 = numlist.remove(numlist.size() - 1);
                op1 = numlist.remove(numlist.size() - 1);
                System.out.println(op(tmp, op1, op2));
                numlist.add(op(tmp, op1, op2));
                flag = false;
                continue;
            }
            if ("*".equals(ch) || "/".equals(ch)) {
                tmp = ch;
                flag = true;
            }
            if("+".equals(ch) || "-".equals(ch))
                optorlist.add(ch);
        }
        Collections.reverse(optorlist);
        Collections.reverse(numlist);
        
        while(!optorlist.isEmpty()){
            op1=numlist.remove(numlist.size()-1);
            op2=numlist.remove(numlist.size()-1);
            numlist.add(op(optorlist.remove(optorlist.size()-1), op1, op2));
        }
        
        System.out.println(String.format("%.2f", numlist.get(0)));

    }

//    public static boolean cmpoptor(char optor1, char optor2) {
//        switch (optor1) {
//            case '*':
//            case '/':
//                return (optor2 == '+' || optor2 == '-') ? true : false;
//        }
//        return false;
//    }

    public static double op(String optor, double op1, double op2) {
        double result = -1.0;
        switch (optor) {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
                result = op1 / op2;
                break;
        }
        //System.out.print(result);
        return result;
    }

}
