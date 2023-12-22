package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		String nome;
		int id;
		float preco;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("*********************************************");
		System.out.println("                                             ");
		System.out.println("                  ECOMMERCE                  ");
		System.out.println("                                             ");
		System.out.println("*********************************************");
		System.out.println("                                             ");
		System.out.println("     1 - Criar produto                       ");
		System.out.println("     2 - Listar os produtos                  ");
		System.out.println("     3 - Visualizar carrinho                 ");
		System.out.println("     4 - Adicionar ao carrinho               ");
		System.out.println("     5 - Remover do carrinho                 ");
		System.out.println("     6 - Finalizar compra                    ");
		System.out.println("     7 - Sair                                ");
		System.out.println("                                             ");
		System.out.println("*********************************************");
		
		do {
			System.out.print("\nDigite a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			
			switch(opcao) {
			case 1:
				System.out.println("Criar produto\n");
				System.out.println("Digite o nome do produto: ");
				nome = leia.nextLine();
				System.out.println("Digite o preço do produto: ");
				nome = leia.nextLine();
				break;
			case 2:
				System.out.println("Listar os produtos\n");
				break;
			case 3:
				System.out.println("Visualizar carrinho\n");
				break;
			case 4:
				System.out.println("Adicionar ao carrinho\n");
				break;
			case 5:
				System.out.println("Remover do carrinho\n");
				break;
			case 6:
				System.out.println("Finalizar compra\n");
				break;
			case 7:
				System.out.println("\nObrigado pela preferênica!");
				leia.close();
				System.exit(0);
				break;
			}
			
		} while(opcao != 7);

	}

}
