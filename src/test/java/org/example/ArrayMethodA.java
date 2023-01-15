package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodATest {

    @Test
    void ToCheckDeclarationOfArray(){
        ArrayMeathodA teacherName=new ArrayMeathodA();

        String[] Teacher = {"monisha", "tom", "bincy", "roy", "jhon", "allen", "fred", "alex", "nayomi", "nainika"};
        String[] Names=teacherName.TeacherNames(Teacher);
         assertArrayEquals(Names,Teacher);



    }
}