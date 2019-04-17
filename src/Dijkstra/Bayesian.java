package Dijkstra;

// Created by 
public class Bayesian {

    void computeProbabilities(int n) {
        // array of probability that each hypothesis is true given n data points
        double posteriors[] = {0,0,0,0,0};
        double priors[] = {0.1, 0.2, 0.4, 0.2, 0.1};  // initial probability of hypotheses
        double hyps[] = {0.1, 0.25, 0.5, 0.25, 0};    // percentage of fruit in each hypothesis
        double data[] = {10, 2, 5};              // random number of data points

        for (int i = 0; i < hyps.length; i += 1) {
            double hyp = hyps[i];
            double prior = priors[i];
            // initially the probability is the prior
            double probabilityOfHyp = prior;
            // do the product of probabilities for all data seen so far
            for (int j = 0; j < n; j += 1) {
                double d = data[j];
                double likelihood = Math.pow(hyps[i], data[i]);
                probabilityOfHyp = probabilityOfHyp * likelihood;
            }
            // add it to array of posteriors
            posteriors[i] = probabilityOfHyp;
        }
    }
}
