package ru.netology.stats;

public class StatsService {

    public int calculateSum (int [] array) {
        int sum =0;
        for (int amount : array) {
            sum +=amount;
        }
        return sum;

    }
    public int calculateAverageSum (int [] array) {
        int sum = calculateSum(array);
        int averageSum = sum/array.length;
        return averageSum;
    }
    public int calculateMonthNumberMax (int[] array) {

        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        int result = 0;
        int month = 0;
        for (int amount : array) {
            month ++;
            if (amount == max) {
                result = month;
            }
        }
            return result;
        }
    public int calculateMonthNumberMin (int[] array) {

        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        int result = 0;
        int month = 0;
        for (int amount : array) {
            month ++;
            if (amount == min) {
                result = month;
            }
        }
        return result;
    }
    public int calculateBelowAverageMonths (int[] array) {

        int average = calculateAverageSum (array);

        int belowAverageMonth = 0;
        for (int amount : array) {
            if (amount<average){
                belowAverageMonth ++;
            }
        }
        return belowAverageMonth;
    }
    public int calculateAboveAverageMonths (int[] array) {

        int average = calculateAverageSum (array);

        int aboveAverageMonth = 0;
        for (int amount : array) {
            if (amount>average){
                aboveAverageMonth ++;
            }
        }
        return aboveAverageMonth;
    }

}
