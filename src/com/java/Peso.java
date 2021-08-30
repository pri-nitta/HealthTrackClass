package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai o Peso
 * @author grupo Jarvis
 * @version 1.0
 */

public class Peso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * data do registo de peso
	 */
	private String data;
	
	/**
	 * valor do peso
	 */
	private int peso;
	
	/**
	 * Verifica a data do registro do peso
	 * @return data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Altera a data
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Verifica o peso do registro
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Altera o peso
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
