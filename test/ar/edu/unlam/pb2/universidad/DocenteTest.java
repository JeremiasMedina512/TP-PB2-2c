package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class DocenteTest {

	@Test
	public void crearDocente() {
		Universidad unlam = new Universidad("unlam");
		Integer dniDocente = 1;
		Boolean resultadoEsperado = false;
		
		Docente docente= new Docente(dniDocente);
		
		resultadoEsperado =unlam.crearDocente(docente);
		
		assertTrue(resultadoEsperado);
	}
	
	@Test
	public void agregarDocenteAArrayDocentes() {
		Universidad unlam = new Universidad("unlam");
		Integer dniDocente = 1;
		Boolean resultadoEsperado = false;
		
		Docente docente= new Docente(dniDocente);
		
		unlam.crearDocente(docente);
		resultadoEsperado =unlam.agregarDocente(docente);
		
		assertTrue(resultadoEsperado);
		
	}
	
	

}
