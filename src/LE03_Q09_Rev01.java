/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 09 - Utilizando a estrutura de controle para repetição while, leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
*/

import java.util.Scanner;

public class LE03_Q09_Rev01 {
	
	public static void main(String[] args) {
	
		int cont = 1;
		int idade = 0;
		int idadeMenor = 100;
		
		String nome = null;
		String nomeMenor = null;
		
		Scanner lerNome = new Scanner(System.in);
		Scanner lerIdade = new Scanner(System.in);
		
		while(cont <= 10) {
			System.out.println("Nome: ");
			nome = lerNome.nextLine();
			System.out.println("Idade: ");
			idade = lerIdade.nextInt();
		
			if(idade < idadeMenor) {
				idadeMenor = idade;
				nomeMenor = nome;
			}
			
			cont++;
		}
		
		System.out.println("Pessoa mais nova: " + nomeMenor + " com "+idadeMenor+" anos.");
		lerNome.close();
		lerIdade.close();
	
	}

}