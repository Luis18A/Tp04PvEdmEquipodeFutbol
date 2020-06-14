package ar.unju.edu.edm.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Estadio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEstadio;
	private String nombre;
	private	LocalDate fechaFundacion;
	private String cuidad;
	private Integer capacidad;
	private String direccion;

	public Estadio() {
	}

	public Estadio(Integer idEstadio, String nombre, LocalDate fechaFundacion, String cuidad, Integer capacidad,
			String direccion) {
		super();
		this.idEstadio = idEstadio;
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.cuidad = cuidad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	public Integer getIdEstadio() {
		return idEstadio;
	}

	public void setIdEstadio(Integer idEstadio) {
		this.idEstadio = idEstadio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidad == null) ? 0 : capacidad.hashCode());
		result = prime * result + ((cuidad == null) ? 0 : cuidad.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((fechaFundacion == null) ? 0 : fechaFundacion.hashCode());
		result = prime * result + ((idEstadio == null) ? 0 : idEstadio.hashCode());
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
		Estadio other = (Estadio) obj;
		if (capacidad == null) {
			if (other.capacidad != null)
				return false;
		} else if (!capacidad.equals(other.capacidad))
			return false;
		if (cuidad == null) {
			if (other.cuidad != null)
				return false;
		} else if (!cuidad.equals(other.cuidad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (fechaFundacion == null) {
			if (other.fechaFundacion != null)
				return false;
		} else if (!fechaFundacion.equals(other.fechaFundacion))
			return false;
		if (idEstadio == null) {
			if (other.idEstadio != null)
				return false;
		} else if (!idEstadio.equals(other.idEstadio))
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
		return "Estadio [idEstadio=" + idEstadio + ", nombre=" + nombre + ", fechaFundacion=" + fechaFundacion
				+ ", cuidad=" + cuidad + ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
	
}