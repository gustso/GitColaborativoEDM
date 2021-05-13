package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component 
public class LucasArgota {
	private Integer idalumno;
	private String nombre ;
	private String apellido ;
	public Integer getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Integer idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	} 
	
	

}
