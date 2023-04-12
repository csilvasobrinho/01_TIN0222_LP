/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 03 - Utilizando a estrutura de controle para repetição do...while, Leia o nome de uma empresa e escreva tal nome na tela 15 vezes.
*/

import java.util.Scanner;
public class LE03_Q03_Rev02 {
	public static void main(String[] args) {
		int cont = 1;
		Scanner nomeEmpresa = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = nomeEmpresa.nextLine();
        do{
            System.out.println(cont + " Empresa: " + nome);
            cont++;
        }while(cont <= 15);
        nomeEmpresa.close();
	}
}