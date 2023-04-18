package edu.berkeley.aep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void onePlusOneShouldBeTWO(){
        Calculator cal = new Calculator();
        assertEquals(2, cal.addition(1,1));
    }
    @Test
    public void twoMinusOneShouldBeONE(){
        Calculator cal = new Calculator();
        assertEquals(1, cal.subtraction(2,1));
    }
    @Test
    public void twoMultipliedByThreeShouldBeSIX(){
        Calculator cal = new Calculator();
        assertEquals(6, cal.multiplication(2,3));
    }
}
