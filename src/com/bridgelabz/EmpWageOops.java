package com.bridgelabz;
import java.util.Random;

public class EmpWageOops {

    public static void main(String[] args) {

        Attendance attendance = new Attendance(); // created object
        attendance.EmployeeCheck(); // method calling
    }
}
    class Attendance{
    final int IS_PRESENT = 1;

    int GetEmployeePresent(int a) {
        Random r = new Random();
        int empCheck = r.nextInt(a);
        return empCheck;
    }
    void EmployeeCheck() {
        int empCheck = GetEmployeePresent(2);
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
        } else
            System.out.println("Employee is Absent");
    }
}