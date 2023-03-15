package es.tfg.drivex.entitybeans;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the marcas database table.
 * 
 */
@Entity
@Table(name="marcas")
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_marca")
	private int idMarca;

	private String descripcion;

	@Column(name="imagen_logo")
	private String imagenLogo;

	@Column(name="nombre_marca")
	private String nombreMarca;

	public Marca() {
	}

	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenLogo() {
		return this.imagenLogo;
	}

	public void setImagenLogo(String imagenLogo) {
		this.imagenLogo = imagenLogo;
	}

	public String getNombreMarca() {
		return this.nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + ", descripcion=" + descripcion + ", imagenLogo=" + imagenLogo
				+ ", nombreMarca=" + nombreMarca + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMarca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return idMarca == other.idMarca;
	}

}