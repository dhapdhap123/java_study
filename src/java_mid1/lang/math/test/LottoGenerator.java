package java_mid1.lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generateLotto(){
        lottoNumbers = new int[6];
        count = 0;


        int i = 0;
        while (true) {
            if (i == 6) break;

            int randomInt = random.nextInt(1, 46);

            if (isUnique(randomInt)) {
                lottoNumbers[i] = randomInt;
                i++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int randomInt){
        for (int j = 0; j < 6; j++) {
            if (lottoNumbers[j] == randomInt) return false;
        }
        return true;
    }
}
