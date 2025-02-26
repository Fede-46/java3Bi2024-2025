//  1. Calcolo delle frequenze dei caratteri nel testo

import java.util.Scanner;

public class Es_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un testo:");
        String text = scanner.nextLine();
        scanner.close();
        
        int[] frequencyArray = computeFrequency(text);
        
        System.out.println("Distribuzione dei caratteri:");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Lettera: '" + (char) i + "' - Occorrenze: " + frequencyArray[i]);
            }
        }
    }

    public static int[] computeFrequency(String text) {
        int[] frequencyArray = new int[256];
        
        for (char c : text.toCharArray()) {
            frequencyArray[c]++;
        }
        
        return frequencyArray;
    }
}