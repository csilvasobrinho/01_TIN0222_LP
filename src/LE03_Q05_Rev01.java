/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 05 - Utilizando a estrutura de controle para repetição while, leia 10 números do usuário e calcule a soma desses números.
*/
import java.util.Scanner;
public class LE03_Q05_Rev01 {
	public static void main(String[] args) {
		int i = 1;
		int num = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		while(i <= 10) {
			System.out.println("Numero: ");
			num = sc.nextInt();
			soma = soma + num;
			i++;
		}
		System.out.println("Soma dos 10 é: " + soma);
		sc.close();
	}
}



