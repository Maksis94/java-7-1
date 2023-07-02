package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        if (sales.length == 0) {
            return 0;
        } else {
            return sum / sales.length;
        }
    }

    public int highestMonth(long[] sales) {
        int monthId = 0;
        long amount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= amount) {
                amount = sales[i];
                monthId = i;
            }
        }

        return monthId + 1;
    }

    public int lowestMonth(long[] sales) {
        int monthId = 0;
        long amount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= amount || i == 0) {
                amount = sales[i];
                monthId = i;
            }
        }

        return monthId + 1;
    }

    public int countLowMonths(long[] sales) {
        long sum = 0;
        long avg = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        if (sales.length == 0) {
            avg = 0;
        } else {
            avg = sum / sales.length;
        }

        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }

        return count;
    }

    public int countHighMonths(long[] sales) {
        long sum = 0;
        long avg = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        if (sales.length == 0) {
            avg = 0;
        } else {
            avg = sum / sales.length;
        }

        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }

        return count;
    }
}
