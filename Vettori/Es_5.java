// 5. Calcolare la somma delle vocali e delle consonanti

import java.util.Scanner;

public class ContaVocaliConsonanti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una stringa:");
        String input = scanner.nextLine();
        scanner.close();
        
        int vocali = contaVocali(input);
        int consonanti = contaConsonanti(input);
        
        System.out.println("Numero di vocali: " + vocali);
        System.out.println("Numero di consonanti: " + consonanti);
    }

    public static int contaVocali(String testo) {
        int contoVocali = 0;
        String testoLower = testo.toLowerCase();  // Converte la stringa in minuscolo per semplificare il controllo
        
        for (int i = 0; i < testoLower.length(); i++) {
            char c = testoLower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contoVocali++;
            }
        }
        return contoVocali;
    }

    public static int contaConsonanti(String testo) {
        int contoConsonanti = 0;
        String testoLower = testo.toLowerCase();  // Converte la stringa in minuscolo
        
        for (int i = 0; i < testoLower.length(); i++) {
            char c = testoLower.charAt(i);
            if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                contoConsonanti++;
            }
        }
        return contoConsonanti;
    }
}