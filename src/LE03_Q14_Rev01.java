/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 14 - Utilizando a estrutura de controle para repetição for, leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
*/

import java.util.Scanner;

public class LE03_Q14_Rev01 {
	
	public static void main(String[] args) {
		
		int cont=0;
		int numEntre0e100=0;
		int numEntre101e200=0;
		int numMaiores200=0;
		int num=0;
		
		Scanner lerNum = new Scanner(System.in);
		
		for(cont = 1; cont <= 20; cont++) {
			System.out.println(cont+"o. Numero: ");
			num = lerNum.nextInt();
			
			if((num >= 0) && (num <= 100)) {
				numEntre0e100++;
			}else if ((num >= 101) && (num <= 200)) {
				numEntre101e200++;
			}else if ((num > 200)) {
				numMaiores200++;
			}
			
		}
		
		System.out.println("Há " + numEntre0e100 + " números entre 0 e 100.");
		System.out.println("Há " + numEntre101e200 + " números entre 101 e 200.");
		System.out.println("Há " + numMaiores200 + " Maiores que 200.");
		lerNum.close();
		
	}

}