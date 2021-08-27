package comissoes;

import java.util.Scanner;

public class Comissoes {

	public static void main(String[] args) {
 
		Scanner leitor = new Scanner (System.in);
		
		String nome;
		double tempo, valorvenda, comissao;
		
		
		System.out.print("Qual o seu nome? ");
		nome = leitor.next();
		
		System.out.print( nome + " há quanto tempo você trabalha conosco? ");
		tempo = leitor.nextDouble();
		
		System.out.print( nome + " qual o valor da sua venda? ");
		valorvenda = leitor.nextDouble();
		
		leitor.close();
		
		// Calucular a comissão do vendedor
		if (valorvenda >= 20000 && tempo >= 1) {
			comissao = valorvenda * 10 / 100;
		} else if (valorvenda >= 10000 && tempo >=2) {
			comissao = valorvenda * 5 / 100;
		} else {
			comissao = valorvenda * 3 / 100;
		}
		
		System.out.println("Vendedor(a): " + nome + "Comissão" + comissao);
		
		
		
		
	}
		
		
	}


