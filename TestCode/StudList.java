/**
 * Kate McDowall
 * 13 October 2015
 * Proj 2 StudList
 */

import java.util.*;

public class StudList
{
     ArrayList<Student> students = new ArrayList<Student>();
    public  int currentSize;
    Scanner scr = new Scanner(System.in);


    public void addStudentToList() {
        System.out.println("Add Student");
        Student stu = new Student();
        

        System.out.println("*********************************");
        System.out.print("Enter student name: ");
        parseUserInput(stu,scr.nextLine());
        System.out.print("Enter student number: ");
        stu.setNum(scr.nextInt());
        String clearBufferrr = scr.nextLine();;
        System.out.print("Enter student GPA: ");
        stu.setGpa(scr.nextDouble());
        if (studList.length() > currentSize) {
            studList[currentSize] = stu;
            currentSize++;
        } else {
            Student[] anotherArray = new Student[currentSize + 25];
            for (int n = 0; n < currentSize; n++) {
                anotherArray[n] = studList[n];
            }
            studList = anotherArray;
        }
    }

    public void deleteStudentFromList() {
        System.out.println("Delete Student");
        Scanner scr = new Scanner(System.in);
        //  Delete by name::
        
        //  Delete by stuNumber::
        
        //  Delete by GPA::
    }

    public void editStudentList() {
        System.out.println("Edit List");
        Scanner scr = new Scanner(System.in);
        //  Edit name::
        
        //  Edit stuNumber::
        
        //  Edit GPA::        
    }

    public void clearList() {        
        System.out.println("Clear List");
        for (int index = 0; index < currentSize; index++) {
            studList[index] = null;
        }
        System.out.println("\nPress any key to continue");
        String pause = scr.nextLine();
    }

    public void searchList() {
        System.out.println("Search List");
        System.out.println("If you would like to enter a name press 1. To enter a student number press 2");
        int answer = scr.nextInt();
        String clearBuffer = scr.nextLine();
        if (answer == 1) {
            System.out.println("Please enter student name: ");
            String nameSearch = scr.nextLine();
            for(int i = 0; i < currentSize; i++) {
                if (nameSearch.equals(studList[i].getfullName())) {
                    System.out.println("Name: " + studList[i].getfullName());
                    System.out.println("Number: " + studList[i].getstuNumber());
                    System.out.println("GPA: " + studList[i].getGpa());
                } else {
                    System.out.println("No match found");

                }
            }
        }

        if (answer == 2) {
            System.out.println("Please enter student number: ");
            int numSearch = scr.nextInt();
            for(int i = 0; i < currentSize; i++) {
                if (numSearch == studList[i].getstuNumber()) {
                    System.out.println("Name: " + studList[i].getfullName());
                    System.out.println("Number: " + studList[i].getstuNumber());
                    System.out.println("GPA: " + studList[i].getGpa());
                } else {
                    System.out.println("No match found");

                }
            } 
        }
    }

    public void printList() {

        System.out.println("Print Students");
        for (int i = 0; i < currentSize; i++) {
            if(studList[i] != null) {
                System.out.print("Student: ");
                System.out.print("\t" + studList[i].getstuNumber());
                System.out.print("\t" + studList[i].getfullName());
                System.out.print("\t" + studList[i].getGpa());
            }
        }
        System.out.println();
    }

    public static void parseUserInput(Student stu, String name) {


    }
}

