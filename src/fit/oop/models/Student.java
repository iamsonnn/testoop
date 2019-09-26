package fit.oop.models;

import java.util.Date;
import java.util.Objects;

public class Student {
    String fullName;
    private int studentCode;
    private Date birthDay;
    private Teacher teacher;

    public Student(String fullName, int studentCode, Date birthDay, Teacher teacher) {
        this.fullName = fullName;
        this.studentCode = studentCode;
        this.birthDay = birthDay;
        this.teacher = teacher;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", studentCode=" + studentCode +
                ", birthDay=" + birthDay +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentCode == student.studentCode &&
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(birthDay, student.birthDay) &&
                Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, studentCode, birthDay, teacher);
    }
}
