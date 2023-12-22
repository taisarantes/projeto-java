package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.CamaBeliche;
import ecommerce.model.CamaNormal;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		String marca, camaTamanho;
		int id, tipo, camaAndares;
		float preco;
		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();
		
		exibirMenu();
		do {
			System.out.print("\nDigite a opção desejada: ");
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Criar produto\n");
				System.out.println("Digite a marca do produto: ");
				marca = leia.nextLine();
				System.out.println("Digite o preço do produto: ");
				preco = leia.nextInt();
				
				do {
					System.out.println("Digite o tipo do produto: ");
					System.out.print("Sendo: 1 - Cama normal ou 2 - Cama beliche. ");
					tipo = leia.nextInt();
					if(tipo != 1 && tipo != 2) {
						System.out.println("Tipo inválido!");
					}
				} while(tipo < 1 || tipo > 2);
				
				switch(tipo) {
				case 1: 
					System.out.print("Digite o tamanho da cama: ");
					System.out.print("(solteiro, casal, queen, king)");
					camaTamanho = leia.nextLine();
					leia.nextLine();
					
					produtos.cadastrar(new CamaNormal(marca, 
										produtos.gerarNumero(), preco, camaTamanho));
					
					break;
				case 2: 
					System.out.print("Digite a quantidade de andares da cama: ");
					camaAndares = leia.nextInt();
					leia.nextLine();
					
					produtos.cadastrar(new CamaBeliche(marca, 
							produtos.gerarNumero(), preco, camaAndares));
					
					break;
				}
				
				break;
			case 2:
				System.out.println("Listar os produtos\n");
				produtos.listarTodos();
				break;
			case 3:
				System.out.println("Visualizar carrinho\n");
				produtos.carrinho();
				break;
			case 4:
				System.out.println("Adicionar ao carrinho\n");
				System.out.println("Digite o id do produto que você quer adicionar: ");
				id = leia.nextInt();
				produtos.cadastrarCarrinho(id);
				break;
			case 5:
				System.out.println("Remover do carrinho\n");
				System.out.println("Digite o id do produto que você quer remover: ");
				id = leia.nextInt();
				produtos.deletar(id);
				break;
			case 6:
				System.out.println("Finalizar compra\n");
				produtos.finalizarCompra();
				break;
			case 7:
				System.out.println("\nObrigado pela preferência!");
				leia.close();
				System.exit(0);
				break;
			}
			
		} while(opcao != 7 || opcao != 6);

	}
	
	public static void exibirMenu() {
		System.out.println("*********************************************");
		System.out.println("                                             ");
		System.out.println("             ECOMMERCE DE CAMAS              ");
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
	}

}
