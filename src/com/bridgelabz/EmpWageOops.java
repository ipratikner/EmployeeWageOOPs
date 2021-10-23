package com.bridgelabz;
import java.util.Random;

    public class EmpWageOops {
         public static void main(String[] args) {
             Attendance attendance = new Attendance();
             //attendance.EmployeeCheck();
             System.out.println("monthly wage is: "+attendance.EmployeeCheck());
    }
}
        class Attendance{
            static final int IS_PRESENT = 1;
            static final int IS_ABSENT = 0;
            static final int WAGE_PER_HOUR = 20;
            static final int IS_FULL_TIME = 8;
            static final int IS_PART_TIME = 4;
            static final int NO_OF_WORKING_DAYS=20;
            int dailyWage = 0;
            int monthlyWage = 0;

    int GetEmployeePresent(int a) {
        Random r = new Random();
        int empCheck = r.nextInt(a);
        return empCheck;
    }
    int EmployeeCheck() {
        int empCheck = GetEmployeePresent(3);
        switch (empCheck) {
            case IS_PRESENT: {
                //System.out.println("Employee is present");
                dailyWage = WAGE_PER_HOUR * IS_FULL_TIME;
                break;

            }
            case IS_ABSENT: {
                //System.out.println("Employee is Absent");
                dailyWage = dailyWage;
                break;
            }
            default: {
                //System.out.println("Employee is Part time");
                dailyWage = WAGE_PER_HOUR * IS_PART_TIME;
                break;
            }

        }
        monthlyWage = NO_OF_WORKING_DAYS * dailyWage;
        return monthlyWage;
    }
}