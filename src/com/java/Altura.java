package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai uma altura
 * @author grupo Jarvis
 * @version 1.0
 */

public class Altura implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Altura
	 */
	private double altura;
	/**
	 * data do registro da altura
	 */
	private String dataAltura;
	
	/**
	 * Construtor Altura
	 * @param altura
	 * @param dataAltura
	 */
	public Altura(double altura,String dataAltura) {
		this.altura = altura;
		this.dataAltura = dataAltura;
	}
	/**
	 * Construtor padrao
	 */
	public Altura() {
		
	}
	
	/**
	 * verifica a altura
	 * @return altura
	 */
	
	public double getAltura() {
		return altura;
	}
	/**
	 * Altera a altura
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * verifica a data da altura
	 * @return dataAltura
	 */
	
	public String getDataAltura() {
		return dataAltura;
	}
	/**
	 * Altera a data da altura
	 * @param dataAltura
	 */
	public void setDataAltura(String dataAltura) {
		this.dataAltura = dataAltura;
	}

}
