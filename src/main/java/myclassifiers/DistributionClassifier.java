package myclassifiers;

import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import weka.core.Instance;

import java.io.Serializable;
import java.util.Random;

public class DistributionClassifier implements Serializable {
    private int seed = 0;
    private Random r;

    public DistributionClassifier(int seed) {
        r = new Random(seed);
    }

    public double[] distribution(Instance instance) {
        ExponentialDistribution dist = new ExponentialDistribution(1);
        dist.reseedRandomGenerator(seed);
        return dist.sample(instance.classAttribute().numValues());
    }

}
