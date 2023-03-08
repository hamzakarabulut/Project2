package StudentDBApp;

import java.util.Scanner;

public class Student {

    private String fname;
    private String lname;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor : prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name : ");
        this.fname = in.nextLine();

        System.out.println("Enter Student last name : ");
        this.lname = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level : ");
        this.gradeYear = in.nextInt();
        setStudentId();
        System.out.println(fname + " " + lname + " " + gradeYear + " " +studentId);

        
    }

    //Generate ID
    private void setStudentId(){
        // grade level + ıd
        id++;
        this.studentId = gradeYear + "" + id;
    }
    //Enroll in cources
    public void enroll(){
        do {
            System.out.println("Enter cource to enroll (Q to quit): ");
            Scanner in  = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;                
            }else{
                System.out.println("BREAK!");
                break;
            }
            
        } while (1 != 0);
        System.out.println("ENROLLED IN : " +  courses);
        System.out.println("TUTION BALANCE : " + tuitionBalance);
    }

    // Pay Tuition

    //Show Status

}
