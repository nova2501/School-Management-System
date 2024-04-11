package School_Managment_System;

import java.util.Scanner;

public class Main {
    public static void main_menu()
    {
        System.out.println("1.Add Student");
        System.out.println("2.Add Teacher");
        System.out.println("3.Display Stduent");
        System.out.println("4.Display Teacher");
        System.out.println();
        System.out.println("Enter the Choice:");

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student st[]=new Student[10];
        Teacher th[]=new Teacher[10];
        int s_count=0;
        int t_count=0;
        System.out.println();
        System.out.println("=================**SCHOOL MANAGMENT SYSTEM**==============");
        int ch=4;
        while(ch!=0)
        {
            main_menu();
            ch=s.nextInt();
            while(ch!=0 && ch!=5)
            {
                switch(ch)
                {
                    case 1:
                        st[s_count]=new Student();
                        st[s_count].add_details();
                        s_count++;
                        System.out.println();
                        System.out.println("5.Go to Main Menu");
                        System.out.println("0.Exit");
                        System.out.println();
                        System.out.println("Enter the choice");
                        ch=s.nextInt();
                        break;
                    case 2:
                        th[t_count]=new Teacher();
                        th[t_count].add_details();
                        t_count++;
                        System.out.println();
                        System.out.println();
                        System.out.println("5.Go to Main Menu");
                        System.out.println("0.Exit");
                        System.out.println();
                        System.out.println("Enter the choice");
                        ch=s.nextInt();
                        break;
                    case 3:
                        for(int i=0;i<s_count;i++)
                        {
                            st[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO TO MAIN MENU");
                        System.out.println("0.EXIT");
                        System.out.println();
                        System.out.println();
                        System.out.println("Enter your choice ");
                        ch=s.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<t_count;i++)
                        {
                            th[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO TO MAIN MENU");
                        System.out.println("0.EXIT");
                        System.out.println();
                        System.out.println();
                        System.out.println("Enter your choice ");
                        ch=s.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid input");
                        break;


                }

            }
        }

    }
}
