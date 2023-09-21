/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmenu;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class StudentMenu {

    /**
     * @param args the command line arguments
     */
    //instatiating 
     static Scanner kb = new Scanner(System.in);
     public static Student stu = new Student();
    public static void main(String[] args) {
        // TODO code application logic here
        
        String menuKey;//To launch the menu
        String menuItems;//to chose which menu item you want to go into to
       
        System.out.println("STUDENT MANAGEMENT APPLICATION \n************************");
        
        boolean UseMenu = true;
         
        while (UseMenu == true) {
                 System.out.println("Enter (1) to launch menu or any other key to exit");
        menuItems = kb.next();
        kb.nextLine();
        if (menuItems.equals("1")) {//if else statement to launch the menu or quit program
            UseMenu = true;
            
        }else if (menuItems != "1" ){
            UseMenu = false;
            System.out.println("Quitiing program");
            System.exit(0);
        }
            
            
         System.out.println("Please select one of the following menu items\n(1) Capture a new student\n"
                    + "(2) Search for a student\n(3) Delete a student\n(4) Print Student report\n(5) Exit Application ");
         
            
            menuItems= kb.nextLine();
            
            switch (menuItems) {//switch case to go to methods that user wants to go into
                case "1":
                    stu.SaveStudent(kb);//add a student
                    break;
                case "2":
                    stu.searchStudent(kb);break;//search a student
                case "3":
                    stu.deleteStudent(kb,"Yes");break;//delete a student
                case "4":
                    stu.reportStudent();break;//show all students that are added
                    
                case "5":
                    System.out.println("Quitting program");//exit program
                    System.exit(0); 
                    
                default:break;
            
        

        
           
            }
                
        }
        
        
  
            
            
        
    
                    
        
           
    }
    
    }

    
        
        
        
      
        
        
    
   
    
    

