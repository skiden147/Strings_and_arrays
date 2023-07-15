package ru.netology.stats;

public class StatsService {

    public int salesResult(long[] sales) {
        int sum = 0;
        for (long s : sales) {
            sum += s;
        }
        return sum;
    }


    public int averageSales(long[] sales) {
        int sum = salesResult(sales);
        return sum / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int underAverageMonths(long[] sales) {
        double sum = averageSales(sales);
        int monthsAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sum) {
                monthsAmount++;
            }
        }

        return monthsAmount;
    }


    public int aboveAverageMonths(long[] sales) {
        double sum = averageSales(sales);
        int monthsAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum) {
                monthsAmount++;
            }
        }

        return monthsAmount;
    }


}
