import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        String filePath = "/mnt/data/temperaturemarzo.csv"; 
        ArrayList<int[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 

        // Converte la lista in una matrice
        int[][] temperatures = data.toArray(new int[0][]);
        int days = temperatures.length;

        // Calcola la media giornaliera delle temperature
        double[] dailyAvg = new double[days];
        double totalSum = 0;
        int totalCount = 0;

            for (int i = 0; i < days; i++) {
            int sum = 0;
            for (int j = 1; j <= 4; j++) {
                sum += temperatures[i][j]; // Somma le temperature della giornata
  }
            dailyAvg[i] = sum / 4.0; // Calcola la media della giornata
            totalSum += sum; // Aggiornare la somma totale delle temperature
            totalCount += 4; // Aggiornare il numero totale di valori considerati
        }

        // Calcola la media mensile delle temperature
        double monthlyAvg = totalSum / totalCount;

        // Inizializza le variabili per la ricerca della temperatura minima e massima
        int minTemp = Integer.MAX_VALUE, maxTemp = Integer.MIN_VALUE;
        int minDay = -1, minHour = -1, maxDay = -1, maxHour = -1;
        int minCount = 0, maxCount = 0;

