package com.bridgelabz;
import java.util.Random;

    public class EmpWageOops {

        public static void main(String[] args) {
            Attendance attendance = new Attendance();
            attendance.EmployeeCheck();
    }
}
    class Attendance{
        static final int IS_PRESENT = 1;
        static final int IS_ABSENT = 0;
        static final int WAGE_PER_HOUR = 20;
        static final int IS_FULL_TIME = 8;
        static final int IS_PART_TIME = 4;
        int dailyWage = 0;

    int GetEmployeePresent(int a) {
        Random r = new Random();
        int empCheck = r.nextInt(a);
        return empCheck;
    }

    void EmployeeCheck() {
        int empCheck = GetEmployeePresent(3);
        switch (empCheck) {
            case IS_PRESENT: {
                System.out.println("Employee is present");
                dailyWage = WAGE_PER_HOUR * IS_FULL_TIME;
                break;

            }
            case IS_ABSENT: {
                System.out.println("Employee is Absent");
                dailyWage = dailyWage;
                break;
            }
            default: {
                System.out.println("Employee is Part time");
                dailyWage = WAGE_PER_HOUR * IS_PART_TIME;
                break;
            }
        }
        System.out.println("Daily Wage : " + dailyWage);
    }
}