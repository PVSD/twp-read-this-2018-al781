package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args) throws IOException
            {
	            Scanner textFileScanner = new Scanner(new File("C:\\Users\\pokem\\IdeaProjects\\twp-read-this-2018-al781\\src\\Imports.txt")).useDelimiter("\t");
	            textFileScanner.nextLine();
                ArrayList<Student> students = new ArrayList<>();
	            while(textFileScanner.hasNext())
                    {
                        String fname = textFileScanner.next();
                        String lname = textFileScanner.next();
                        int grade = textFileScanner.nextInt();
                        textFileScanner.next();
                        int absent = textFileScanner.nextInt();
                        students.add(new Student(fname,lname,grade,absent));
                    }
                ClassOfStudents Classes = new ClassOfStudents(students);
                System.out.println(Classes.getNumberA());
                System.out.println(Classes.getNumberB());
                System.out.println(Classes.getNumberC());
                System.out.println(Classes.getNumberD());
                System.out.println(Classes.getNumberF());
                System.out.println(Classes.search("Tupac"));

            }
    }
