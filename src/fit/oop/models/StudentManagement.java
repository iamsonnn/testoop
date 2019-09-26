package fit.oop.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
        generateFakeData();
    }

    public void generateFakeData() {
        for (int i = 0;i < 5; i++){
            students.add(new Student("Name " + i, i, new Date(), null));
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.students
                .removeIf(student -> student.getStudentCode() == 2);
        studentManagement.students.sort((s1, s2) -> (s2.getStudentCode()-s1.getStudentCode()));

        Iterator<Student> studentIterator = studentManagement.students.iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getStudentCode() == 3){
                studentIterator.remove();
            }
        }
        for (Student student: studentManagement.students){
            System.out.println(student);
        }

    }
}
