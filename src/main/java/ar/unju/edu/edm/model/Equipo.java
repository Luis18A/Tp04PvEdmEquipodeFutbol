package ar.unju.edu.edm.model;

import java.io.Serializable;

public class Equipo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEquipo;
	private String nombre;
	private Estadio estadio;

	public Equipo() {
	}

	public Equipo(Integer idEquipo, String nombre, Estadio estadio) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.estadio = estadio;
	}

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadio == null) ? 0 : estadio.hashCode());
		result = prime * result + ((idEquipo == null) ? 0 : idEquipo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (estadio == null) {
			if (other.estadio != null)
				return false;
		} else if (!estadio.equals(other.estadio))
			return false;
		if (idEquipo == null) {
			if (other.idEquipo != null)
				return false;
		} else if (!idEquipo.equals(other.idEquipo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
}
