package student;
import java.util.Scanner;
import SY.SyMark;
import TY.TyMark;

public class Student {
		    int rollno;
		    String studentname;
		    SyMark sym;
		    TyMark tym;
		    Student(int r, String name, SyMark s, TyMark t) {
		        rollno = r;
		        studentname = name;
		        sym = s;
		        tym = t;
		    }
		    @Override
		    public String toString() {
		        return rollno + "\t" + studentname + "\t" + sym + "\t" + tym + "\t";
		    }
		    void calculateGrade() {
		        int total = sym.computerTotal + sym.mathTotal + sym.electTotal + tym.theory + tym.practicals;
		        double percentage = (total / 500.0) * 100;
		        System.out.print("\t" + String.format("%.2f", percentage) + "%\t");
		        if (percentage >= 70) {
		            System.out.println("\tA");
		        } else if (percentage >= 60) {
		            System.out.println("\tB");
		        } else if (percentage >= 50) {
		            System.out.println("\tC");
		        } else if (percentage >= 40) {
		            System.out.println("\tPass");
		        } else {
		            System.out.println("\tFAIL!");
		        }
		    }
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("How Many Students:");
		        int n = sc.nextInt();
		        Student[] stud = new Student[n];
		        for (int i = 0; i < n; i++) {
		            System.out.println("Enter " + (i + 1) + " student data");
		            System.out.println("Enter Roll no:");
		            int roll_no = sc.nextInt();
		            sc.nextLine();
		            System.out.println("Enter Student Name:");
		            String name = sc.nextLine();
		            System.out.println("Enter SY Marks (Computer, Math, Electronics):");
		            int ct = sc.nextInt();
		            int mt = sc.nextInt();
		            int et = sc.nextInt();
		            SyMark sym = new SyMark(ct, mt, et);
		            System.out.println("Enter TY Marks (Theory and Practicals):");
		            int th = sc.nextInt();
		            int pr = sc.nextInt();
		            TyMark tym = new TyMark(th, pr);
		            stud[i] = new Student(roll_no, name, sym, tym);
		        }
		        System.out.println("\n* STUDENT DETAILS *");
		        System.out.println("R.No\tName\tCompTotal\tMathTotal\tElectTotal\tTheory\t\tPractical\tPercentage\tGrade");
		        for (int i = 0; i < n; i++) {
		            System.out.print(stud[i]);
		            stud[i].calculateGrade();
		        }
		        sc.close();
		    }
		}