package weka.classifiers.trees;

import weka.classifiers.AbstractClassifier;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.OptionMetadata;

public class SelectedClassClassifier extends AbstractClassifier {

    private int selectedClass = 0;

    public int getSelectedClass() {
        return selectedClass;
    }

    public void setSelectedClass(int selectedClass) {
        this.selectedClass = selectedClass;
    }

    @Override
    public void buildClassifier(Instances data) throws Exception {

    }

    @Override
    public double classifyInstance(Instance instance) throws Exception {
        return selectedClass;
    }
}
