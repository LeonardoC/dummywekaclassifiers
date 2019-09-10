package weka.classifiers.trees;

import weka.classifiers.AbstractClassifier;
import weka.core.Instance;
import weka.core.Instances;

/*
 *  A classifier that always classifies an instance with the first class.
 */
public class FirstClassClassifier extends AbstractClassifier {

    @Override
    public void buildClassifier(Instances data) throws Exception {

    }

    @Override
    public double classifyInstance(Instance instance) throws Exception {
        return 0;
    }
}
