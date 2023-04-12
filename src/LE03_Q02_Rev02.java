/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 02 - Utilizando a estrutura de controle para repetição do...while, Calcule a soma dos números de 1 a 15..
*/

public class LE03_Q02_Rev02 {
	
	public static void main(String[] args) {
		
		int cont = 0;
		int soma = 0;
		
		do {
			soma = soma + cont;
			cont++;
		}while(cont <= 15);
		
		System.out.println("Soma de 1 a 15 é: " + soma);
	}
	
}