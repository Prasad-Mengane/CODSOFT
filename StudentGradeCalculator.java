package com.java.dev;
import java.util.*;

class Grade{
    public void Marks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Subject: ");
        int sub = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=sub; i++){
            System.out.print("Enter Subject "+i+" Marks (out of 100): ");
            int marks = sc.nextInt();
            sum += marks;
        }
        double avg = sum/sub;
        char grade;
        if(avg >= 80){
            grade = 'A';
        }
        else if(avg >= 50 && avg <80){
            grade = 'B';
        }
        else if(avg >= 35 && avg < 50){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        System.out.print("\nTotal Marks: "+sum);
        System.out.print("\nAverage Percentage: "+avg);
        System.out.print("\nGrade: "+grade);
        sc.close();
    }
}
public class StudentGradeCalculator {
	public static void main(String[] args) {
		Grade obj = new Grade();
		obj.Marks();
	}
}
