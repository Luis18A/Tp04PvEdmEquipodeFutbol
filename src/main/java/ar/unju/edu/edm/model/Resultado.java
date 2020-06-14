package ar.unju.edu.edm.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Resultado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate fecha;
	private Equipo equipo1;
	private Equipo equipo2;
	private Integer golesEquipo1;
	private Integer golesEquipo2;

	public Resultado() {
	}

	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, Integer golesEquipo1, Integer golesEquipo2) {
		super();
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Integer getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(Integer golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public Integer getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(Integer golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipo1 == null) ? 0 : equipo1.hashCode());
		result = prime * result + ((equipo2 == null) ? 0 : equipo2.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((golesEquipo1 == null) ? 0 : golesEquipo1.hashCode());
		result = prime * result + ((golesEquipo2 == null) ? 0 : golesEquipo2.hashCode());
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
		Resultado other = (Resultado) obj;
		if (equipo1 == null) {
			if (other.equipo1 != null)
				return false;
		} else if (!equipo1.equals(other.equipo1))
			return false;
		if (equipo2 == null) {
			if (other.equipo2 != null)
				return false;
		} else if (!equipo2.equals(other.equipo2))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (golesEquipo1 == null) {
			if (other.golesEquipo1 != null)
				return false;
		} else if (!golesEquipo1.equals(other.golesEquipo1))
			return false;
		if (golesEquipo2 == null) {
			if (other.golesEquipo2 != null)
				return false;
		} else if (!golesEquipo2.equals(other.golesEquipo2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
	
}
