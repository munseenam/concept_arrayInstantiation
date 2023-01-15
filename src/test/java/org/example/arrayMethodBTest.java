package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
  //declaration and instantiation
class arrayMethodBTest {
    @Test
void TestArrayInstantiation() {

    arrayMethodB teacherHour = new arrayMethodB();

        int hour[] = new int[5];
    hour[0]=10;//initialization
    hour[1]=20;
    hour[2]=70;
    hour[3]=40;
    hour[4]=50;
    int[] hours = teacherHour.TeacherAvailableHours(hour);
    assertArrayEquals(hour,hours);

}

  }