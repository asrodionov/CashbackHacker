package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldAskBuyAnother100() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAskBuyAnother500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAskBuyAnother900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAskBuyAnother0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}