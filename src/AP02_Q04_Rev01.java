import java.util.Scanner;

public class AP02_Q04_Rev01 {

	public static void main(String[] args) {
		int cont;
		int idade=0;
		int contCrianca = 0;
		int contAdolescente = 0;
		int contAdulto = 0;
		
		Scanner lerIdade = new Scanner(System.in);
		
		for(cont = 1; cont <= 1000; cont++) {
			System.out.println("Idade da "+cont+"a. pessoa.");
			idade = lerIdade.nextInt();
			if(idade <= 12) {
				contCrianca++;
			}else if ((idade >= 13) && (idade <= 18)) {
				contAdolescente++;
			}else if ((idade > 18)) {
				contAdulto++;
			}
		}
		System.out.println("Temos: "+contCrianca+" crianças (até 12 anos de idade).");
		System.out.println("Temos: "+contAdolescente+" adolecentes (entre 13 e 18 anos de idade).");
		System.out.println("Temos: "+contAdulto+" adultos (maiores que 18 anos de idade).");

	}

}
