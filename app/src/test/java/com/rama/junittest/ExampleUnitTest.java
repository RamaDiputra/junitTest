package com.rama.junittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    public void testAddition(){
        MathOperation math = new MathOperation(); //membuat objek math dari MathOperation()
        int result = math.add(4, 3);    //memberi nilai pada parameter method add
        assertEquals(7, result);    //disini hasil akan pass apabila result sama dengan 7
        
    }
}