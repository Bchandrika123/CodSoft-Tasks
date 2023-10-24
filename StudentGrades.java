import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        String name;
        int marks, javaScore, mathScore, webTechScore, cnScore, seScore;
        double avg;
        System.out.print("Enter name of Student = ");
        name = ed.next();
        System.out.println("Now, Number Out of 100 in following subject :- ");
        System.out.print("Java : ");
        javaScore = ed.nextInt();
        System.out.print("Maths : ");
        mathScore = ed.nextInt();
        System.out.print("Web Technologies : ");
        webTechScore = ed.nextInt();
        System.out.print("Computer Network : ");
        cnScore = ed.nextInt();
        System.out.print("Software Engineering : ");
        seScore = ed.nextInt();
        marks = javaScore + mathScore + cnScore + seScore + webTechScore;
        avg = ((double) marks) / 500;
        System.out.println("Name = " + name);
        System.out.println("total marks " + marks);
        if (avg > 0.8 && avg <= 1) {
            System.out.println("Grade = A");
        } else if (avg > 0.6 && avg <= 0.8) {
            System.out.println("Grade = B");
        } else if (avg > 0.3 && avg <= 0.6) {
            System.out.println("Grade = C");
        } else if (avg >= 0 && avg <= 0.3) {
            System.out.println("Grade = D");
        } 
    }
}
