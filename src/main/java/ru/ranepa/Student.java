package ru.ranepa;
import java.util.List;

public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public double avgMarks() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public String status(){
        double avg = avgMarks();
        String result;
        if (avg >= 4.5) {
            result = "Отличиник";
        } else if (avg >= 3.5) {
            result = "хорошист";
        } else if (avg >= 2.5) {
            result = "Троечниик";
        } else  {
            result = "Двоечник";
        }
        return result;
    }

    public void Report(){
        System.out.println("Отчет");
        System.out.println("Имя студента: " + name);
        System.out.println("Оценки студента: " + marks);
        System.out.println("Средний балл студента: " + avgMarks());
        System.out.println("Статус студента: " + status());
    }
}

