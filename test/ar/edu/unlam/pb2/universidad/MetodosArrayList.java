package ar.edu.unlam.pb2.universidad;

import java.util.ArrayList;

public class MetodosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Materia> arrayMaterias = new ArrayList<>();
		Materia a = new Materia(1,"PB1");
		Materia b = new Materia(2,"PB2");
		Materia c = new Materia(3,"BD1");
		Materia remover = new Materia(3,"BD1");
		arrayMaterias.add(a);
		arrayMaterias.add(b);
		arrayMaterias.add(c);
		
		for(Materia i: arrayMaterias) {
			System.out.println(i.getIdMateria());
		}
		
		System.out.println("-----Remover por indice");
		
		arrayMaterias.remove(0);
		
		for(Materia i: arrayMaterias) {
			System.out.println(i.getIdMateria());
		}  
		
		System.out.println("-----Remover por objeto");
		
		arrayMaterias.add(remover);
		
		for(Materia i: arrayMaterias) {
			System.out.println("Referencia: " + i);
			System.out.println("Hash: " + i.hashCode() );
		}
		
		System.out.println("-------------------");
		
		Docente docenteA = new Docente(1);
		Docente docenteB = new Docente(1);
		
		System.out.println(docenteA.equals(docenteB));
		System.out.println(docenteA.hashCode());
		System.out.println(docenteB.hashCode());
		
		
	}

}
