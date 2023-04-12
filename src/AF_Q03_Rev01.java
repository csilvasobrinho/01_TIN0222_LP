import java.util.Scanner;
public class AF_Q03_Rev01 {

	public static void main(String[] args) {
		int cont = 0;
		int ctrlSaida = 1;
		float n1 = 0;
		float n2 = 0;
		float n3 = 0;
		float n4 = 0;
		float m = 0;
		
		Scanner lerNota = new Scanner(System.in);
		Scanner lerSaida = new Scanner(System.in);
		
		while(ctrlSaida == 1) {
			System.out.println("1a Nota: ");
			n1 = lerNota.nextFloat();
			
			System.out.println("2a Nota: ");
			n2 = lerNota.nextFloat();
			
			System.out.println("3a Nota: ");
			n3 = lerNota.nextFloat();
			
			System.out.println("4a Nota: ");
			n4 = lerNota.nextFloat();
			
			m = (n1 + n2 + n3 + n4) / 4;
			
			if(m >= 7) {
				System.out.printf("Média %.2f", m);
				System.out.println("\nAprovado!");
			}else {
				System.out.printf("Média %.2f", m);
				System.out.println("\nReprovado!");
			}
			
			System.out.println("\n Coletar outra nota? [1] Sim [2] Não.");
			ctrlSaida = lerSaida.nextInt();
		}
		System.out.println("\n Obrigado!");

	}

}
