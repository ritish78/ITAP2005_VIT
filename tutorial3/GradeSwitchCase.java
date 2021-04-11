package com.company.tutorial.tutorial3;

import java.util.Scanner;

public class GradeSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String grade = scanner.nextLine();

        String remarks = checkGradeRemark(grade);
        System.out.println(remarks);
    }

    public static String checkGradeRemark(String grade) {
        String remark;
        switch (grade) {
            case "A":
                remark = "Excellent work";
                break;
            case "B":
            case "C":
                remark = "Well done";
                break;
            case "D":
                remark = "Pass";
                break;
            case "F":
                remark = "Fail. Better Luck next time.";
                break;
            default:
                remark = "Incorrect grade";
        }
        return remark;
    }
}
