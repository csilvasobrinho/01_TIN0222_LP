/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 10 - Utilizando a estrutura de controle para repetição for, leia um número do usuário e exiba a sua tabuada de multiplicação.
*/

import java.util.Scanner;

public class LE03_Q10_Rev01 {
	
	public static void main(String[] args) {
		
		int cont;
		int num=0;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.println("Número: ");
		num = lerNum.nextInt();
		
		System.out.println("CONSTRUÍNDO TABUADA DE MULTIPLICAR: "+num);
		
		for(cont = 0; cont <= 9; cont++) {
			System.out.println(cont + " X "+num+" = "+num*cont);
		}
		
	
	}

}