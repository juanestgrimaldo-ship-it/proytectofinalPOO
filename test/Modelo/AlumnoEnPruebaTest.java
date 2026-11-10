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
public class AlumnoEnPruebaTest {

    public AlumnoEnPruebaTest() {
    }

    @Test
    public void testCalcularAprovechamiento_mejorable() {
        System.out.println("testCalcularAprovechamiento_mejorable");
        Asignatura asig = new Asignatura("POO", "Programación Orientada a Objetos");
        AlumnoEnPrueba instance = new AlumnoEnPrueba(2.8, 2233409, "Mario Ríos");
        instance.adicionarAsesoria(new Asesoria(asig, "VIRTUAL", LocalDate.of(2026, 8, 12), 15));
        instance.adicionarAsesoria(new Asesoria(asig, "PRESENCIAL", LocalDate.of(2026, 8, 28), 20));
        String expResult = "MEJORABLE";
        String result = instance.calcularAprovechamiento();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularAprovechamiento_bueno() {
        System.out.println("testCalcularAprovechamiento_bueno");
        Asignatura asig = new Asignatura("POO", "Programación Orientada a Objetos");
        AlumnoEnPrueba instance = new AlumnoEnPrueba(2.5, 2228342, "Bernardo Guzmán");
        instance.adicionarAsesoria(new Asesoria(asig, "PRESENCIAL", LocalDate.of(2026, 9, 2), 30));
        instance.adicionarAsesoria(new Asesoria(asig, "PRESENCIAL", LocalDate.of(2026, 9, 9), 30));
        String expResult = "BUENO";
        String result = instance.calcularAprovechamiento();
        assertEquals(expResult, result);
    }

}
