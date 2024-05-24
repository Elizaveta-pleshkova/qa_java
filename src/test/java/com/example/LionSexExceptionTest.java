package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionSexExceptionTest {
    private static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самей или самка";
    private String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"unknown"},
                {null},
                {"АльфаСамец"}
        };
    }

    public LionSexExceptionTest(String sex){
        this.sex = sex;
    }

    @Test
    public void doesHaveMane() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> new Lion(sex, feline));
        Assert.assertEquals(EXPECTED_ERROR, exception.getMessage());
    }
}
