import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSort {
    String name;
    double grade;

    StudentSort(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Students?");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        List<StudentSort> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++){
            System.out.println("Enter Details for student#" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            students.add(new StudentSort(name, grade));
        }

        // Sorting in descending order
        for (int i = 0; i < students.size() - 1; i++){
            for (int j = 0; j < students.size() - i - 1; j++){
                if (students.get(j).grade < students.get(j + 1).grade){
                    StudentSort temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nSorted Students by Grade (Descending):");
        for (StudentSort student : students){
            System.out.println(student.name + " - " + student.grade);
        }

        scanner.close();
    }
}
