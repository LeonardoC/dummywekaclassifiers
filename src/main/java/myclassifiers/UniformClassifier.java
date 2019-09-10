package myclassifiers;

import weka.core.Instance;

import java.util.Random;

public class UniformClassifier {
    private int seed = 0;
    private Random r;

    public UniformClassifier(int seed) {
        r = new Random(seed);
    }

    public int classify(Instance instance) {
        return r.nextInt(instance.classAttribute().numValues());
    }
}
