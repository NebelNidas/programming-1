package weatherstation;

public class WeatherStation {
    public static void main(String[] args) {
        // @formatter:off
        int[][] dailyMeanTemperatures = {
                { -3, 2, 6, 3, -1, 0, 4, 9, 9, 13, 5, 7, 11, 8, 10, 7, 4, 1, 1, 1, 1, 1, 1, 1, 2, 1, 3, 4, 4, 3, 3 },
                { 2, 1, 0, -1, -1, 0, -2, -2, 0, 2, 0, -1, 1, 6, 1, 1, 1, 2, 2, 7, 5, 3, 4, 5, 5, 5, 5, 4 },
                { 8, 9, 8, 5, 4, 4, 5, 7, 8, 9, 8, 6, 5, 4, 4, 6, 9, 10, 10, 8, 8, 7, 9, 9, 8, 6, 8, 8, 11, 11, 12 },
                { 7, 6, 6, 6, 5, 5, 6, 8, 12, 15, 14, 15, 14, 15, 17, 19, 13, 10, 12, 13, 14, 14, 12, 14, 14, 16, 15, 9, 10, 13 },
                { 10, 12, 16, 19, 18, 16, 15, 16, 17, 17, 19, 22, 20, 18, 10, 14, 16, 17, 15, 11, 12, 13, 15, 16, 16, 13, 12, 15, 18, 16, 17 },
                { 18, 21, 23, 21, 25, 24, 23, 16, 16, 17, 21, 21, 21, 21, 18, 17, 17, 16, 16, 14, 16, 18, 15, 16, 18, 20, 21, 21, 22, 24 },
                { 26, 28, 29, 29, 30, 26, 27, 22, 20, 19, 24, 23, 22, 24, 24, 26, 29, 25, 24, 26, 27, 25, 22, 24, 21, 17, 19, 19, 16, 17, 17 },
                { 18, 21, 24, 21, 22, 27, 29, 27, 23, 22, 24, 25, 25, 21, 19, 16, 17, 16, 17, 18, 19, 20, 18, 17, 18, 19, 24, 25, 23, 26, 26 },
                { 22, 17, 17, 16, 14, 13, 13, 15, 16, 15, 15, 19, 18, 16, 15, 17, 16, 16, 14, 14, 14, 15, 12, 14, 13, 15, 14, 12, 14, 12 },
                { 10, 11, 16, 14, 15, 18, 16, 12, 12, 12, 12, 9, 8, 7, 5, 7, 6, 8, 8, 6, 7, 10, 12, 12, 15, 8, 8, 10, 12, 8, 9 },
                { 7, 7, 6, 10, 12, 16, 18, 16, 17, 13, 9, 8, 11, 11, 14, 15, 14, 15, 15, 12, 4, 3, 2, 0, 4, 4, -1, 3, 8, 10 },
                { 11, 8, 2, 9, 7, 11, 10, 7, 8, 1, 9, 9, 6, 3, 8, 12, 13, 12, 8, 10, 11, 12, 12, 11, 12, 11, 9, 4, 7, 4, 7 } };
        // @formatter:on


        //===========
        // Aufgabe 1
        //===========
        int dayCount = 0;
        int sumOfAllTemperatures = 0;

        for (int[] dailyMeanTemperaturesOfCurrentMonth : dailyMeanTemperatures) {
            for (int dailyMeanTemperature : dailyMeanTemperaturesOfCurrentMonth) {
                dayCount++;
                sumOfAllTemperatures += dailyMeanTemperature;
            }
        }

        System.out.println("Die Anzahl der Tage im gegebenen Jahr ist: " + dayCount);


        //===========
        // Aufgabe 2
        //===========
        double annualAverageTemperature = Math.round((double) sumOfAllTemperatures / dayCount * 10) / 10d;

        System.out.println("Jahresdurchschnittstemperatur: %s Grad ".formatted(annualAverageTemperature));
        System.out.println("Monatsdurchschnittstemperaturen:");


        //===========
        // Aufgabe 3
        //===========
        for (int month = 0; month < dailyMeanTemperatures.length; month++) {
            int[] dailyMeanTemperaturesOfCurrentMonth = dailyMeanTemperatures[month];
            int daysInThisMonth = 0;
            int sumOfMonthlyTemperatures = 0;

            for (int dailyMeanTemperature : dailyMeanTemperaturesOfCurrentMonth) {
                daysInThisMonth++;
                sumOfMonthlyTemperatures += dailyMeanTemperature;
            }

            double monthlyAverageTemperature = Math.round((double) sumOfMonthlyTemperatures / daysInThisMonth * 10) / 10d;
            System.out.println("* Monat %s: %s Grad".formatted(month + 1, monthlyAverageTemperature));
        }


        //===========
        // Aufgabe 4
        //===========
        String warmestDay = null;
        int warmestTemperature = 0;

        for (int month = 0; month < dailyMeanTemperatures.length; month++) {
            int[] dailyMeanTemperaturesOfCurrentMonth = dailyMeanTemperatures[month];

            for (int day = 0; day < dailyMeanTemperaturesOfCurrentMonth.length; day++) {
                if (dailyMeanTemperaturesOfCurrentMonth[day] > warmestTemperature) {
                    warmestTemperature = dailyMeanTemperaturesOfCurrentMonth[day];
                    warmestDay = "%s.%s.2015".formatted(day + 1, month + 1);
                }
            }
        }

        System.out.println("Wärmster Tag am %s mit %s Grad.".formatted(warmestDay, warmestTemperature));


        //===========
        // Aufgabe 5
        //===========
        int[] temperatures = new int[dayCount];
        int index = 0;

        for (int month = 0; month < dailyMeanTemperatures.length; month++) {
            int[] dailyMeanTemperaturesOfCurrentMonth = dailyMeanTemperatures[month];

            for (int day = 0; day < dailyMeanTemperaturesOfCurrentMonth.length; day++) {
                temperatures[index] = dailyMeanTemperaturesOfCurrentMonth[day];
                index++;
            }
        }


        //===========
        // Aufgabe 6
        //===========
        System.out.print("Temperaturen an allen durch hundert teilbaren Tagen:\n* ");
        int increment = 100;
        int startValue = increment - 1;

        for (int day = startValue; day < temperatures.length; day += increment) {
            if (day != startValue) {
                System.out.print(", ");
            }

            System.out.print("Tag %s: %s Grad".formatted(day + 1, temperatures[day]));
        }

        System.out.println();


        //===========
        // Aufgabe 7
        //===========
        int[] sorted = new int[temperatures.length];

        for (int dayInSorted = 0; dayInSorted < sorted.length; dayInSorted++) {
            int highestTemperatureIndex = 0;

            for (int dayInTemperatures = 0; dayInTemperatures < temperatures.length; dayInTemperatures++) {
                if (temperatures[dayInTemperatures] > temperatures[highestTemperatureIndex]) {
                    highestTemperatureIndex = dayInTemperatures;
                }
            }

            sorted[dayInSorted] = temperatures[highestTemperatureIndex];
            temperatures[highestTemperatureIndex] = -100;
        }

        System.out.print("Die fünf wärmsten Tage:\n* ");

        for (int day = 0; day < 5; day++) {
            if (day != 0) {
                System.out.print(", ");
            }

            System.out.print("%s Grad".formatted(sorted[day]));
        }

        System.out.println();
    }
}
