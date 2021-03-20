package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @org.testng.annotations.Test
    public void shouldSummaLess1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSummaMore1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void shouldSummaEquals1000() {
        CashbackHackerService service=new CashbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}