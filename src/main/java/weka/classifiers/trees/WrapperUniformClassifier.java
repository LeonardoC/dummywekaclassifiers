package weka.classifiers.trees;

import myclassifiers.UniformClassifier;
import weka.classifiers.RandomizableClassifier;
import weka.core.Instance;
import weka.core.Instances;


public class WrapperUniformClassifier extends RandomizableClassifier {
    UniformClassifier classifier;

    @Override
    public void buildClassifier(Instances data) throws Exception {
        classifier = new UniformClassifier(getSeed());
    }

    @Override
    public double classifyInstance(Instance instance) throws Exception {
        return classifier.classify(instance);
    }

    @Override
    public double[] distributionForInstance(Instance instance) throws Exception {
        return super.distributionForInstance(instance);
    }
}
