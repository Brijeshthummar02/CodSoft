package Task_2;

import java.util.Scanner;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int subjectCount) {
        this.name = name;
        this.marks = new int[subjectCount];
    }

    public void inputMarks(Scanner scanner) {
        System.out.println("Enter marks out of 100 for " + marks.length + " subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public String getGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public void displayResults() {
        int total = calculateTotal();
        double average = calculateAverage();
        String grade = getGrade();

        System.out.println("\n--- Result Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
