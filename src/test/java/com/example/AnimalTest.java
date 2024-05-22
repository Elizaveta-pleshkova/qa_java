package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    List<String> listFood;
    String animalKind;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    public AnimalTest(String animalKind, List<String> listFood){
        this.animalKind = animalKind;
        this.listFood = listFood;
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(listFood, animal.getFood(animalKind));
    }
}
