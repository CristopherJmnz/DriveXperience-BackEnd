package es.tfg.drivex.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ReservaDto {
	
	private int idReserva;
	private int idCoche;
	private String email;
	private Date fechaInicio, fechaFin;
	private BigDecimal precioTotal;
	
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public ReservaDto() {
		super();
	}

	@Override
	public String toString() {
		return "ReservaDto [idReserva=" + idReserva + ", idCoche=" + idCoche + ", email=" + email + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", precioTotal=" + precioTotal + "]";
	}	

}
