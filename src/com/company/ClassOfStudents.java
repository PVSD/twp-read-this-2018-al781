package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class ClassOfStudents
    {
        public ArrayList<Student> students;

        public ClassOfStudents(ArrayList<Student> ArrayOfStudents)
            {
                students = ArrayOfStudents;
                sort();
            }



        public void sort()
            {
                boolean tracker = true;
                while(tracker)
                    {
                        for (int i = 0; i < students.size(); i++)
                            {
                                if (students.get(i).getGrade() > students.get(i-1).getGrade())
                                    {
                                        Collections.swap(students, i, i-1);
                                    }
                                else
                                    {
                                        tracker = false;
                                    }
                            }
                    }
            }

        public int getNumberF()
            {
                int count = 0;
                for(int i = 0; i < students.size(); i++)
                    {
                        if (students.get(i).getGrade() < 60)
                            {
                                count ++;
                            }
                    }
                return count;
            }

        public int getNumberD()
            {
                int count = 0;
                for(int i = 0; i < students.size(); i++)
                    {
                        if (students.get(i).getGrade() >= 60 && students.get(i).getGrade() < 70)
                            {
                                count ++;
                            }
                    }
                return count;
        }
        public int getNumberC()
        {
            int count = 0;
            for(int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getGrade() >= 70 && students.get(i).getGrade() < 80)
                {
                    count ++;
                }
            }
            return count;
        }
        public int getNumberB()
        {
            int count = 0;
            for(int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getGrade() >= 80 && students.get(i).getGrade() < 90)
                {
                    count ++;
                }
            }
            return count;
        }
        public int getNumberA()
        {
            int count = 0;
            for(int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getGrade() >= 90)
                {
                    count ++;
                }
            }
            return count;
        }
        public String search(String finder)
            {
                String returner = "";
                for(int i = 0; i < students.size(); i++)
                    {
                        if (students.get(i).getFirstName().equalsIgnoreCase(finder) || students.get(i).getLastName().equalsIgnoreCase(finder))
                            {
                                returner = students.get(i).getFirstName() + " " + students.get(i).getLastName();
                            }
                    }
                return returner;
            }
    }
