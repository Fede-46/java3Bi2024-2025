// 2. Conteggio delle parole e visualizzazione della lunghezza media

import java.util.Scanner;

public class Es_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un testo:");
        String testo = scanner.nextLine();
        scanner.close();
        
        int conteggioParole = contaParole(testo);
        double lunghezzaMediaParole = calcolaLunghezzaMedia(testo);
        
        System.out.println("Numero di parole: " + conteggioParole);
        System.out.println("Lunghezza media delle parole: " + lunghezzaMediaParole);
    }

    public static int contaParole(String testo) {
        String[] parole = testo.trim().split("\\s+");
        return parole.length;
    }

    public static double calcolaLunghezzaMedia(String testo) {
        String[] parole = testo.trim().split("\\s+");
        int lunghezzaTotale = 0;
        
        for (String parola : parole) {
            lunghezzaTotale += parola.length();
        }
        
        return parole.length > 0 ? (double) lunghezzaTotale / parole.length : 0;
    }
}
