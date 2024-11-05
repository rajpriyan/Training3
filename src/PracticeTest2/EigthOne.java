package PracticeTest2;

import java.util.HashMap;

public class EigthOne {
    public static void findHighestAverage(String[][] input){
        String result="";
        HashMap<String,Integer> totalMarks = new HashMap<>();
        HashMap<String,Integer> countMarks=new HashMap<>();
        for(String[] data: input){
            String student=data[0];
            int marks = Integer.parseInt(data[1]);
            totalMarks.put(student,totalMarks.getOrDefault(student,0)+marks);
            countMarks.put(student,countMarks.getOrDefault(student,0)+1);
        }
        double highestAverage=Double.NEGATIVE_INFINITY;
        for(String student: totalMarks.keySet()){
            double average = (double) totalMarks.get(student) / countMarks.get(student);
            if(average>highestAverage){
                highestAverage=average;
                result=student;
            }
        }
        System.out.println(String.valueOf(highestAverage));
        System.out.println(result);
    }
    public static void main(String[] args) {
        String[][] str= {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};
        findHighestAverage(str);
    }
}
