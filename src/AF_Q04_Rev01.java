import java.util.Scanner;
public class AF_Q04_Rev01 {

	public static void main(String[] args) {
		int ctrlSaida=1;
		int num = 0;
		
		Scanner lerNum = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número entre 15 e 20: ");
			num = lerNum.nextInt();
			
			if(num == 15) {
				System.out.println(" quinze.");
			}else if(num == 16) {
				System.out.println(" dezeseis.");
			}else if(num == 17) {
				System.out.println(" dezesete.");
			}else if(num == 18) {
				System.out.println(" dezoito.");
			}else if(num == 19) {
				System.out.println(" dezenove.");
			}else if(num == 20) {
				System.out.println(" vinte.");
			}else {
				System.out.println(" Número inválido!");
			}
			System.out.println("Deseja informar um novo número: [1] Sim [2] Não.");
			ctrlSaida = lerNum.nextInt();
		}while(ctrlSaida == 1);
		System.out.println("\n   Obrigado!");
	}

}
