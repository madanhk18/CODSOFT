import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks_of_subjects=0,Total_marks=0;
        for (int i=1;i<=5;i++){
            System.out.println("Enter marks for subject number"+" "+i+" "+"(out of 100)");
            marks_of_subjects= sc.nextInt();
            Total_marks+=marks_of_subjects;
        }

        System.out.println("Total marks of all Subjects="+Total_marks);
        double avg=(double)(Total_marks/5);

        System.out.println("The average percentage by considering all subjects="+avg);

        System.out.println("=====================================================");
        System.out.println("Final Marks Sheet");
        System.out.println("Total marks="+Total_marks+ "\t Average percentage="+avg);

        if(avg>90.0){
            System.out.println("Grade A");
        }else if (avg>75.0 && avg<90.0){
            System.out.println("Grade B");
        } else if (avg>60.0 && avg<75.0) {
            System.out.println("Grade C");
        }else
            System.out.println("Fail");
    }
}
