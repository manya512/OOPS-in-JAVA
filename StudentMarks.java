package collections;

import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<String, Integer>();

        students.put("Ravi", 85);
        students.put("Harshini", 98);
        students.put("Arun", 90);

        System.out.println("Student Marks:");

        for (HashMap.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}