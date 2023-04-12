/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 12 - Utilizando a estrutura de controle para repetição for, leia 20 números do usuário e exiba quantos números são pares.
*/

import java.util.Scanner;

public class LE03_Q12_Rev01 {
	
	public static void main(String[] args) {
		
		int cont=0;
		int numPar=0;
		float num=0;
		
		Scanner lerNum = new Scanner(System.in);
		
		for(cont = 1; cont <= 20; cont++) {
			System.out.print("Numero: ");
			num = lerNum.nextFloat();
			if((num % 2)== 0) {
				numPar++;
			}
		}
		
		System.out.println("Há "+numPar+" números pares.");
		lerNum.close();
	
	}

}