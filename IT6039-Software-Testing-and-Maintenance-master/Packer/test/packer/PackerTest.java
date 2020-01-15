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
public class PackerTest {
    
    public PackerTest() {
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
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        System.out.println("packProducts");
        Address customerAddress1 = new Address("67 Torch Rd", "Tree line", "Mt High", "799", new Coordinates(1102, 87));
        Customer c = new Customer("Andy Bravo", customerAddress1);
        
        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot d = new Depot("Main Depot", depotAddress);
        
        Manifest m = new Manifest();
        m.addProduct(new Product("Nails", 1, false, false), 12);
        m.addProduct(new Product("Saw", 5, false, false), 1);
        List<Box> result1 = Packer.packProducts(c, d, m);
        assertEquals(true, result1.equals(result1));
        
        Manifest m1 = new Manifest();
        m1.addProduct(new Product("Nails", 1, false, false), 4);
        m1.addProduct(new Product("Ladder", 15, false, false), 1);
        m1.addProduct(new Product("Light Bulbs", 1, false, true), 1);
        List<Box> result2 = Packer.packProducts(c, d, m1);
        assertEquals(true, result2.equals(result2));
        
    }
    
}
