/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 15 - Utilizando a estrutura de controle para repetição while, leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando informado o número 1 e continue coletando números se informado 2.
*/

import java.util.Scanner;

public class LE03_Q15_Rev01 {
	
	public static void main(String[] args) {
		
		int saida=2;
		int num=0;
		int soma=0;
		
		Scanner lerNum = new Scanner(System.in);
		Scanner lerSaida = new Scanner(System.in);
		
		while(saida == 2) {
			System.out.print("Informe um Número: ");
			num = lerNum.nextInt();
			soma = soma + num;
			
			System.out.print("Deseja Continuar? [ 1 ] Encerra | [ 2 ] Continua.");
			saida = lerSaida.nextInt();
		}
		
		System.out.println("Soma dos Números Informados: "+soma);
		lerNum.close();
		lerSaida.close();
		
	}
	
}