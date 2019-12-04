package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(1, 5, 1, 5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(1, 10, 1, 10);
    }

    public static String getMultiplicationTable(int startFirstArg, int stopFirstArg, int startLastArg, int stopLastArg) {

        StringBuilder result = new StringBuilder();
        if ((Math.multiplyExact(startFirstArg, startLastArg)) < 9)
            result.append("  ");
        else if (((Math.multiplyExact(startFirstArg, startLastArg)) > 9) & ((Math.multiplyExact(startFirstArg, startLastArg)) <= 99))
            result.append(" ");

        for (int i = startFirstArg; i <= stopFirstArg; i++)
            for (int j = startLastArg; j <= stopLastArg; j++) {
                if (j == stopLastArg) {
                    if (i == stopFirstArg)
                        result.append(j * i).append(" ").append("|\n");
                    else {
                        if (((i + 1) * startLastArg) > 9 & (((i + 1) * startLastArg) <= 99))
                            result.append(j * i).append(" ").append("|\n").append(" ");
                        else if (((i + 1) * startLastArg) > 99)
                            result.append(j * i).append(" ").append("|\n");
                        else
                            result.append(j * i).append(" ").append("|\n").append("  ");
                    }
                }
                else {
                    if (((j + 1) * i) > 9 & (((j + 1) * i) <= 99))
                        result.append(j * i).append(" ").append("|").append(" ");
                    else if (((j + 1) * i) > 99)
                        result.append(j * i).append(" ").append("|");
                    else
                        result.append(j * i).append(" ").append("|").append("  ");
                }
            }
        return result.toString();
    }
}
