package com.java;

/**
 * Classe que testa as classes
 * @author grupo Jarvis
 * @version 1.0
 */

public class Teste {

	public static void main(String[] args) {
		
		User usuario = new User();
		usuario.setNome("Hommer");
		usuario.setSobrenome("Simpson");
		usuario.setCpf(789456123);
		usuario.setDataNasc("01/01/1980");
		usuario.setEmail("hommer.simpson@email.com");
		
		System.out.println("DADOS DO USUÁRIO");
		System.out.println("================================");
		System.out.println("Nome: " +usuario.getNome());
		System.out.println("Sobrenome: " +usuario.getSobrenome());
		System.out.println("CPF: " +usuario.getCpf());
		System.out.println("Data nascimento: " +usuario.getDataNasc());
		System.out.println("E-mail: " +usuario.getEmail());
		System.out.println("================================");
		
	}

}
