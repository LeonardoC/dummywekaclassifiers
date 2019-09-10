package weka.classifiers.trees;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.RandomizableClassifier;
import weka.core.Instance;
import weka.core.Instances;

import java.util.Random;

/*
 * A classifier that randomly selected class and always classifies instances using that class.
 */
public class RandomClassClassifier extends AbstractClassifier {

    private int selectedClass = 0;
    @Override
    public void buildClassifier(Instances data) throws Exception {

        Random r = new Random();
        selectedClass = r.nextInt(data.classAttribute().numValues());
    }

    @Override
    public double classifyInstance(Instance instance) throws Exception {
        return selectedClass;
    }
}
