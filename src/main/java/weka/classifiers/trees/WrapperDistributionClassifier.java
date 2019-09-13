package weka.classifiers.trees;

import myclassifiers.DistributionClassifier;
import weka.classifiers.RandomizableClassifier;
import weka.core.Instance;
import weka.core.Instances;

import java.util.Arrays;

public class WrapperDistributionClassifier extends RandomizableClassifier {
    DistributionClassifier classifier;
    @Override
    public void buildClassifier(Instances data) throws Exception {
        classifier = new DistributionClassifier(getSeed());
    }

    @Override
    public double[] distributionForInstance(Instance instance) throws Exception {
        double[] res = classifier.distribution(instance);
        System.out.println(Arrays.toString(res));
        return res;
    }
}
