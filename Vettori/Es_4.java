// 4. Invertite la stringa

import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una stringa da invertire:");
        String input = scanner.nextLine();
        scanner.close();
        
        String stringaInvertita = invertiStringa(input);
        System.out.println("Stringa invertita: " + stringaInvertita);
    }

    public static String invertiStringa(String testo) {
        StringBuilder sb = new StringBuilder(testo);
        return sb.reverse().toString();  
    }
}
