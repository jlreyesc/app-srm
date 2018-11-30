package com.srm.domain;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre_cliente;
    @Column
    private Double limite_credito;
    @Column
    private String riesgo;
    @Column
    private Integer tasa_interes;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre_cliente
	 */
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	/**
	 * @param nombre_cliente the nombre_cliente to set
	 */
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	/**
	 * @return the limite_credito
	 */
	public Double getLimite_credito() {
		return limite_credito;
	}
	/**
	 * @param limite_credito the limite_credito to set
	 */
	public void setLimite_credito(Double limite_credito) {
		this.limite_credito = limite_credito;
	}
	/**
	 * @return the riesgo
	 */
	public String getRiesgo() {
		return riesgo;
	}
	/**
	 * @param riesgo the riesgo to set
	 */
	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}
	/**
	 * @return the tasa_interes
	 */
	public Integer getTasa_interes() {
		return tasa_interes;
	}
	/**
	 * @param tasa_interes the tasa_interes to set
	 */
	public void setTasa_interes(Integer tasa_interes) {
		this.tasa_interes = tasa_interes;
	}
	
    
    
    

}
