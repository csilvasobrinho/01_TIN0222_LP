/*
 * LISTA DE EXERCÍCIOS 03
 * QUESTÃO 02 - Utilizando a estrutura de controle para repetição for, Calcule a soma dos números de 1 a 15..
*/

public class LE03_Q02_Rev03 {
	
	public static void main(String[] args) {
		
		int cont;
        int soma=0;
        
        for(cont = 0; cont <= 15; cont++){
        	soma = soma + cont;
        }
        
        System.out.printf("Soma de 1 a 15 é: %d",soma);
	
	}
	
}