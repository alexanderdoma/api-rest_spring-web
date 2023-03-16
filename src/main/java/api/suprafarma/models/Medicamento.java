package api.suprafarma.models;

import java.io.Serializable;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "medicamentos", catalog = "suprafarma", schema = "")
@Data
public class Medicamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id_medicamento;
	

    private String nombre_medicamento;
    private String nombre_comercial;
    private String descripcion;
    private String forma_farmaceutica;
    private int dosis;
    private String presentacion;
    private String via_administracion;
    private Date fecha_caducidad;
    private String proveedor;
    private double precio;
    private int stock;
    
	public Integer getId_medicamento() {
		return id_medicamento;
	}
	public void setId_medicamento(Integer id_medicamento) {
		this.id_medicamento = id_medicamento;
	}
	public String getNombre_medicamento() {
		return nombre_medicamento;
	}
	public void setNombre_medicamento(String nombre_medicamento) {
		this.nombre_medicamento = nombre_medicamento;
	}
	public String getNombre_comercial() {
		return nombre_comercial;
	}
	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getForma_farmaceutica() {
		return forma_farmaceutica;
	}
	public void setForma_farmaceutica(String forma_farmaceutica) {
		this.forma_farmaceutica = forma_farmaceutica;
	}
	public int getDosis() {
		return dosis;
	}
	public void setDosis(int dosis) {
		this.dosis = dosis;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public String getVia_administracion() {
		return via_administracion;
	}
	public void setVia_administracion(String via_administracion) {
		this.via_administracion = via_administracion;
	}
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
