package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalculateSum(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum (array);

        assertEquals (expected, actual);
    }

    @Test
    void shouldCalculateAverageSum(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int averageSum = service.calculateAverageSum(array);
        int actual = averageSum;

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateMonthNumberMax(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMonthNumberMax(array);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateMonthNumberMin(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMonthNumberMin(array);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateBelowAverageMonths(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateBelowAverageMonths(array);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateAboveAverageMonths(){
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAboveAverageMonths(array);

        assertEquals(expected, actual);

    }

}
