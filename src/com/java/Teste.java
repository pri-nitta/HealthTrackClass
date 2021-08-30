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
		

		//segunda classe
		Peso peso = new Peso();
		peso.setData("10/12/21");
		peso.setPeso(70);
		
		Peso peso1 = new Peso();
		peso1.setData("20/12/21");
		peso1.setPeso(72);
		
		System.out.println("");
		System.out.println("PESO");
		System.out.println("=================================");
		System.out.print("data: " +peso.getData());
		System.out.println(" - Peso: "+peso.getPeso());
		System.out.print("data: " +peso1.getData());
		System.out.println(" - Peso: "+peso1.getPeso());
		System.out.println("=================================");
		
	}

}
