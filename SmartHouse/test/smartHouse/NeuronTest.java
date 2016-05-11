/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartHouse;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Monica
 */
public class NeuronTest {
    
    public NeuronTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compute method, of class Neuron.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        List<Double> input = new ArrayList<>();
        int i;
        for(i = 0; i < 8; i++) 
            if(i%2>0) input.add(1.0);
            else input.add(0.0);
        Neuron instance = new Neuron(input);
        instance.randomize();
        double result = instance.compute();
        assertTrue("resul", result==-1.0||result==1.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of randomize method, of class Neuron.
     */
    @Test
    public void testRandomize() {
        System.out.println("randomize");
        List<Double> input = new ArrayList<>();
        int i;
        for(i = 0; i < 8; i++) 
            if(i%2>0) input.add(1.0);
            else input.add(0.0);
        Neuron instance = new Neuron(input);
        instance.randomize();
        List<Double> result = instance.getWeights();
        assertTrue("result", result!=null);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of train method, of class Neuron.
     */
    @Test
    public void testTrain() {
        System.out.println("train");
        double desiredOutput = 0.0;
        double trainConstant = 0.3;
        
        List<Double> input = new ArrayList<>();
        int i;
        for(i = 0; i < 8; i++) 
            if(i%2>0) input.add(1.0);
            else input.add(0.0);
        Neuron instance = new Neuron(input);
        instance.randomize();
        instance.train(desiredOutput, trainConstant);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setWeights method, of class Neuron.
     */
    @Test
    public void testSetWeights() {
        System.out.println("setWeights");
        List<Double> weights = new ArrayList<>();
        int i;
        for(i = 0; i < 8; i++) 
            if(i%2>0) weights.add(1.0);
            else weights.add(0.0);
        Neuron instance = new Neuron();
        instance.setWeights(weights);
        List<Double> result = instance.getWeights();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(result, weights);
    }

    /**
     * Test of getWeights method, of class Neuron.
     */
    @Test
    public void testGetWeights() {
        System.out.println("getWeights");
        List<Double> input = new ArrayList<>();
        int i;
        for(i = 0; i < 8; i++) 
            if(i%2>0) input.add(1.0);
            else input.add(0.0);
        Neuron instance = new Neuron(input);
        instance.randomize();
        List<Double> result = instance.getWeights();
        assertTrue("result", result!=null);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
