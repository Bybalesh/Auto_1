package ru.netology.UnitService;

import  org.junit.Assert.*;
import  org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void shouldGiveChange1000() {
        Service service = new Service();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldGiveChange0() {
        Service service = new Service();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldGiveChange667() {
        Service service = new Service();
        int amount = 333;

        int actual = service.remain(amount);
        int expected = 667;

        assertEquals(expected,actual);
    }
}