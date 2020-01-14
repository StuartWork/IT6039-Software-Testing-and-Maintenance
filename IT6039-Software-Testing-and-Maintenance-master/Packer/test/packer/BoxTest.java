/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 91031442
 */
public class BoxTest {
    
    public BoxTest() {
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
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
         Address customerAddress1 = new Address("67 Torch Rd", "Tree line", "Mt High", "799", new Coordinates(1102, 87));
        Customer c = new Customer("Andy Bravo", customerAddress1);
        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot d = new Depot("Main Depot", depotAddress);
        Manifest m = new Manifest();
        m.addProduct(new Product("Nails", 41, false, false), 4);
        List<Box> instance = Packer.packProducts(c, d, m);
        assertEquals(false, m.hasFragileItems());
        for (Box b : instance) {
            System.out.println(b);
        }
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isHazardous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
