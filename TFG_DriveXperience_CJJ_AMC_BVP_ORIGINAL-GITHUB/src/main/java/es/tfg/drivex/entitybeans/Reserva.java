package es.tfg.drivex.entitybeans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the reservas database table.
 * 
 */
@Entity
@Table(name="reservas")
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_reserva")
	private int idReserva;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="precio_total")
	private BigDecimal precioTotal;

	//uni-directional many-to-one association to Coche
	@ManyToOne
	@JoinColumn(name="id_coche")
	private Coche coche;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email")
	private Usuario usuario;
	
	@Column(name="direccion_entrega")
	private String direccionEntrega;

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public Reserva() {
	}

	public int getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public BigDecimal getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Coche getCoche() {
		return this.coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", fechaFin=" + fechaFin + ", fechaInicio=" + fechaInicio
				+ ", precioTotal=" + precioTotal + ", coche=" + coche + ", usuario=" + usuario + ", direccionEntrega="
				+ direccionEntrega + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return idReserva == other.idReserva;
	}

}