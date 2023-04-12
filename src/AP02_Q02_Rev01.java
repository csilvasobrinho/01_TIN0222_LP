import java.util.Scanner;
public class AP02_Q02_Rev01 {

	public static void main(String[] args) {
		int cont = 1;
		String nomeEmpresa = null;
		
		Scanner lerNome = new Scanner(System.in);
		System.out.println("Empresa: ");
		nomeEmpresa = lerNome.nextLine();
		
		do {
			System.out.println(cont + "o Print => Empresa: " + nomeEmpresa);
			cont++;
		}while(cont <= 10);

	}

}
