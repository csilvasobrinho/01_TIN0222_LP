/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 04 - Utilizando a estrutura de controle para repetição for, leia o nome e número do usuário um número N e escreva o nome dele na tela N vezes.
*/

import java.util.Scanner;

public class LE03_Q04_Rev01 {
	
    public static void main(String[] args) {
    	
        int cont, num;
        
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner numVezes = new Scanner(System.in);
        
        System.out.println("Nome do Usuário: ");
        String nome = nomeUsuario.nextLine();
        
        System.out.println("Informe o Número de Vezes: ");
        num = numVezes.nextInt();
        
        for(cont = 1; cont <= num; cont++){
            System.out.println("Usuário: " + nome);
        }
        
        nomeUsuario.close();
        numVezes.close();
    
    }

}