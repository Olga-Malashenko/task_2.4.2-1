package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for(int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calcSum(sales)/sales.length;
    }

    public int findMaxSaleMonth(int[] sales) {
        int maxSaleMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSaleMonth]) {
                maxSaleMonth = month;
            }
            month += 1;
        }
        return maxSaleMonth + 1;
    }

    public int findMinSaleMonth(int[] sales) {
        int minSaleMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minSaleMonth]) {
                minSaleMonth = month;
            }
            month += 1;
        }
        return minSaleMonth + 1;
    }

    public int numberMonthOverAvg(int[] sales) {
        int avgSale = findAvg(sales);
        int counter = 0;

        for (int sale : sales) {
            if (sale > avgSale) {
                counter +=1;
            }
        }
        return counter;
    }

    public int numberMonthUnderAvg(int[] sales) {
        int avgSale = findAvg(sales);
        int counter = 0;

        for (int sale : sales) {
            if (sale < avgSale) {
                counter +=1;
            }
        }
        return counter;
    }


}
