package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println(service.countHighMonths(data));
        System.out.println(service.countLowMonths(data));
        System.out.println(service.highestMonth(data));
        System.out.println(service.lowestMonth(data));
        System.out.println(service.sumSales(data));
        System.out.println(service.avgSales(data));
    }
}
