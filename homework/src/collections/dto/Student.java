package collections.dto;

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
}
