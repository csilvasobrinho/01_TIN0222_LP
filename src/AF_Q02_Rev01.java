import java.util.Scanner;
public class AF_Q02_Rev01 {

	public static void main(String[] args) {
		int cont;
		int idade = 0;
		int contCrianca = 0;
		int contAdolescente = 0;
		int contAdulto = 0;
		int contIdoso = 0;
		
		Scanner lerNum = new Scanner(System.in);
		
		for(cont =1; cont <= 10000; cont++) {
			System.out.println("Informe a idade: ");
			idade = lerNum.nextInt();
			
			if(idade <= 12) {
				contCrianca++;
			}else if((idade >= 13) && (idade <= 18)) {
				contAdolescente++;
			}else if((idade > 18) && (idade <= 60)) {
				contAdulto++;
			}else {
				contIdoso++;
			}
		}
		
		System.out.println("\n \nTotal de Crianças: " + contCrianca);
		System.out.println("Total de Adolescentes: " + contAdolescente);
		System.out.println("Total de Adultos: " + contAdulto);
		System.out.println("Total de Idosos: " + contIdoso);

	}

}
