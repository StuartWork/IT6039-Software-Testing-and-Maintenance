/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

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
public class ManifestTest {
    
    public ManifestTest() {
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
     * Test of getTotalWeight method, of class Manifest.
     */
    @Test
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        Manifest instance = new Manifest();
        instance.addProduct(new Product("Nails", 1, false, false), 4);
        assertEquals(4, instance.getTotalWeight(), 0.0);
        instance.addProduct(new Product("Ladder", 15, false, false), 1);
        assertEquals(15, instance.getTotalWeight(), 0.0);
    }

    /**
     * Test of isEmpty method, of class Manifest.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Manifest instance = new Manifest();
        assertEquals(true, instance.isEmpty());
        instance.addProduct(new Product("Ladder", 15, false, false), 2);
        assertEquals(false, instance.isEmpty());
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    @Test
    public void testContainsProduct() {
        System.out.println("containsProduct");
        Product p = new Product("Hammer", 3, false, false);
        Manifest instance = new Manifest();        
        assertEquals(false, instance.containsProduct(p));
        instance.addProduct(p);
        assertEquals(true, instance.containsProduct(p));
    }

    /**
     * Test of toString method, of class Manifest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        instance.addProduct(new Product("Hammer", 3, false,false), 1);
        assertEquals("Hammer x 1", instance.toString());
        instance.addProduct(new Product("Nails", 1, false, false), 12);
        instance.addProduct(new Product("Ladder", 15, false, false), 2);
        assertEquals(true, instance.toString().equals( instance.toString()));
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        System.out.println("hasFragileItems");
        Manifest instance = new Manifest();
        instance.addProduct(new Product("Hammer", 3, false,false),1);
        assertEquals(false, instance.hasFragileItems());
        instance.addProduct(new Product("Light Bulbs", 1, false,true),1);        
        assertEquals(true, instance.hasFragileItems());
    }
    
}
