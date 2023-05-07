package es.tfg.drivex.entitybeans;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	private String apellidos;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String nombre;

	private String password;
	
	private String telefono;


	//uni-directional many-to-many association to Direccione
    @ManyToMany(fetch = FetchType.LAZY,
              cascade = {
                      CascadeType.PERSIST,
                      CascadeType.MERGE
                  })
	@JoinTable(
		name="tarjetas_usuarios"
		, joinColumns={
			@JoinColumn(name="email")
			}
		, inverseJoinColumns={
			@JoinColumn(name="num_tarjeta")
			}
		)
	private List<Tarjeta> tarjetas;

	public Usuario() {
		tarjetas = new ArrayList<>();
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", nombre=" + nombre + ", password=" + password + ", tarjetas=" + tarjetas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email);
	}

	
	public void addTarjeta(Tarjeta tarjeta) {
		if (tarjetas == null)
			tarjetas = new ArrayList<>();
		tarjetas.add(tarjeta);
		
	}
	
	public void removeTarjeta(Tarjeta tarjeta) {
		if (tarjetas == null)
			tarjetas = new ArrayList<>();
		tarjetas.remove(tarjeta);
		
	}
	
}