package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= numberOfRows; i++) {
            if (i > 1)
                result.append("\n");
            for (int j = 1; j <= i; j++)
                result.append("*");
        }

        result.append("\n");

        return result.toString();
    }

    public static String getRow(int numberOfStars) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++)
            result.append("*");
        return result.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
