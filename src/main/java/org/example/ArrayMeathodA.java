package org.example;

public class ArrayMeathodA {

//Short-Hand Meathod
   public static String[] TeacherNames(String[] teacher) {


       for (int i = 0; i < teacher.length; i++)
           System.out.println("Teacher " + i
                   + " : " + teacher[i]);

       return teacher;
   }
}