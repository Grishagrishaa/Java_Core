package collections.dto;

import java.util.Objects;

public class Student {
    private int studentId;
    private  String name;
    private int age;
    private float mark;
    private boolean olympiadParticipant;

    public Student (int id, String name, int age,float mark, boolean olympiadParticipant){
       this.studentId = id;
       this.name = name;
       this.age = age;
       this.mark = mark;
       this.olympiadParticipant = olympiadParticipant;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public boolean isOlympiadParticipant() {
        return olympiadParticipant;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID Студента=" + studentId +
                ", Имя = '" + name + '\'' +
                ", Возраст = " + age +
                ", Оценка = " + mark +
                ", Олимпиадник =" + olympiadParticipant +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && age == student.age && Float.compare(student.mark, mark) == 0 && olympiadParticipant == student.olympiadParticipant && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, age, mark, olympiadParticipant);
    }
}
