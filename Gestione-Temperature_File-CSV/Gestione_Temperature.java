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

        // Trova la temperatura minima e massima del mese
        for (int i = 0; i < days; i++) {
            for (int j = 1; j <= 4; j++) { // Scorriamo le temperature delle 4 fasce orarie
                int temp = temperatures[i][j];

                // Se troviamo una temperatura più bassa della minima attuale
                if (temp < minTemp) {
                    minTemp = temp; // Aggiorniamo la temperatura minima
                    minDay = temperatures[i][0]; // Memorizziamo il giorno in cui è stata registrata
                    minHour = j * 6; // Memorizziamo l'orario corrispondente (6, 12, 18, 24)
                    minCount = 1; // Reset del conteggio delle occorrenze
                } else if (temp == minTemp) { // Se la temperatura è uguale alla minima già trovata
                    minCount++; // Incrementiamo il conteggio delle volte in cui si è registrata
                    minDay = temperatures[i][0]; // Aggiorniamo con l'ultima occorrenza della temperatura minima
                    minHour = j * 6;
                }

                 // Se troviamo una temperatura più alta della massima attuale
                if (temp > maxTemp) {
                    maxTemp = temp; // Aggiorniamo la temperatura massima
                    maxDay = temperatures[i][0]; // Memorizziamo il giorno in cui è stata registrata
                    maxHour = j * 6; // Memorizziamo l'orario corrispondente
                    maxCount = 1; // Reset del conteggio delle occorrenze
                } else if (temp == maxTemp) { // Se la temperatura è uguale alla massima già trovata
                    maxCount++; // Incrementiamo il conteggio delle volte in cui si è registrata
                }
            }
        }



