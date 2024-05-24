package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest {

    boolean expRes;
    String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    public LionSexTest(String sex, boolean expRes){
        this.sex = sex;
        this.expRes = expRes;
    }


    @Test
    public void doesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expRes, lion.doesHaveMane());
    }

}
