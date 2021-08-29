package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai um usuário
 * @author grupo Jarvis
 * @version 1.0
 */

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Nome do usuário
	 */
	private String nome;
	
	/**
	 * Sobrenome do usuário
	 */
	private String sobrenome;
	
	/**
	 * CPF do usuário
	 */
	private long cpf;
	
	/**
	 * Email do usuário
	 */
	private String email;
	
	/**
	 * Data de nascimento do usuário
	 */
	private String dataNasc;
	
	public User() {
		
	}
	
	/**
	 * Verifica o nome do usuário
	 * @return nome do usuário
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome do usuário
	 * @param nome do usuário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Verifica o sobrenome do usuário
	 * @return o sobrenome do usuário
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * Altera o sobrenome do usuário
	 * @param sobrenome do usuaário
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Verifica o cpf do usuário
	 * @return o cpf do usuário
	 */
	public long getCpf() {
		return cpf;
	}
	
	/**
	 * Altera o cpf do usuário
	 * @param cpf do usuaário
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Verifica o email do usuário
	 * @return o email do usuário
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Altera o email do usuário
	 * @param email do usuaário
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verifica a data de nascimento do usuário
	 * @return a data de nascimento do usuário
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	
	/**
	 * Altera a data de nascimento do usuário
	 * @param data de nascimento do usuaário
	 */
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
