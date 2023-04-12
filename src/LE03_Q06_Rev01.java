/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 06 - Utilizando a estrutura de controle para repetição while, leia a idade de 20 pessoas e exiba a soma das idades..
*/

import java.util.Scanner;

public class LE03_Q06_Rev01 {
	
	public static void main(String[] args) {
		
		int cont=1;
		int idade=0;
		int somaIdade=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(cont <= 10) {
			System.out.println("Idade: ");
			idade = sc.nextInt();
			somaIdade = somaIdade + idade;
			cont++;
		}
		
		System.out.println("Soma de todas as Idades: " + somaIdade);
		sc.close();
	
	}
	
}