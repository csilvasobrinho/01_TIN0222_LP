/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 11 - Utilizando a estrutura de controle para repetição while, Leia 20 números do usuário e exiba quantos números são maiores do que 8.
*/

import java.util.Scanner;

public class LE03_Q11_Rev01 {
	
	public static void main(String[] args) {
		
		int cont = 1; //contador para controle da repetição
		int num = 0; //variavel que irá receber o valor lido do usuário
		int numMaior8 = 0; // variável acumular a quantidades de numeros maiores que 8
		
		Scanner lerNum = new Scanner(System.in); //objeto para capturar o teclado
		
		while(cont <= 20) {
			System.out.print("Número: ");
			num = lerNum.nextInt();//captura do teclado e armazenando em num
			
			if(num > 8) { //checando se é maior que 8
				numMaior8++; //incrementando contador dos maiores que 8
			}
			
			cont++; //incrementando contador da repeticação
		}
		
		System.out.println("Há "+numMaior8+" números maiores que 8.");//printando a quantidade de maiores
		lerNum.close();//fechando o objeto
	
	}

}