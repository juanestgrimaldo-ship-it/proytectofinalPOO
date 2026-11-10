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
public class AlumnoSinPruebaTest {

    public AlumnoSinPruebaTest() {
    }

    @Test
    public void testCalcularAprovechamiento_no() {
        System.out.println("testCalcularAprovechamiento_no");
        Asignatura asig = new Asignatura("AyP", "Algoritmia y Programación");
        AlumnoSinPrueba instance = new AlumnoSinPrueba(2, 2241834, "Camila Ramírez");
        instance.adicionarAsesoria(new Asesoria(asig, "PRESENCIAL", LocalDate.of(2026, 8, 11), 22));
        String expResult = "NO";
        String result = instance.calcularAprovechamiento();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularAprovechamiento_bueno() {
        System.out.println("testCalcularAprovechamiento_bueno");
        Asignatura asig3 = new Asignatura("EDyA1", "Estructura de Datos y Algoritmos 1");
        Asignatura asig4 = new Asignatura("BD1", "Bases de Datos 1");
        AlumnoSinPrueba instance = new AlumnoSinPrueba(5, 2219045, "Walter Malagón");
        instance.adicionarAsesoria(new Asesoria(asig4, "PRESENCIAL", LocalDate.of(2026, 10, 9), 25));
        instance.adicionarAsesoria(new Asesoria(asig3, "VIRTUAL", LocalDate.of(2026, 10, 14), 15));
        String expResult = "BUENO";
        String result = instance.calcularAprovechamiento();
        assertEquals(expResult, result);
    }

}
