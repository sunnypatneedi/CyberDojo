package com.sunnycorp;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by spatneedi on 9/22/16.
 */
public class FizzBuzzTest {
    public static FizzBuzz fb = null;

    @BeforeClass
    public static void testSetup(){
        fb = new FizzBuzz();
    }

    @Test
    public void testPrintArray(){
        fb.getFizzBuzzArray().stream().forEach(System.out::println);
    }

    @Test
    public void testNumberOne(){
        assertThat(fb.getFizzBuzzArrayValue(1)).contains("1");
    }

    @Test
    public void testFizz() {
        assertThat(fb.getFizzBuzzArrayValue(3)).contains("Fizz");
    }

    @Test
    public void testBuzz() {
        assertThat(fb.getFizzBuzzArrayValue(5)).contains("Buzz");
    }

    @Test
    public void testFizzBuzz() {
        assertThat(fb.getFizzBuzzArrayValue(15)).contains("FizzBuzz");
    }

    @Test
    public void testNumberSixForFizz() {
        assertThat(fb.getFizzBuzzArrayValue(6)).contains("Fizz");
    }

    @Test
    public void testNumberTenForBuzz() {
        assertThat(fb.getFizzBuzzArrayValue(10)).contains("Buzz");
    }

    @Test
    public void testNumberSixtyForFizzBuzz() {
        assertThat(fb.getFizzBuzzArrayValue(60)).contains("FizzBuzz");
    }

    @Test
    public void testNumberHundred(){
        assertThat(fb.getFizzBuzzArrayValue(100)).contains("Buzz");
    }

    @Test
    public void testNumberZero(){
        assertThat(fb.getFizzBuzzArrayValue(0)).isEmpty();
    }

    @Test
    public void testANegativeNumber(){
        assertThat(fb.getFizzBuzzArrayValue(-2)).isEmpty();
    }

    @Test
    public void testHuuuugeNumber(){
        assertThat(fb.getFizzBuzzArrayValue(918273645)).isEmpty();
    }
}
