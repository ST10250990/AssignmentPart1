/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmenu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Student {

    //Declarations of variables
    public String studentID = "";
    public String studentName = "";
    public int studentAge = 0;
    public String studentEmail = "";
    public String studentCourse = "";
    public String studentDetails = "";
    public int manyStudents; //See how many students need to be captured
    ArrayList<String> arrStuID = new ArrayList<>();
    ArrayList<String> arrStuName = new ArrayList<>();
    ArrayList<Integer> arrStuAge = new ArrayList<>();
    ArrayList<String> arrStuEmail = new ArrayList<>();
    ArrayList<String> arrStuCourse = new ArrayList<>();

    public String SaveStudent(Scanner kb) {//method responsible to add a student or save
        //to save a student or students

        System.out.println("CAPTURE A NEW STUDENT\n************************  ");
        System.out.print("Enter the student id: ");
        studentID = kb.nextLine();
        arrStuID.add(studentID);//add into the array

        System.out.print("Enter the student name: ");
        studentName = kb.nextLine();
        arrStuName.add(studentName);//add into the array

        do {//this do while is to check if there is a letter in the age 
            System.out.print("Enter the student age(Age must be greater than 16): ");
            while (!kb.hasNextInt()) {
                String input = kb.next();
                System.out.println("You have entered a incorrect student age!!! ");
                System.out.println("Please re-enter the student age>>(Must be over 16 years old) ");
            }

            studentAge = kb.nextInt();

            if (studentAge < 16) {//this if statement is to check if the age is less than 16 or not
                System.out.println("Please re-enter the student age>>(Must be over 16 years old) ");
            }
        } while (studentAge < 16);
        {
            System.out.println("Valid student age entered");
            arrStuAge.add(studentAge);//add into the array

        }
        kb.nextLine();
        System.out.print("Enter the student email: ");
        studentEmail = kb.nextLine();
        arrStuEmail.add(studentEmail);//add into the array

        System.out.print("Enter the student course: ");
        studentCourse = kb.nextLine();
        arrStuCourse.add(studentCourse);//add into the array

        studentDetails = studentID + "\n" + studentName + "\n" + studentAge + "\n" + studentEmail + "\n" + studentCourse;

        return studentDetails;//helps for unit testing
    }

    public String searchStudent(Scanner kb) {//method responsible to search a student

        String searchStudent = "";
        System.out.println("Please enter the student ID to search");
        searchStudent = kb.next();
        System.out.println("-----------------------------------");
        
        if (arrStuID.contains(searchStudent)) {//checks the id of student in the array
            int index = arrStuID.indexOf(searchStudent);
            System.out.println("Student ID: " + arrStuID.get(index));
            System.out.println("Student Name: " + arrStuName.get(index));
            System.out.println("Student Age: " + arrStuAge.get(index));
            System.out.println("Student Email: " + arrStuEmail.get(index));
            System.out.println("Student Course: " + arrStuCourse.get(index));
            System.out.println("--------------------------------");

        } else {//doesnt find the student ID
            System.out.println("----------------------------------");
            System.out.println("Student with Student ID " + searchStudent + " Was not found");
            System.out.println("-----------------------------------");

        }
        return studentID;
    }

    public String deleteStudent(Scanner kb, String yes) {//method responsible to delete student

        String deleteID;

        System.out.println("Enter the student id you want to delete");
        deleteID = kb.nextLine();
        System.out.println("Are you sure you want to delete student " + deleteID + " from the system? Yes(y) to delete.");
        yes = kb.next();
        if (yes.equals("y")) {//checks when the user wants to delete the student by pressing "y"
            int index = arrStuID.indexOf(deleteID);

            arrStuID.remove(deleteID);
            arrStuName.remove(deleteID);
            arrStuAge.remove(deleteID);
            arrStuEmail.remove(deleteID);
            arrStuCourse.remove(deleteID);
            System.out.println("----------------------------");
            System.out.println("Student with Student ID: " + deleteID + " WAS deleted");
            System.out.println("---------------------------------");

        }
        String output = "Student with Student ID: " + deleteID + "WAS deleted";
        return output;
    }

    public void reportStudent() {//the method responsible for showing all info on students added
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < arrStuID.size(); i++) {//checks the whole array and displays all the information in it
            System.out.println("Student " + i);
            System.out.println("-----------------------------");
            System.out.println("STUDENT ID: " + arrStuID.get(i));
            System.out.println("STUDENT NAME: " + arrStuName.get(i));
            System.out.println("STUDENT AGE: " + arrStuAge.get(i));
            System.out.println("STUDENT EMAIL: " + arrStuEmail.get(i));
            System.out.println("STUDENT COURSE: " + arrStuCourse.get(i));
            System.out.println("------------------------------");

        }

    }

}
