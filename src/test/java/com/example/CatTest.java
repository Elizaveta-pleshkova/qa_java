package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    String sound = "Мяу";

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals(sound, cat.getSound());
    }

    @Test
    public void getFood() throws Exception{
        Cat cat = new Cat(feline);
        List<String> listFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(listFood);
        Assert.assertEquals(listFood, cat.getFood());
    }
}
