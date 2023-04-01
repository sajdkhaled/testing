package task1;

import java.beans.Transient; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class PersonTest { 
    @Test public void testName(){ 
        Person classUnderTest = new Person(); 
        classUnderTest.setName("sajd"); 
        String expectedName = "sajd"; 
        String actualNmae = classUnderTest.getName(); 
        assertEquals(expectedName,actualNmae);
 
    } 
    @Test public void testSetAge(){ 
        Person classUnderTest = new Person(); 
        classUnderTest.setAge(21); 
        Integer expectedAge = 21; 
        Integer actualAge = classUnderTest.getAge(); 
        assertEquals(expectedAge,actualAge); 
 
    } 
 
    @Test public void testNegativeAge1(){ 
        Person classUnderTest = new Person(); 
        classUnderTest.setAge(-21); 
        int expectedAge = 0; 
        int actualAge = classUnderTest.getAge(); 
        assertEquals(expectedAge,actualAge); 
    } 
     
}
