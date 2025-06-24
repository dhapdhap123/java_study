package java_mid1.lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottos = lottoGenerator.generateLotto();
        System.out.println("lottos = " + Arrays.toString(lottos));
    }
}
