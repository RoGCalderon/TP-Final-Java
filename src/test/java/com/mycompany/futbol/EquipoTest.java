/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.futbol;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rocio
 */
public class EquipoTest {
    
    public EquipoTest() {
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
     * Test of mostrarEquipos method, of class Equipo.
     */
    @Test
    public void testMostrarEquipos() {
        System.out.println("mostrarEquipos");
        Equipo instance = new Equipo();
        instance.mostrarEquipos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarUnEquipo method, of class Equipo.
     */
    @Test
    public void testMostrarUnEquipo() {
        System.out.println("mostrarUnEquipo");
        int idEquipo = 0;
        Equipo instance = new Equipo();
        instance.mostrarUnEquipo(idEquipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
