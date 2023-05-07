package es.tfg.drivex.entitybeans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;


/**
 * The persistent class for the coches database table.
 * 
 */
@Entity
@Table(name="coches")
@NamedQuery(name="Coche.findAll", query="SELECT c FROM Coche c")
public class Coche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coche")
	private int idCoche;

	private BigDecimal aceleracion;

	private String cambio;

	private String color;

	private String combustible;

	@Column(name="descripcion_general")
	private String descripcionGeneral;
	
	@Column(name="descripcion_frontal")
	private String descripcionFrontal;
	
	@Column(name="descripcion_trasera")
	private String descripcionTrasera;

	private String estado;
	
	private String banner;

	private String imagen1;

	private String imagen10;

	private String imagen2;

	private String imagen3;

	private String imagen4;

	private String imagen5;

	private String imagen6;

	private String imagen7;

	private String imagen8;

	private String imagen9;

	@Column(name="nombre_coche")
	private String nombreCoche;

	private int plazas;

	@Column(name="potencia_max")
	private String potenciaMax;

	@Column(name="precio_dia")
	private BigDecimal precioDia;

	@Column(name="precio_semana")
	private BigDecimal precioSemana;

	private String transmision;

	@Column(name="velocidad_max")
	private BigDecimal velocidadMax;

	//uni-directional many-to-one association to Marca
	@ManyToOne
	@JoinColumn(name="id_marca")
	private Marca marca;

	public Coche() {
	}

	

	public int getIdCoche() {
		return idCoche;
	}



	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}



	public BigDecimal getAceleracion() {
		return aceleracion;
	}



	public void setAceleracion(BigDecimal aceleracion) {
		this.aceleracion = aceleracion;
	}



	public String getCambio() {
		return cambio;
	}



	public void setCambio(String cambio) {
		this.cambio = cambio;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getCombustible() {
		return combustible;
	}



	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}



	public String getDescripcionGeneral() {
		return descripcionGeneral;
	}



	public void setDescripcionGeneral(String descripcionGeneral) {
		this.descripcionGeneral = descripcionGeneral;
	}



	



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getBanner() {
		return banner;
	}



	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getImagen1() {
		return imagen1;
	}



	public void setImagen1(String imagen1) {
		this.imagen1 = imagen1;
	}



	public String getImagen10() {
		return imagen10;
	}



	public void setImagen10(String imagen10) {
		this.imagen10 = imagen10;
	}



	public String getImagen2() {
		return imagen2;
	}



	public void setImagen2(String imagen2) {
		this.imagen2 = imagen2;
	}



	public String getImagen3() {
		return imagen3;
	}



	public void setImagen3(String imagen3) {
		this.imagen3 = imagen3;
	}



	public String getImagen4() {
		return imagen4;
	}



	public void setImagen4(String imagen4) {
		this.imagen4 = imagen4;
	}



	public String getImagen5() {
		return imagen5;
	}



	public void setImagen5(String imagen5) {
		this.imagen5 = imagen5;
	}



	public String getImagen6() {
		return imagen6;
	}



	public void setImagen6(String imagen6) {
		this.imagen6 = imagen6;
	}



	public String getImagen7() {
		return imagen7;
	}



	public void setImagen7(String imagen7) {
		this.imagen7 = imagen7;
	}



	public String getImagen8() {
		return imagen8;
	}



	public void setImagen8(String imagen8) {
		this.imagen8 = imagen8;
	}



	public String getImagen9() {
		return imagen9;
	}



	public void setImagen9(String imagen9) {
		this.imagen9 = imagen9;
	}



	public String getNombreCoche() {
		return nombreCoche;
	}



	public void setNombreCoche(String nombreCoche) {
		this.nombreCoche = nombreCoche;
	}



	public int getPlazas() {
		return plazas;
	}



	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}



	public String getPotenciaMax() {
		return potenciaMax;
	}



	public void setPotenciaMax(String potenciaMax) {
		this.potenciaMax = potenciaMax;
	}



	public BigDecimal getPrecioDia() {
		return precioDia;
	}



	public void setPrecioDia(BigDecimal precioDia) {
		this.precioDia = precioDia;
	}



	public BigDecimal getPrecioSemana() {
		return precioSemana;
	}



	public void setPrecioSemana(BigDecimal precioSemana) {
		this.precioSemana = precioSemana;
	}



	public String getTransmision() {
		return transmision;
	}



	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}



	public BigDecimal getVelocidadMax() {
		return velocidadMax;
	}



	public void setVelocidadMax(BigDecimal velocidadMax) {
		this.velocidadMax = velocidadMax;
	}



	public Marca getMarca() {
		return marca;
	}



	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	public String getDescripcionFrontal() {
		return descripcionFrontal;
	}



	public void setDescripcionFrontal(String descripcionFrontal) {
		this.descripcionFrontal = descripcionFrontal;
	}



	public String getDescripcionTrasera() {
		return descripcionTrasera;
	}



	public void setDescripcionTrasera(String descripcionTrasera) {
		this.descripcionTrasera = descripcionTrasera;
	}



	@Override
	public int hashCode() {
		return Objects.hash(idCoche);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return idCoche == other.idCoche;
	}



	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", aceleracion=" + aceleracion + ", cambio=" + cambio + ", color=" + color
				+ ", combustible=" + combustible + ", descripcionGeneral=" + descripcionGeneral
				+ ", descripcionFrontal=" + descripcionFrontal + ", descripcionTrasera=" + descripcionTrasera
				+ ", estado=" + estado + ", banner=" + banner + ", imagen1=" + imagen1 + ", imagen10=" + imagen10
				+ ", imagen2=" + imagen2 + ", imagen3=" + imagen3 + ", imagen4=" + imagen4 + ", imagen5=" + imagen5
				+ ", imagen6=" + imagen6 + ", imagen7=" + imagen7 + ", imagen8=" + imagen8 + ", imagen9=" + imagen9
				+ ", nombreCoche=" + nombreCoche + ", plazas=" + plazas + ", potenciaMax=" + potenciaMax
				+ ", precioDia=" + precioDia + ", precioSemana=" + precioSemana + ", transmision=" + transmision
				+ ", velocidadMax=" + velocidadMax + ", marca=" + marca + "]";
	}

	
	
}