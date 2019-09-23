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
public class Daysbetweentwodate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String date_1 = scanner.nextLine();
        String date_2 = scanner.nextLine();
        String start = date_1.compareTo(date_2)==1?date_2:date_1;
        String end = start.endsWith(date_1)?date_2:date_1;
        int year = Integer.parseInt(start.substring(0, 4));
        int month = Integer.parseInt(start.substring(4, 6));
        int day = Integer.parseInt(start.substring(6));
        int Feburary=28;
        int monthDays=0;
        int count = 0;
        finished:
        for(;;year++){
            if((year%4==0&&year%100!=0)||year%400==0){
                Feburary=29;
            }
            else
                Feburary=28;
            for(;month<=12;month++){
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    monthDays=31;
                }
                else if(month==2){
                    monthDays=Feburary;
                }
                else 
                    monthDays=30;
                for(;day<=monthDays;day++){
                    count++;
                    if( (year+""+(month>9?month:"0"+month)+""+(day>9?day:"0"+day)).endsWith(end))
                        break finished;
                }
                day=1;
            }
            month=1;
        }
        System.out.println(count);
    }
    
}
