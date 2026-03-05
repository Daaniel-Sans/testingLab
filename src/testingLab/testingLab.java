package testingLab;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la instancia de nuestro simulador
        MiddleEarthBattle simulador = new MiddleEarthBattle();

        // --- CASO 1: Gana el Bien (3 Pelosos vs 1 Orco) ---
        System.out.println("--- ESCENARIO 1 ---");
        Map<String, Integer> bien1 = Map.of("Pelosos", 3); // Poder: 3 * 1 = 3
        Map<String, Integer> mal1 = Map.of("Orcos", 1);    // Poder: 1 * 2 = 2
        simulador.simularBatalla(bien1, mal1);

        System.out.println(); // Salto de línea

        // --- CASO 2: Gana el Mal (1 Elfo vs 2 Trolls) ---
        System.out.println("--- ESCENARIO 2 ---");
        Map<String, Integer> bien2 = Map.of("Elfos", 1);  // Poder: 1 * 5 = 5
        Map<String, Integer> mal2 = Map.of("Trolls", 2); // Poder: 2 * 5 = 10
        simulador.simularBatalla(bien2, mal2);

        System.out.println();

        // --- CASO 3: Empate (2 Pelosos vs 1 Orco) ---
        System.out.println("--- ESCENARIO 3 ---");
        Map<String, Integer> bien3 = Map.of("Pelosos", 2);
        Map<String, Integer> mal3 = Map.of("Orcos", 1);
        simulador.simularBatalla(bien3, mal3);
    }
}