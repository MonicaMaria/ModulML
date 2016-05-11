/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartHouse;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TestGetSuggestionList() throws IOException, ParseException
    {
        Main instance = new Main();
        NeuralNetwork net2 = new NeuralNetwork(false, "inputTests\\input1.json");
        net2.start();
        String result = instance.getSuggestionList(net2);
        String expResult = "{\"suggestions\":[]}";
        assertEquals(expResult,result);
    }
    
    @Test
    public void TestGetSuggestionList1() throws IOException, ParseException
    {
        Main instance = new Main();
        NeuralNetwork net2 = new NeuralNetwork(false, "inputTests\\input2.json");
        net2.start();
        String result = instance.getSuggestionList(net2);
        String expResult = "{\"suggestions\":[\"porneste_centrala\",\"uda_gazon\"]}";
        assertEquals(expResult,result);
    }
    
    @Test
    public void TestPerformance() throws IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("trainData.json"));
        JSONArray testarr = (JSONArray) obj;
        
        for (int iterator = 0; iterator < testarr.size(); iterator++ ) {
            JSONObject testObj = (JSONObject) testarr.get(iterator);
            Iterator it = testObj.keySet().iterator();
            String key = (String) it.next();
            JSONObject obj2 = (JSONObject) testObj.get(key);
            try (FileWriter file = new FileWriter("inputTests\\train_input_test.json")) {
                file.write(obj2.toJSONString());
                //System.out.println(obj.toJSONString());
                file.flush();
            }
            
            Main instance = new Main();
            NeuralNetwork net2 = new NeuralNetwork(false, "inputTests\\train_input_test.json");
            net2.start();
            String result = instance.getSuggestionList(net2);
            int indexOf = result.indexOf(key);
            assertNotEquals(-1,indexOf);
        }
    }
    
}
