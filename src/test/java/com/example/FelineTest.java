package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {


    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> listFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(listFood, feline.eatMeat());
    }

    @Test
    public void getFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensSeveral(){
        Feline feline = new Feline();
        Assert.assertEquals(3, feline.getKittens(3));
    }
}
