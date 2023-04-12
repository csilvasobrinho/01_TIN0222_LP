import java.util.Scanner;

public class LE04_Q03_Rev01 {

	public static void main(String[] args) {
		int codProd = 0;
		float quantProd = 0;
		float vlProd = 0;
		int controle = 1;
		
		Scanner numProd = new Scanner(System.in);
		Scanner qtiProd = new Scanner(System.in);
		Scanner valorProd = new Scanner(System.in);
		Scanner ctrlSaida = new Scanner(System.in);
		
		while(controle == 1) {
			System.out.println("Entre com o dódigo [ 1 a 5] do produto");
			codProd = numProd.nextInt();
			System.out.println("Entre com a quantidade do produto");
			quantProd = qtiProd.nextFloat();
			
			switch(codProd) {
			case 1:
				System.out.println("Produto: " + codProd+" - PÇ. Varejo: R$ 2,98.");
				System.out.printf("\n Total: %.2f", quantProd * 2.98);
				break;
			case 2:
				System.out.println("Produto: " + codProd+" - PÇ. Varejo: R$ 4,50.");
				System.out.printf("\n Total: %.2f", quantProd * 4.50);
				break;
			case 3:
				System.out.println("Produto: " + codProd+" - PÇ. Varejo: R$ 9,98.");
				System.out.printf("\n Total: %.2f", quantProd * 9.98);
				break;
			case 4:
				System.out.println("Produto: " + codProd+" - PÇ. Varejo: R$ 4,49.");
				System.out.printf("\n Total: %.2f", quantProd * 4.49);
				break;
			case 5:
				System.out.println("Produto: " + codProd+" - PÇ. Varejo: R$ 6,87.");
				System.out.printf("\n Total: %.2f", quantProd * 6.87);
				break;
			default:
				System.out.println("Número informado não atende ao solicitado.");
			}
			System.out.println("\n \n      Deseja sair: [ 1 ] Continua - [ 2 ] Para.");
			controle = ctrlSaida.nextInt();
		}
		System.out.println(" \n \n Obrigado!!");
		numProd.close();
		qtiProd.close();
		valorProd.close();
		ctrlSaida.close();
	}
}
