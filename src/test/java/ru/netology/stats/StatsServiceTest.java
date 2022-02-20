package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findSumOfsales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSumOfsales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAverage(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findUnderAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findOverAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}