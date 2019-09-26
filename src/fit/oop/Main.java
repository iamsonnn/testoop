package fit.oop;


import fit.oop.models.Student;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Son", 11212, new Date(), null);
        System.out.println(student);
    }
}
