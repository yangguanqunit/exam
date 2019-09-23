package exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
  
public class Sortbygrade_huake {
  
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int num;
        ArrayList<Student> al;
        String[] str;
        while((line = br.readLine()) != null){
            num = Integer.parseInt(line);
            al = new ArrayList<Student>();
              
            for(int i =0; i <num; i++){
                if((line = br.readLine()) != null){
                    str = line.split(" ");
                    al.add(new Student(str[0], str[1], str[2]));
                }
            }
              
            Collections.sort(al);
              
            for(int i =0; i <num; i++){
                System.out.println(al.get(i).name+" "+al.get(i).age+" "+al.get(i).grade);
            }
              
        }
        br.close();
    }
      
    public static class Student implements Comparable{
        String grade;
        String name;
        String age;
          
        public Student(String name, String age, String grade) {
            super();
            this.grade = grade;
            this.name = name;
            this.age = age;
        }
  
        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            Student student = (Student) o;
            int a = Integer.parseInt(age);
            int b = Integer.parseInt(student.age);
            int c = Integer.parseInt(grade);
            int d = Integer.parseInt(student.grade);
              
            if(c < d){
                return -1;
            }else if(c == d){
                int result = this.name.compareTo(student.name);
                if(result != 0){
                    return result;
                }else{
                    return (a-b);
                }
            }else{
                return 1;
            }
        }
          
    }
  
}