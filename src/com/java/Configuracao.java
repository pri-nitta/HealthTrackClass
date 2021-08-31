package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai Configuracao
 * @author grupo Jarvis
 * @version 1.0
 */

public class Configuracao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Meta do usuario para utilizacao do app
	 */
	private String meta;
	
	/**
	 * Sugestao enviada pelo profissional da area
	 */
	private String dicaDeProfissional;
	
	/**
	 * Mensagem de motivacao para continuar a meta
	 */
	private String mensagemIncentivadora;
	
	/**
	 * Construtor padrao
	 */
	public Configuracao() {
		
	}
	
	/**
	 * Construtor Configuracao
	 * @param meta
	 * @param dicaDeProfissional
	 * @param mensagemIncentivadora
	 */
	public Configuracao(String meta, String dicaDeProfissional, String mensagemIncentivadora ) {
		this.meta = meta;
		this.dicaDeProfissional = dicaDeProfissional;
		this.mensagemIncentivadora = mensagemIncentivadora;
	}
	
	
	/**
	 * verifica a meta do usuario
	 * @return meta
	 */
	public String getMeta() {
		return meta;
	}
	
	/**
	 * Altera a meta do usuario
	 * @param meta
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	/**
	 * verifica a dica do profissional
	 * @return dicaDeProfissional
	 */
	public String getDicaDeProfissional() {
		return dicaDeProfissional;
	}
	
	/**
	 * Altera a dica do profissional
	 * @param dicaDeProfissional
	 */
	public void setDicaDeProfissional(String dicaDeProfissional) {
		this.dicaDeProfissional = dicaDeProfissional;
	}
	
	/**
	 * verifica a mensagem incentivadora
	 * @return mensagemIncentivadora
	 */
	public String getMensagemIncentivadora() {
		return mensagemIncentivadora;
	}
	
	/**
	 * Altera a mensagem incentivadora
	 * @param mensagemIncentivadora
	 */
	public void setMensagemIncentivadora(String mensagemIncentivadora) {
		this.mensagemIncentivadora = mensagemIncentivadora;
	}
}
