package com.java;

/**
 * Classe que testa as classes
 * @author grupo Jarvis
 * @version 1.0
 */

public class Teste {

	public static void main(String[] args) {
		
		/**
		 * cria uma variável usuario que extende a classe User
		 */
		User usuario = new User();
		
		/**
		 * estabelece o nome do usuario
		 */
		usuario.setNome("Hommer");
		
		/**
		 * estabelece o sobrenome do usuario
		 */
		usuario.setSobrenome("Simpson");
		
		/**
		 * estabelece o cpf do usuario
		 */
		usuario.setCpf(789456123);
		
		/**
		 * estabelece a data de nascimento do usuario
		 */
		usuario.setDataNasc("01/01/1980");
		
		/**
		 * estabelece o email do usuario
		 */
		usuario.setEmail("hommer.simpson@email.com");
		
		/**
		 * imprime todas as informações do usuario
		 */
		System.out.println("DADOS DO USUARIO");
		System.out.println("=================================");
		System.out.println("Nome: " +usuario.getNome());
		System.out.println("Sobrenome: " +usuario.getSobrenome());
		System.out.println("CPF: " +usuario.getCpf());
		System.out.println("Data nascimento: " +usuario.getDataNasc());
		System.out.println("E-mail: " +usuario.getEmail());
		System.out.println("=================================");
		

		/**
		 * cria uma variável usuario que extende a classe AtividadeFisica
		 */
		AtividadeFisica atividadeFisica = new AtividadeFisica();
		
		atividadeFisica.setDataAtividade("30/08/2021");
		atividadeFisica.setNomeAtividade("Corrida");
		atividadeFisica.setCaloriaAtividade("520 kcal");
		atividadeFisica.setTempoTotalAtividade("1h");
		
		/**
		 * imprime a lista de atividades do usuario
		 */
	System.out.println("");
		System.out.println("ATIVIDADE FISICA");
		System.out.println("=================================");
		System.out.println("Data: " +atividadeFisica.getDataAtividade());
		System.out.println("Tipo atividade: "+atividadeFisica.getDataAtividade());
		System.out.println("Calorias gastas: "+atividadeFisica.getCaloriaAtividade());
		System.out.println("Tempo total da atividade: "+atividadeFisica.getTempoTotalAtividade());
		System.out.println("=================================");
		
		
		atividadeFisica.setDataAtividade("01/09/2021");
		atividadeFisica.setNomeAtividade("Musculação");
		atividadeFisica.setCaloriaAtividade("300 kcal");
		atividadeFisica.setTempoTotalAtividade("30 min");
		
		System.out.println("");
		System.out.println("Data: " +atividadeFisica.getDataAtividade());
		System.out.println("Tipo atividade: "+atividadeFisica.getDataAtividade());
		System.out.println("Calorias gastas: "+atividadeFisica.getCaloriaAtividade());
		System.out.println("Tempo total da atividade: "+atividadeFisica.getTempoTotalAtividade());
		System.out.println("=================================");
		
	}

}
