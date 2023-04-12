/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 01 - Utilizando a estrutura de controle para repetição do...while, exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos!”.
*/

public class LE03_Q01_Rev02 {
	
	public static void main(String[] args) {
		
		int cont = 1;
		
		System.out.println("Abordagem com do...while");
		
		do {
			System.out.println("Eu gosto de estudar algoritimos.");
			cont++;
		}while(cont <= 20);
		
	}
	
}


