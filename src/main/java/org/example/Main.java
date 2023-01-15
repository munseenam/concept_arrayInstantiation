package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("WELCOME TO WISDOM PUBLIC SCHOOL");
        System.out.println("------------------------------------------");
        System.out.println("All the available teachers are listed below:");

        ArrayMeathodA teacher=new ArrayMeathodA();
        String[] Teacher = {"monisha", "tom", "bincy", "roy", "jhon"};
        teacher.TeacherNames(Teacher);

        arrayMethodB teacherHour = new arrayMethodB();
        System.out.println("\nAvailable hours:\n");
        int hour[] = new int[5];
        hour[0]=1;//initialization
        hour[1]=2;
        hour[2]=1;
        hour[3]=3;
        hour[4]=1;
teacherHour.TeacherAvailableHours(hour);
    }
}