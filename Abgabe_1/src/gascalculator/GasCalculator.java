package gascalculator;

public class GasCalculator {
    public static void main(String[] args) {
        float km = 992.7f;
        float usedGasInLiters = 87.1f;
        float averageConsumptionIn100Km = usedGasInLiters / km * 100;

        System.out.println(
                "---Benzinrechner---"
                + "\nGefahrene Kilometer: "
                + km
                + "\nVerbrauchtes Benzin: "
                + usedGasInLiters
                + "\nIhr Auto hat einen Verbrauch von "
                + averageConsumptionIn100Km
                + " Litern Benzin pro 100 Kilometer.");
    }
}
