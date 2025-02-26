// 6. Per ogni carattere dell'alfabeto visualizzare i 3 caratteri che più spesso appaiono come successivi

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CaratteriSuccessivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una stringa:");
        String input = scanner.nextLine();
        scanner.close();
        
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Map<Character, Map<Character, Integer>> successivi = new HashMap<>();
        
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            successivi.putIfAbsent(currentChar, new HashMap<>());
            
            Map<Character, Integer> nextCharMap = successivi.get(currentChar);
            nextCharMap.put(nextChar, nextCharMap.getOrDefault(nextChar, 0) + 1);
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            if (successivi.containsKey(c)) {
                System.out.println("Per la lettera '" + c + "' i 3 successivi più frequenti sono:");
                
                Map<Character, Integer> nextCharMap = successivi.get(c);
                
                PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
                pq.addAll(nextCharMap.entrySet());
                
                int count = 0;
                while (!pq.isEmpty() && count < 3) {
                    Map.Entry<Character, Integer> entry = pq.poll();
                    System.out.println(entry.getKey() + " - Frequenza: " + entry.getValue());
                    count++;
                }
                System.out.println(); 
            }
        }
    }
}
