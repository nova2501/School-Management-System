package School_Managment_System;

import java.util.Scanner;

public class Student implements justice{
    String name;
    int age;
    String rollno;
    String depart;
    String phone;

    @Override
    public void get_details() {
        System.out.println("Student Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Age:"+age);
        System.out.println("Department:"+depart);
        System.out.println("Phone Number:"+phone);

    }

    @Override
    public void add_details() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        name=s.next();
        System.out.println("Enter the Rollno");
        rollno=s.next();
        System.out.println("Enter the Age");
        age=s.nextInt();
        System.out.println("Enter the department:");
        depart=s.next();
        System.out.println("Enter the phone number");
        phone=s.next();
        System.out.println("Added Successfully");



    }
}
