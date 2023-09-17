package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class ComisionTest {

	@Test
	public void crearComision() {
		Integer id = 1;
		Materia materia = new Materia();
		CicloLectivo cicloLectivo = new CicloLectivo();
		Turno turno = new Turno();
		Boolean resultadoEsperado = false;
		
		Comision comision = new Comision(id,materia,cicloLectivo,turno);
		Universidad unlam = new Universidad("Unlam");
		resultadoEsperado =unlam.crearComision(comision);
		
		assertTrue(resultadoEsperado);

	}

}
