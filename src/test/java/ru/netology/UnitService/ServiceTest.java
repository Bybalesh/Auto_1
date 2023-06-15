package ru.netology.UnitService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceTest {

    @Test
    public void shouldReturnIfAmountIs1000() {
        Service service = new Service();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnIfAmountIs0() {
        Service service = new Service();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnIfAmountIs667() {
        Service service = new Service();
        int amount = 333;

        int actual = service.remain(amount);
        int expected = 667;

        Assert.assertEquals(actual,expected);
    }
}