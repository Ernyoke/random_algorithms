import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Ivar the Boneless is a great leader. He is trying to capture Kattegat from Lagertha. The war has begun and wave after
    wave Ivar's warriors are falling in battle. Ivar has n warriors, he places them on a straight line in front of the
    main gate, in a way that the i-th warrior stands right after (i−1)-th warrior. The first warrior leads the attack.
    Each attacker can take up to ai arrows before he falls to the ground, where a[i] is the i-th warrior's strength.
    Lagertha orders her warriors to shoot k[i] arrows during the i-th minute, the arrows one by one hit the first still
    standing warrior. After all Ivar's warriors fall and all the currently flying arrows fly by, Thor smashes his hammer
    and all Ivar's warriors get their previous strengths back and stand up to fight again. In other words, if all warriors
    die in minute t, they will all be standing to fight at the end of minute t.
    The battle will last for q minutes, after each minute you should tell Ivar what is the number of his standing warriors.
 */
public class VallhallaSiege {
    public static List<Integer> solve(List<Integer> strengths, List<Integer> arrows) {
        List<Integer> result = new ArrayList<>();
        List<Integer> partialSumStrengths = partialSum(strengths);
        int totalDamage = 0;
        for (Integer arrow: arrows) {
            totalDamage += arrow;
            if (totalDamage >= partialSumStrengths.get(partialSumStrengths.size() - 1)) {
                totalDamage = 0;
                result.add(strengths.size());
            } else {
                int poz = Collections.binarySearch(partialSumStrengths, totalDamage);
                if (poz < 0) {
                    poz = Math.abs(poz) - 2;
                }
                result.add(strengths.size() - poz - 1);
            }

        }
        return result;
    }

    private static List<Integer> partialSum(List<Integer> values) {
        List<Integer> result = new ArrayList<>();
        result.add(values.get(0));
        for (int i = 1; i < values.size(); i++) {
            result.add(result.get(i - 1) + values.get(i));
        }
        return result;
    }
}
