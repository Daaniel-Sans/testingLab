package testingLab;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MiddleEarthBattle simulator = new MiddleEarthBattle();

        String result1 = simulator.simulateBattle(Map.of("Pelosos", 3), Map.of("Orcos", 1));
        System.out.println("Resultado 1: " + result1);

        String result2 = simulator.simulateBattle(Map.of("Pelosos", 2), Map.of("Orcos", 1));
        System.out.println("Resultado 2: " + result2);
    }
}