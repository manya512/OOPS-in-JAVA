package collections;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Ravi");
        students.add("Harshini");
        students.add("Arun");
        students.add("Priya");
        students.add("Kavin");

        if (students.contains("Ravi")) {
            students.remove("Ravi");
        }

        System.out.println("Remaining students:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}