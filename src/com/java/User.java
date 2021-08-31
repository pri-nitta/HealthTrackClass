package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai um usuario
 * @author grupo Jarvis
 * @version 1.0
 */

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Nome do usuario
	 */
	private String nome;
	
	/**
	 * Sobrenome do usuario
	 */
	private String sobrenome;
	
	/**
	 * CPF do usuario
	 */
	private long cpf;
	
	/**
	 * Email do usuario
	 */
	private String email;
	
	/**
	 * Data de nascimento do usuario
	 */
	private String dataNasc;
	
	/**
	 * Construtor padrao
	 */
	public User() {
		
	}
	
	/**
	 * Construtor User
	 * @param nome
	 * @param sobrenome
	 * @param cpf
	 * @param email
	 * @param dataNasc
	 */
	public User( String nome, String sobrenome, long cpf, String email, String dataNasc ) {
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	
	/**
	 * Verifica o nome do usuario
	 * @return nome do usuario
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome do usuario
	 * @param nome do usuario
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Verifica o sobrenome do usuario
	 * @return o sobrenome do usuario
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * Altera o sobrenome do usuario
	 * @param sobrenome do usuario
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Verifica o cpf do usuario
	 * @return o cpf do usuario
	 */
	public long getCpf() {
		return cpf;
	}
	
	/**
	 * Altera o cpf do usuario
	 * @param cpf do usuario
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Verifica o email do usuario
	 * @return o email do usuario
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Altera o email do usuario
	 * @param email do usuario
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verifica a data de nascimento do usuario
	 * @return a data de nascimento do usuario
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	
	/**
	 * Altera a data de nascimento do usuario
	 * @param data de nascimento do usuario
	 */
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
