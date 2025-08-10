package com.forecasting;

public class Main {
	public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.08; // 8%
        int years = 10;
        double futureValueRecursive = ForecastCalculator.forecastRecursive(presentValue, growthRate, years);
        double futureValueOptimized = ForecastCalculator.forecastOptimized(presentValue, growthRate, years);
        System.out.printf("Recursive Forecast: ₹%.2f%n", futureValueRecursive);
        System.out.printf("Optimized Forecast: ₹%.2f%n", futureValueOptimized);
    }
}
