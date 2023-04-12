import java.util.Scanner;
public class AP02_Q03_Rev01 {

	public static void main(String[] args) {
		int cont;
		int idade=0;
		int contIdoso=0;
		
		Scanner lerIdade = new Scanner(System.in);
		
		for(cont = 1; cont <= 4; cont++) {
			System.out.println("Idade da "+cont+"a. pessoa.");
			idade = lerIdade.nextInt();
			
			if(idade >= 60) {
				contIdoso++;
			}
		}
		System.out.println("Temos: "+contIdoso+" idoso(s).");
		lerIdade.close();

	}

}
