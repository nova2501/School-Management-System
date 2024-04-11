package School_Managment_System;

import java.util.Scanner;

public class Teacher implements justice{
    String name;
    int age;
    String subject;

    String depart;
    String phone;
    public void add_details()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Teacher Name: ");
        name=s.next();
        System.out.println("Enter the Subject");
        subject=s.next();
        System.out.println("Enter the Age");
        age=s.nextInt();
        System.out.println("Enter the department:");
        depart=s.next();
        System.out.println("Enter the phone number");
        phone=s.next();
        System.out.println("Added Successfully");
    }
    public void get_details()
    {
        System.out.println("Teacher Name:"+name);
        System.out.println("Teacher Age:"+age);
        System.out.println("Subject:"+subject);
        System.out.println("Department:"+depart);
        System.out.println("Phone Number:"+phone);
    }

}
