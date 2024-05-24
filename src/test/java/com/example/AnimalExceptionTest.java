package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalExceptionTest {

    private static final String EXPECTED_ERROR = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    private String animalKind;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"unknown"},
                {null},
                {"ТравоядныйХищник"}
        };
    }

    public AnimalExceptionTest(String animalKind){
        this.animalKind = animalKind;
    }

    @Test
    public void getFood(){
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood(animalKind));
        Assert.assertEquals(EXPECTED_ERROR, exception.getMessage());
    }
}
