package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.avgSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateHighestMonth() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.highestMonth(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLowestMonth() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.lowestMonth(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateHighestMonthCount() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countHighMonths(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLowestMonthCount() {
        StatsService service = new StatsService();

        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countLowMonths(data);
        Assertions.assertEquals(expected, actual);
    }
}
