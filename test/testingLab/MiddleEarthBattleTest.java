package testingLab;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MiddleEarthBattleTest {
    
    MiddleEarthBattle battle = new MiddleEarthBattle();

    @Test
    void testEvilWins() {
        Map<String, Integer> good = Map.of("Pelosos", 1);
        Map<String, Integer> evil = Map.of("Orcos", 1);
        
        String result = battle.simulateBattle(good, evil);
        assertEquals("¡Gana el mal!", result);
    }

    @Test
    void testDraw() {
        Map<String, Integer> good = Map.of("Pelosos", 2);
        Map<String, Integer> evil = Map.of("Orcos", 1);
        
        String result = battle.simulateBattle(good, evil);
        assertEquals("¡Ha habido un empate!", result);
    }

    @Test
    void testGoodWins() {
        Map<String, Integer> good = Map.of("Pelosos", 3);
        Map<String, Integer> evil = Map.of("Orcos", 1);
        
        String result = battle.simulateBattle(good, evil);
        assertEquals("¡Gana el bien!", result);
    }

    @Test
    void testPowerfulBattle() {
        Map<String, Integer> good = Map.of("Elfos", 1);
        Map<String, Integer> evil = Map.of("Trolls", 1);
        
        String result = battle.simulateBattle(good, evil);
        assertEquals("¡Ha habido un empate!", result);
    }

    @Test
    void testMultipleWarriors() {
        Map<String, Integer> good = Map.of("Enanos", 2);
        Map<String, Integer> evil = Map.of("Huargos", 1, "Orcos", 1);
        
        String result = battle.simulateBattle(good, evil);
        assertEquals("¡Gana el bien!", result);
    }
}