package com.example.kiemthu;

public class AverageCalculator {
    public int average(int[] values, int minimum, int maximum) {
        int inputNumber = 0;
        int validNumber = 0;
        int sumValues = 0;

        while (inputNumber < values.length && values[inputNumber] != -999 && inputNumber < 100) {
            if (values[inputNumber] > minimum && values[inputNumber] <= maximum) {
                validNumber++;
                sumValues += values[inputNumber];
            }
            inputNumber++;
        }

        if (validNumber > 0) {
            return sumValues / validNumber;
        } else {
            return -999;
        }
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {15, 25, 35, 45, -999}; 
        int minimum = 20; 
        int maximum = 40; 

        int result = calculator.average(values, minimum, maximum);
        System.out.println("Gia tri trung binh la: " + result);
    }
}
