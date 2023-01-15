package org.example;

public class arrayMethodB {

        //Short-Hand Meathod
        public static int[] TeacherAvailableHours(int[] hours) {

            for (int i = 0; i < hours.length; i++)
                System.out.println("available hours of teacher " + i
                        + " : " + hours[i]+"hr");


            return hours;
        }
    }

