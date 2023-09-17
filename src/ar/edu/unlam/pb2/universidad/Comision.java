package ar.edu.unlam.pb2.universidad;

public class Comision {

	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private Turno turno;

	public Comision(Integer id, Materia materia, CicloLectivo cicloLectivo, Turno turno) {
		this.id = id;
		this.materia  = materia;
		this.cicloLectivo = cicloLectivo;
		this.turno = turno;
	}


}
