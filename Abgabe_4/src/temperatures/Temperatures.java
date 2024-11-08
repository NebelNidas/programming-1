package temperatures;

public class Temperatures {
    public static void main(String[] args) {
        int days = 30;
        double[] minimumTemperatures = new double[30];
        double[] maximumTemperatures = new double[30];
        String unformattedMessage = "Tag %s: Minimum = %s, Maximum = %s";

        for (int i = 0; i < days; i++) {
            minimumTemperatures[i] = Math.random() * 10;
        }

        for (int i = 0; i < days; i++) {
            maximumTemperatures[i] = 5 + Math.random() * 15;
        }

        System.out.println("Unsortiert:");

        for (int day = 0; day < days; day++) {
            System.out.println(unformattedMessage.formatted(day+1, minimumTemperatures[day], maximumTemperatures[day]));
        }

        System.out.println("Sortiert:");

        for (int day = 0; day < days; day++) {
            if (minimumTemperatures[day] > maximumTemperatures[day]) {
                double min = maximumTemperatures[day];
                double max = minimumTemperatures[day];
                minimumTemperatures[day] = min;
                maximumTemperatures[day] = max;
            }

            System.out.println(unformattedMessage.formatted(day+1, minimumTemperatures[day], maximumTemperatures[day]));
        }
    }
}
