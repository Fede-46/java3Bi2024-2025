// 7. Determinare se la stringa è palindroma

import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una stringa:");
        String input = scanner.nextLine();
        scanner.close();
        
        if (isPalindroma(input)) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
    }

    public static boolean isPalindroma(String testo) {
        String testoLower = testo.toLowerCase(); 
        int inizio = 0;
        int fine = testoLower.length() - 1;
        
        while (inizio < fine) {
            if (testoLower.charAt(inizio) != testoLower.charAt(fine)) {
                return false; 
            }
            inizio++;
            fine--;
        }
        
        return true; 
    }
}
