package WithoutSeeingWithInTimeTest;

import java.util.HashMap;
import java.util.Map;

public class EighthOne {
    public static void averageStudents(String[][] input){
        String result="";
        HashMap<String,Integer> total = new HashMap<>();
        HashMap<String,Integer> count= new HashMap<>();
        for(String[] data: input) {
            String student = data[0];
            int marks= Integer.parseInt(data[1]);
            total.put(student,total.getOrDefault(student,0)+marks);
            count.put(student,count.getOrDefault(student,0)+1);
        }
        double highestAverage=Double.NEGATIVE_INFINITY;
        for(String student: total.keySet()){
           double average= (double) total.get(student)/count.get(student);
            if(average>highestAverage){
                highestAverage = average;
                result= student;
            }
        }

        System.out.printf(String.valueOf(highestAverage));
        System.out.println(" "+result);
    }
    public static void main(String[] args) {
        String[][] str = {{"Charles","84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};
        averageStudents(str);
    }
}
