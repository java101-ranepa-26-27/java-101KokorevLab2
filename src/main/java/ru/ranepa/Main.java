package ru.ranepa;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur name:");
        String name = scanner.nextLine();
        System.out.println("Enter ur mark:");
        List<Integer> marks = new ArrayList<>();
        int mark = -1;
        while (mark != 0) {
             mark = scanner.nextInt();
            if (mark != 0) {
                marks.add(mark);
            }
        }
    Student student = new Student(name, marks);
    student.Report();
    }

    }





