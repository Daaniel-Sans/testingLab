package testingLab;

import java.util.Map;

public class MiddleEarthBattle {

    private static final Map<String, Integer> GOOD_SIDE = Map.of(
            "Pelosos", 1,
            "Sureños buenos", 2,
            "Enanos", 3,
            "Númenóreanos", 4,
            "Elfos", 5
    );

    private static final Map<String, Integer> EVIL_SIDE = Map.of(
            "Sureños malos", 2, 
            "Orcos", 2,
            "Goblins", 2,
            "Huargos", 3,
            "Trolls", 5
    );

    public String simulateBattle(Map<String, Integer> goodArmy, Map<String, Integer> evilArmy) {
        int goodPower = calculatePower(goodArmy, GOOD_SIDE);
        int evilPower = calculatePower(evilArmy, EVIL_SIDE);

        if (goodPower > evilPower) {
            return "¡Gana el bien!";
        } else if (evilPower > goodPower) {
            return "¡Gana el mal!";
        } else {
            return "¡Ha habido un empate!";
        }
    }

    private int calculatePower(Map<String, Integer> army, Map<String, Integer> referenceValues) {
        int total = 0;
        for (Map.Entry<String, Integer> entry : army.entrySet()) {
            String race = entry.getKey();
            int amount = entry.getValue();
            total += amount * referenceValues.getOrDefault(race, 0);
        }
        return total;
    }
}