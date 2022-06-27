import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exam_1 = 0;
        int exam_2 = 0;
        int final_exam = 0;
        int assignment_total = 0;
        float total_grade = 0;
        float grade_total = 0;
        String letter_grade = "";

        System.out.println("Enter Exam 1 score:");
        exam_1 = in.nextInt();
        System.out.println("Enter Exam 2 score:");
        exam_2 = in.nextInt();
        System.out.println("Enter Final Exam score:");
        final_exam = in.nextInt();
        System.out.println("Enter assignments score:");
        assignment_total = in.nextInt();

        total_grade = exam_1 + exam_2 + final_exam + assignment_total;
        grade_total = total_grade / 4;

        if (grade_total >= 90) {
            letter_grade = "A";
            System.out.println("Score: " + grade_total + " Grade: " + letter_grade);
        }
        else if (80 <= grade_total & grade_total < 90){
            letter_grade = "B";
            System.out.println("Score: " + grade_total + " Grade: " + letter_grade);
        }
        else if (70 <= grade_total & grade_total < 80){
            letter_grade = "C";
            System.out.println("Score: " + grade_total + " Grade: " + letter_grade);
        }
        else if (60 <= grade_total & grade_total < 70){
            letter_grade = "D";
            System.out.println("Score: " + grade_total + " Grade: " + letter_grade);
        }
        else {
            letter_grade = "F";
            System.out.println("Score: " + grade_total + " Grade: " + letter_grade);
        }
    }
}
