package mahesh.raj.practicetest;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentAverage {
    public static double findAverage(String[][] input){
        HashMap<String,Integer> totalMarks = new LinkedHashMap<>();
        HashMap<String,Integer> countStudents= new LinkedHashMap<>();
        for(String[] data: input){
            String studentName=data[0];
            int marks=Integer.parseInt(data[1]);
            totalMarks.put(studentName,totalMarks.getOrDefault(studentName,0)+marks);
            countStudents.put(studentName,countStudents.getOrDefault(studentName,0)+1);
        }
        Double average = Double.NEGATIVE_INFINITY;
        for(String student: totalMarks.keySet()){
            double averageMarks = (double) totalMarks.get(student)/countStudents.get(student);
            if(averageMarks>average){
                average=averageMarks;
            }
        }
        return average;
    }
    public static void main(String[] args) {
        String[][] str= {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};
        System.out.println(findAverage(str));
    }
}
