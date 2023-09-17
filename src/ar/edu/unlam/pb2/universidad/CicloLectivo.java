package ar.edu.unlam.pb2.universidad;

import java.util.Date;

public class CicloLectivo {

	private Integer idCicloLectivo;
	private Date fechaInicioCicloLectivo;
	private Date fechaFinalizacionCicloLectivo;
	private Date fechaInicioInscripcion;
	private Date fechaFinalizacion;

	public CicloLectivo(Integer idCicloLectivo, Date fechaInicioCicloLectivo, Date fechaInicioInscripcion,
			Date fechaFinalizacionInscripcion, Date fechaFinalizacionCicloLectivo) {
		this.idCicloLectivo = idCicloLectivo;
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinalizacion = fechaFinalizacionInscripcion;
		
	}

	public CicloLectivo() {
		// TODO Auto-generated constructor stub
	}

}
