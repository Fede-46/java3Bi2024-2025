// 3. Eliminazione di caratteri di punteggiatura

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un testo:");
        String testoInserito = scanner.nextLine();
        scanner.close();
        
        String testoPulito = rimuoviPunteggiatura(testoInserito);
        int numeroParole = contaParole(testoPulito);
        double lunghezzaMedia = calcolaLunghezzaMedia(testoPulito);
        
        System.out.println("Testo senza punteggiatura: " + testoPulito);
        System.out.println("Numero di parole: " + numeroParole);
        System.out.println("Lunghezza media delle parole: " + lunghezzaMedia);
    }

    public static String rimuoviPunteggiatura(String testo) {
        return testo.replaceAll("[.,;:!?(){}\[\]'"]", "");
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