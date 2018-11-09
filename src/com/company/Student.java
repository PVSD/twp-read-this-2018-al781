package com.company;

public class Student
    {
        public String firstName;
        public String lastName;
        public int grade;
        public int daysAbsent;

        public Student (String FirstName, String LastName, int Grade, int DaysAbsent)
            {
                firstName = FirstName;
                lastName = LastName;
                grade = Grade;
                daysAbsent = DaysAbsent;
            }

        public String getFirstName()
            {
                return firstName;
            }

        public String getLastName()
            {
                return lastName;
            }

        public int getGrade()
            {
                return grade;
            }

        public int getDaysAbsent()
            {
                return daysAbsent;
            }
    }
