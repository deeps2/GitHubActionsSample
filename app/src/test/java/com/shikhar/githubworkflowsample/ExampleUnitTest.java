package com.shikhar.githubworkflowsample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_addition() {
        Foo foo = new Foo();
        int sum = foo.add2Num(2, 3);
        assertEquals(5, sum);
    }

    @Test
    public void test_subtraction() {
        Foo foo = new Foo();
        int difference = foo.difference2Num(5, 4);
        assertEquals(2, difference);
    }
}