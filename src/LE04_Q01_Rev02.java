/*
 * LISTA DE EXERCÍCIOS 04
 * QUESTÃO 01 - Obtenha do usuário três notas de exame e calcule a média dessas notas. Reproduza a média dos três exames. Junto com a média mostre um :) no resultado se a média for maior ou igual a 60; caso contrário mostre :-(
	- Faça duas versões deste programa:
	a)	Use a classe Scanner para obter as notas do usuário, e System.out para mostrar o resultado.
	b)	Use JOptionPane para obter as notas do usuário e para mostrar o resultado.
*/
import javax.swing.JOptionPane;

public class LE04_Q01_Rev02 {
	
	public static void main (String args[]){
		
		String nota, cara;
		
		float n1, n2, n3, m = 0;
		
		nota = JOptionPane.showInputDialog("1a. Nota: ");
        n1 = Float.parseFloat(nota);
        
        nota = JOptionPane.showInputDialog("2a. Nota: ", JOptionPane.INFORMATION_MESSAGE);
        n2 = Float.parseFloat(nota);
        
        nota = JOptionPane.showInputDialog("3a. Nota: ");
        n3 = Float.parseFloat(nota);
				
		m = (n1 + n2 + n3) / 3;
		
		if (m >= 60) {
			cara = " :)";
		}else {
			cara = " :(";
		}
		
		JOptionPane.showMessageDialog(null,"A média do aluno é " + m + cara,
				"Média",JOptionPane.INFORMATION_MESSAGE);
			
	}
}