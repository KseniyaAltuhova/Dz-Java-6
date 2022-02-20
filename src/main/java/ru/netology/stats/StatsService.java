package ru.netology.stats;

public class StatsService {

    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = findSum(sales);
        System.out.println("Сумма всех продаж: " + sum + " рублей");

        int average = findAverage(sales);
        System.out.println("Средняя сумма продаж в месяц: " + average + " рублей");

        int monthMax = findMax(sales);
        System.out.println("Пик продаж в месяце номер " + monthMax);


        int monthMin = findMin(sales);
        System.out.println("Минимальные продажи в месяце номер " + monthMin);

        long monthUnderAverage = findUnderAverage(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthUnderAverage);

        long monthOverAverage = findOverAverage(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthOverAverage);
    }

    public static int findSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static int findAverage(long[] sales) {
        return findSum(sales)/sales.length;
    }

    public static int findMax(long[] sales) {
        long max = sales[0];
        int number = 0;
        int numberMax = 0;
        for (long sale : sales) {
            number++;
            if (max <= sale) {
                max = sale;
                numberMax = number;
            }
        }
        return numberMax;
    }

    public static int findMin(long[] sales) {
        long min = sales[0];
        int number = 0;
        int numberMin = 0;
        for (long sale : sales) {
            number++;
            if (min >= sale) {
                min = sale;
                numberMin = number;
            }
        }
        return numberMin;
    }

    public static int findUnderAverage(long[] sales) {
        long average = findAverage(sales);
        int month = 0;
        int quantityUnder = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    public static int findOverAverage(long[] sales) {
        long average = findAverage(sales);
        int month = 0;
        int quantityOver = 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}