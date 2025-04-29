package Task_2;

import java.util.Scanner;

public class GradeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();

        Student student = new Student(studentName, subjectCount);
        student.inputMarks(scanner);
        student.displayResults();

        scanner.close();
    }
}

// OUTPUT :

//Enter student name: Brijesh
//Enter number of subjects: 3
//Enter marks out of 100 for 3 subjects:
//Subject 1: 89
//Subject 2: 67
//Subject 3: 98
//
//--- Result Summary ---
//Name: Brijesh
//Total Marks: 254
//Average Percentage: 84.67%
//Grade: A


//Enter student name:  Raj
//Enter number of subjects: 5
//Enter marks out of 100 for 5 subjects:
//Subject 1: 78
//Subject 2: 89
//Subject 3: 76
//Subject 4: 80
//Subject 5: 94
//
//--- Result Summary ---
//Name:  Raj
//Total Marks: 417
//Average Percentage: 83.40%
//Grade: A


//Enter student name: Om
//Enter number of subjects: 2
//Enter marks out of 100 for 2 subjects:
//Subject 1: 30
//Subject 2: 12
//
//--- Result Summary ---
//Name: Om
//Total Marks: 42
//Average Percentage: 21.00%
//Grade: F