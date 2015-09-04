package BPL;

import org.encog.neural.data.NeuralData;
import org.encog.neural.data.NeuralDataPair;
import org.encog.neural.data.NeuralDataSet;
import org.encog.neural.data.basic.BasicNeuralDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.Train;
import org.encog.neural.networks.layers.FeedforwardLayer;
import org.encog.neural.networks.training.backpropagation.Backpropagation;

public class NeuralNet {

    // fill these in with your training parameters
    public static final double LEARNING_RATE = 0.7;
    public static final double MOMENTUM = 0.7;
    public static final int MAX_ITERATION = 5000;
    public static final double MAX_ERROR = 0.01;

    private static BasicNetwork getNetwork() {
        BasicNetwork network = new BasicNetwork();
        network.addLayer(new FeedforwardLayer(15)); 	//input layer
        network.addLayer(new FeedforwardLayer(10));	//hidden layer
        network.addLayer(new FeedforwardLayer(1));	//output layer
        network.reset();
        return network;
    }

    private static NeuralDataSet getTraining() {
        final double[][] INPUT = {
            {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0},};

        final double[][] IDEAL = {
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},
            {1.0},};
        return new BasicNeuralDataSet(INPUT, IDEAL);
    }

    public static BasicNetwork trainNetwork(BasicNetwork network, NeuralDataSet trainingSet) {
        final Train train = new Backpropagation(
                network,
                trainingSet,
                LEARNING_RATE,
                MOMENTUM);

        int epoch = 1;

        do {
            train.iteration();
            System.out.println("Iteration #" + epoch + " Error:" + train.getError());
            epoch++;
        } while ((epoch < MAX_ITERATION) && (train.getError() > MAX_ERROR));

        return (BasicNetwork) train.getNetwork();
    }

    public static void queryNetwork(BasicNetwork network, NeuralDataSet trainingSet) {
        // test the neural network
        System.out.println("Neural Network Query:");
        for (NeuralDataPair pair : trainingSet) {
            final NeuralData output = network.compute(pair.getInput());

            System.out.print("Input: ");
            for (int i = 0; i < pair.getInput().size(); i++) {
                if (i != 0) {
                    System.out.print(",");
                }
                System.out.print(pair.getInput().getData(i));
            }
            System.out.print(", Output: ");
            for (int i = 0; i < output.size(); i++) {
                if (i != 0) {
                    System.out.print(",");
                }
                System.out.print(output.getData(i));
            }

            System.out.print(", Expected: ");
            for (int i = 0; i < pair.getIdeal().size(); i++) {
                if (i != 0) {
                    System.out.print(",");
                }
                System.out.print(pair.getIdeal().getData(i));
            }
            System.out.println("");
        }
    }

    public static void main(final String args[]) {

        final NeuralDataSet trainingSet = getTraining();
        BasicNetwork network = getNetwork();
        network = trainNetwork(network, trainingSet);
        queryNetwork(network, trainingSet);
    }
}
