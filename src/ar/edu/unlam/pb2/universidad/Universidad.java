package ar.edu.unlam.pb2.universidad;

import java.util.ArrayList;

public class Universidad {

	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	private ArrayList<CicloLectivo> cicloLectivos;
	private ArrayList<Comision> comisiones;
	private ArrayList<Aula> aulas;
	private ArrayList<Docente> docentes;
	private ArrayList<Nota> notas;

	public Universidad(String nombre) {
		this.nombre = nombre;
		this.materias = new ArrayList<>();
		this.alumnos = new ArrayList<>();
		this.cicloLectivos = new ArrayList<>();
		this.comisiones = new ArrayList<>();
		this.aulas = new ArrayList<>();
		this.docentes = new ArrayList<>();
		this.notas = new ArrayList<>();
	}

	public Boolean agregarMaterias(Materia materia) {
		if (this.materias.size() != 0) {
			for (int i = 0; i < this.materias.size(); i++) {
				if (this.materias.get(i).getIdMateria().equals(materia.getIdMateria())) {
					return false;
				}
			}
		}
		return this.materias.add(materia);
	}

	public Boolean agregarAlumnos(Alumno alumno) {
		if (this.alumnos.size() != 0) {
			for (int i = 0; i < this.alumnos.size(); i++) {
				if (this.alumnos.get(i).getIdAlumno().equals(alumno.getIdAlumno())) {
					return false;
				}
			}
		}
		return this.alumnos.add(alumno);
	}

	public Boolean crearCicloLectivo(CicloLectivo cicloLectivo) {
		if (this.cicloLectivos.add(cicloLectivo)) {
			return true;
		}
		return false;
	}

	public Boolean agregarComision(Comision comision) {
		if (this.comisiones.size() != 0) {
			for (int i = 0; i < this.comisiones.size(); i++) {
				if (this.comisiones.get(i).equals(comision)) {
					return false;
				}
			}
		}
		return this.comisiones.add(comision);
	}	

	public Boolean crearAula(Aula aula) {
		return this.aulas.add(aula);
	}

	public Boolean agregarDocente(Docente docente) {
		if (this.docentes.size() != 0) {
			for (int i = 0; i < this.docentes.size(); i++) {
				if ((this.docentes.get(i) != null) && this.docentes.get(i).equals(docente)) {
					return false;
				}
			}
		}
		return this.docentes.add(docente);
	}

	public Boolean registrarNota(Nota nota) {
		if (nota.getValor() <= 10 && nota.getValor() >= 1) {
			return this.notas.add(nota);
		}
		return false;
	}

	public Boolean asginarMateriaCorrelativa(Integer pb1, Integer pb2) {
		Materia materiaPb1 = null;
		Materia materiaPb2 = null;
		Boolean valorDeRetorno = false;
		for (int i = 0; i < this.materias.size(); i++) {
			if (this.materias.get(i).getIdMateria().equals(pb1)) {
				materiaPb1 = this.materias.get(i);
			} else if (this.materias.get(i).getIdMateria().equals(pb2)) {
				materiaPb2 = this.materias.get(i);
			}
		}

		if (materiaPb1 != null && materiaPb2 != null) {
			valorDeRetorno = materiaPb2.asignarMateriaCorrelativa(materiaPb1);
		}

		return valorDeRetorno;
	}

	public Boolean eliminarMateriaCorrelativa(Integer idMateria, Integer idMateriaCorrelativaAEliminar) {
		Materia materiaPb1 = null;
		Materia materiaPb2 = null;
		Boolean valorDeRetorno = false;
		for (int i = 0; i < this.materias.size(); i++) {
			if (this.materias.get(i).getIdMateria().equals(idMateriaCorrelativaAEliminar)) {
				materiaPb1 = this.materias.get(i);
			} else if (this.materias.get(i).getIdMateria().equals(idMateria)) {
				materiaPb2 = this.materias.get(i);
			}
		}

		if (materiaPb1 != null && materiaPb2 != null) {
			valorDeRetorno = materiaPb2.eliminarMateriaCorrelativa(materiaPb1);
		}

		return valorDeRetorno;

	}

}
