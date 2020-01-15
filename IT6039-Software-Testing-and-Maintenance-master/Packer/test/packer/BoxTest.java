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
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Address customerAddress1 = new Address("67 Torch Rd", "Tree line", "Mt High", "799", new Coordinates(1102, 87));
        Customer c = new Customer("Andy Bravo", customerAddress1);
        
        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot d = new Depot("Main Depot", depotAddress);
        
        Manifest m = new Manifest();
        m.addProduct(new Product("Saw", 5, true, false), 1);
        assertEquals(5, m.getTotalWeight(), 0.0);
        Manifest n = new Manifest();
        n.addProduct(new Product("Light Bulbs", 1, false, true), 20);
        assertEquals(20, n.getTotalWeight(), 0.0);
        Manifest l = new Manifest();
        l.addProduct(new Product("Nails", 1, false, false), 21);
        List<Box> instance = Packer.packProducts(c, d, m);
        for (Box b : instance) {
            System.out.println(b);
        }
        assertEquals(21, l.getTotalWeight(), 0.0);
        
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
        m.addProduct(new Product("Nails", 1, false, false), 12);
        List<Box> instance = Packer.packProducts(c, d, m);
        assertEquals(false, m.hasFragileItems());
        for (Box b : instance) {
            System.out.println(b);
        }
        
        m.addProduct(new Product("Light Bulbs", 1, false, true), 6);
        List<Box> instance1 = Packer.packProducts(c, d, m);
        assertEquals(true, m.hasFragileItems());
        for (Box b : instance1) {
            System.out.println(b);
        }
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Address customerAddress1 = new Address("67 Torch Rd", "Tree line", "Mt High", "799", new Coordinates(1102, 87));
        Customer c = new Customer("Andy Bravo", customerAddress1);
        
        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot d = new Depot("Main Depot", depotAddress);
        
        Manifest m = new Manifest();
        m.addProduct(new Product("Nails", 1, false, false), 12);
        List<Box> instance = Packer.packProducts(c, d, m);
        assertEquals(false, m.hasHazardousItems());
        for (Box b : instance) {
            System.out.println(b);
        }
        
        m.addProduct(new Product("Weedkiller", 2, true, false), 1);
        List<Box> instance1 = Packer.packProducts(c, d, m);
        assertEquals(true, m.hasHazardousItems());
        for (Box b : instance1) {
            System.out.println(b);
        }
    }
    
    /**
     * Test of isHeavy.
     */
     @Test
    public void testIsHeavy() {
        
        System.out.println("isHeavy");
        Address customerAddress1 = new Address("67 Torch Rd", "Tree line", "Mt High", "799", new Coordinates(1102, 87));
        Customer c = new Customer("Andy Bravo", customerAddress1);
        
        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot d = new Depot("Main Depot", depotAddress);
        
        Manifest m = new Manifest();
        m.addProduct(new Product("Nails", 1, false, false), 12);
        List<Box> instance = Packer.packProducts(c, d, m);
        assertEquals(false, m.hasHeavyItems());
        for (Box n : instance) {
            System.out.println(n);
        }
        m.addProduct(new Product("Nails", 1, false, false), 12);
        m.addProduct(new Product("Light Bulbs", 1, false, true), 8);
        List<Box> instance1 = Packer.packProducts(c, d, m);
        assertEquals(true, m.hasHeavyItems());
        for (Box n : instance1) {
            System.out.println(n);
        }
    }
}
