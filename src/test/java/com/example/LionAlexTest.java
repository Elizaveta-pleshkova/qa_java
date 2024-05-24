package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;
    @Test
    public void getKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Mockito.when(feline.getKittens(0)).thenReturn(0);
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> listFriend = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals(listFriend, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex(feline);
        String placeOfLiving = "Нью-Йоркский зоопарк";
        Assert.assertEquals(placeOfLiving, alex.getPlaceOfLiving());
    }
}