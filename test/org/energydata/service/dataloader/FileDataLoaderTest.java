/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.energydata.service.dataloader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qiaob
 */
public class FileDataLoaderTest {
    
    public FileDataLoaderTest() {
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
     * Test of loadData method, of class FileDataLoader.
     */
    @Test
    public void testLoadData() {
        System.out.println("loadData");
        String dataSource = "C:\\Users\\Miage\\Projet2013\\EnergyData\\Data\\RawData\\1000080-2000900-3009906.txt";
        FileDataLoader instance = new FileDataLoader();
        boolean expResult = false;
        boolean result = instance.loadData(dataSource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}