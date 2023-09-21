/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package studentmenu;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class StudentTest {
   
    public StudentTest() {
    }

    @Test
    public void testSaveStudent() {//checks if student is saved in letters
       Student student = new Student();
       Scanner kb = new Scanner("1\nTristan\n19\ntristan.gmail.com\ndisd");     
           String expected = student.SaveStudent(kb);
        
        assertEquals("1\nTristan\n19\ntristan.gmail.com\ndisd",expected);
    }
    
    @Test
    public void testSearchStudent(){//check if the student is in the array
       Student student = new Student();
        Scanner kb = new Scanner("1\n");
        
        student.studentID = "1";
        kb = new Scanner("1\n");
        student.studentID = student.searchStudent(kb);
        
        assertNotNull(student.studentID);
        assertEquals("1", student.studentID);
        
               
        
        
    }
    
    @Test
    public void TestSearchStudent_StudentNotFound(){//checks the array if student is not found
        Student student = new Student();
         Scanner kb = new Scanner("1\n");
        
        
         
         kb = new Scanner("3\n");
         student.studentID = student.searchStudent(kb);
         
         assertNotEquals(3,student.studentID);
    }
    
    
    @Test
    public void TestDeleteStudent() {//checks to see if the user has been deleted
       
       Student student = new Student();
        
        Scanner kb = new Scanner("1");//sample data
        student.studentID =("1");
        String yes = ("y");
       
         // Call the deleteStudent method with confirmation
        String output =student.deleteStudent(kb , yes);

        // Assert that the output contains the deletion confirmation message
        assertTrue(output.contains("Student with Student ID: 1 WAS deleted"));
        assertNull(student.deleteStudent(kb,"y")); // Check that the student is deleted
        
        
        
    }
    
    @Test
    public void TestStudentAge_StudentAgeValid(){
        Student student = new Student();
        
        Scanner kb = new Scanner ("19\n");
        
        student.studentAge = 19;
        
        String output = student.SaveStudent(kb);
        
        assertEquals(kb,student.studentAge);
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalid(){
         Student student = new Student();
        
        Scanner kb = new Scanner ("19\n");
        
        student.studentAge = 19;
        
        String output = student.SaveStudent(kb);
        
        assertNull(student.studentAge);
        assertEquals(kb,student.studentAge);
        
    }
     @Test
    public void TestStudentAge_StudentAgeInvalidCharacter(){
         Student student = new Student();
        
        Scanner kb = new Scanner ("t\n");
        
        student.studentAge = 19;
        
        String output = student.SaveStudent(kb);
        
        assertNull(student.studentAge);
        assertEquals(kb,student.studentAge);
    }
    
    
}
