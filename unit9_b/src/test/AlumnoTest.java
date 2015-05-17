package test;

import static org.junit.Assert.*;

import org.junit.Test;

import unit9_b.Alumno;

/**
 * 
 * @author Laura Martinez Priego 1º DAM
 *
 */
public class AlumnoTest {

	@Test
	public void testValidaNif1() 
	{
		Alumno a = new Alumno(); 
		String nif = "123456";
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = a.validaNif(nif);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void testValidaNif2() 
	{
		Alumno a = new Alumno(); 
		String nif = "29194741J";
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = a.validaNif(nif);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void testValidaNif3()
	{
		Alumno a = new Alumno(); 
		String nif = "7HHH444K4";
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = a.validaNif(nif);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void testValidaNif4() 
	{
		Alumno a = new Alumno(); 
		String nif = null; 
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = a.validaNif(nif);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void testValidaNif5() 
	{
		Alumno a = new Alumno(); 
		String nif = "29194741G"; 
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = a.validaNif(nif);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	
	
	
	
	@Test
	public void testCalculaTasaMatricula1() 
	{
		Alumno a = new Alumno(); 
		int edad = 30;
		boolean familiaNumerosa = true;
		boolean repetidor = true;
		
		float resultadoEsperado = 250;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}
	@Test
	public void testCalculaTasaMatricula2() 
	{
		Alumno a = new Alumno(); 
		int edad = 67;
		boolean familiaNumerosa = false;
		boolean repetidor = false;
		
		float resultadoEsperado = 250;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}
	@Test
	public void testCalculaTasaMatricula3() 
	{
		Alumno a = new Alumno(); 
		int edad = 23;
		boolean familiaNumerosa = false;
		boolean repetidor = true;
		
		float resultadoEsperado = 2000;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}
	@Test
	public void testCalculaTasaMatricula4() 
	{
		Alumno a = new Alumno(); 
		int edad = 23;
		boolean familiaNumerosa = false;
		boolean repetidor = false;
		
		float resultadoEsperado = 500;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}
	@Test
	public void testCalculaTasaMatricula5() 
	{
		Alumno a = new Alumno(); 
		int edad = 63;
		boolean familiaNumerosa = false;
		boolean repetidor = false;
		
		float resultadoEsperado = 400;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}
	@Test
	public void testCalculaTasaMatricula6() 
	{
		Alumno a = new Alumno(); 
		int edad = 23;
		boolean familiaNumerosa = true;
		boolean repetidor = false;
		
		float resultadoEsperado = 250;
		float resultadoObtenido = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		assertTrue(resultadoEsperado == resultadoObtenido);
	}

}
