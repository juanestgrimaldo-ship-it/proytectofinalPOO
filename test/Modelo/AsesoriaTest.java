/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juang
 */
public class AsesoriaTest {

    public AsesoriaTest() {
    }

    @Test
    public void testCalcularEsfuerzo_presencial() {
        System.out.println("testCalcularEsfuerzo_presencial");
        Asignatura asig = new Asignatura("AyP", "Algoritmia y Programación");
        Asesoria instance = new Asesoria(asig, "PRESENCIAL", LocalDate.of(2026, 8, 11), 22);
        int expResult = 2;
        int result = instance.calcularEsfuerzo();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularEsfuerzo_virtual() {
        System.out.println("testCalcularEsfuerzo_virtual");
        Asignatura asig = new Asignatura("POO", "Programación Orientada a Objetos");
        Asesoria instance = new Asesoria(asig, "VIRTUAL", LocalDate.of(2026, 8, 12), 15);
        int expResult = 3;
        int result = instance.calcularEsfuerzo();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularEsfuerzo_otra() {
        System.out.println("testCalcularEsfuerzo_otra");
        Asignatura asig = new Asignatura("BD1", "Bases de Datos 1");
        Asesoria instance = new Asesoria(asig, "OTRA", LocalDate.of(2026, 10, 9), 25);
        int expResult = 0;
        int result = instance.calcularEsfuerzo();
        assertEquals(expResult, result);
    }

}
