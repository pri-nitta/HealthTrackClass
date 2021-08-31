package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai Alimentacao
 * @author grupo Jarvis
 * @version 1.0
 */

public class Alimentacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Nome da refeicao realizada
	 */
	private String refeicaoNome;
	
	/**
	 * Nome do alimento
	 */
	private String alimentacaoCardapio;
	
	/**
	 * Tipo de macronutriente (ex: Proteina, Carboidrato, Gordura)
	 */
	private String macronutriente;
	
	/**
	 * Quantidade do alimento registrado
	 */
	private int quantidadeDaPorcao;
	
	/**
	 * Quantidade de calorias
	 */
	private float caloriasConsumidas;
	
	/**
	 * horário da refeicao
	 */
	private String horario;
	
	/**
	 * Data da refeicao
	 */
	private String data;
	
	/**
	 * Construtor padrao
	 */
	public Alimentacao () {
	}
	
	/**
	 * Construtor Alimentacao
	 * @param refeicaoNome
	 * @param alimentacaoCardapio
	 * @param macronutriente
	 * @param quantidadeDaPorcao
	 * @param caloriasConsumidas
	 * @param horario
	 * @param data
	 */
	public Alimentacao (String refeicaoNome, 
			String alimentacaoCardapio, 
			String macronutriente, 
			int quantidadeDaPorcao, 
			float caloriasConsumidas, 
			String horario, 
			String data ) {
		this.refeicaoNome = refeicaoNome;
		this.alimentacaoCardapio = alimentacaoCardapio;
		this.macronutriente = macronutriente;
		this.quantidadeDaPorcao = quantidadeDaPorcao;
		this.caloriasConsumidas = caloriasConsumidas;
		this.horario = horario;
		this.data = data;
	}
	
	/**
	 * Verifica o nome da refeicao
	 * @return refeicaoNome
	 */
	public String getRefeicaoNome() {
		return refeicaoNome;
	}
	
	/**
	 * Altera o nome da refeicao
	 * @param refeicaoNome
	 */
	public void setRefeicaoNome(String refeicaoNome) {
		this.refeicaoNome = refeicaoNome;
	}
	
	/**
	 * Verifica o nome do alimento 
	 * @return alimentacaoCardapio
	 */
	public String getAlimentacaoCardapio() {
		return alimentacaoCardapio;
	}
	
	
	/**
	 * Altera o nome do alimento 
	 * @param alimentacaoCardapio
	 */
	public void setAlimentacaoCardapio(String alimentacaoCardapio) {
		this.alimentacaoCardapio = alimentacaoCardapio;
	}
	
	/**
	 * Verifica o macronutriente do alimento
	 * @return macronutriente
	 */
	public String getMacronutriente() {
		return macronutriente;
	}
	
	/**
	 * Altera o macronutriente do alimento
	 * @param macronutriente
	 */
	public void setMacronutriente(String macronutriente) {
		this.macronutriente = macronutriente;
	}
	
	/**
	 * Verifica a quantidade da porcao
	 * @return quantidadeDaPorcao
	 */
	public int getQuantidadeDaPorcao() {
		return quantidadeDaPorcao;
	}
	
	/**
	 * Altera a quantidade da porcao
	 * @param quantidadeDaPorcao
	 */
	public void setQuantidadeDaPorcao(int quantidadeDaPorcao) {
		this.quantidadeDaPorcao = quantidadeDaPorcao;
	}
	
	/**
	 * Verifica o total de calorias consumidas
	 * @return caloriasConsumidas
	 */
	public float getCaloriasConsumidas() {
		return caloriasConsumidas;
	}
	
	/**
	 * Altera o total de calorias consumidas
	 * @param caloriasConsumidas
	 */
	public void setCaloriasConsumidas(float caloriasConsumidas) {
		this.caloriasConsumidas = caloriasConsumidas;
	}
	
	/**
	 * Verifica o horario da refeicao
	 * @return horario
	 */
	public String getHorario() {
		return horario;
	}
	
	/**
	 * Altera o horario da refeicao
	 * @param horario
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	/**
	 * Verifica a data da refeicao
	 * @return data
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * Altera a data da refeicao
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
}
