/*
 * LISTA DE EXERCÍCIOS 04
 * QUESTÃO 01 - Obtenha do usuário três notas de exame e calcule a média dessas notas. Reproduza a média dos três exames. Junto com a média mostre um :) no resultado se a média for maior ou igual a 60; caso contrário mostre :-(
	- Faça duas versões deste programa:
	a)	Use a classe Scanner para obter as notas do usuário, e System.out para mostrar o resultado.
	b)	Use JOptionPane para obter as notas do usuário e para mostrar o resultado.
*/
import java.util.Scanner;

public class LE04_Q01_Rev01 {

	public static void main(String[] args) {
		float n1 = 0;
		float n2 = 0;
		float n3 = 0;
		float m = 0;
		
		Scanner lerN = new Scanner(System.in);
		
		System.out.print("1a. Nota: ");
		n1 = lerN.nextFloat();
		
		System.out.print("2a. Nota: ");
		n2 = lerN.nextFloat();
		
		System.out.print("3a. Nota: ");
		n3 = lerN.nextFloat();
		
		m = (n1 + n2 + n3) / 3;
				
		if(m >= 60) {
			System.out.printf("Média do Exames: %.2f \n", m);
			System.out.print(" :)");
		}else {
			System.out.printf("Média do Exames: %.2f \n", m);
			System.out.print(" :(");
		}
		lerN.close();
	}
}
