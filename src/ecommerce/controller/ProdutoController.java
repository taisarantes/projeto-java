package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	ArrayList<Produto> listaCamas = new ArrayList<>();
	ArrayList<Produto> carrinho = new ArrayList<>();
	int numUltimaCama = 0;

	@Override
	public void listarTodos() {
		if(listaCamas.isEmpty()) {
			System.out.println("No momento não há nenhum produto cadastrado!");
			System.out.println("Digite 1 para cadastrar um produto.");
		} else {
			for(var cama : listaCamas) {
				cama.visualizar();
			}
		}
	}

	@Override
	public void cadastrar(Produto cama) {
		listaCamas.add(cama);
		System.out.println("O produto numero " + cama.getId()
								+ " foi criado com sucesso!");
		
	}

	@Override
	public void deletar(int id) {
		var cama = buscarNaCollection(id);
		
		if(cama != null) {
			if(carrinho.remove(cama)) {
				System.out.println("O produto numero " + id 
										+ " foi removido com sucesso!");
			} 
		} else {
			System.out.println("O produto numero " + id 
					+ " não foi encontrado! Tente outro número.");
		}
		
	}
	
	@Override
	public void carrinho() {
		if(carrinho.isEmpty()) {
			System.out.println("No momento você não tem nenhum produto no carrinho!");
			System.out.println("Digite 4 para adicionar um produto no carrinho.");
		} else {
			for(var cama : carrinho) {
				cama.visualizar();
			}
		}
	}
	
	@Override
	public void cadastrarCarrinho(int id) {
		var cama = buscarNaCollection(id);
		
		if(cama != null) {
			if(carrinho.add(cama)) {
				System.out.println("O produto numero " + cama.getId()
					+ " foi adicionado ao seu carrinho!");
			} 
		} else {
			System.out.println("O produto numero " + id 
					+ " não foi encontrado! Tente outro número.");
		}
	}
	

	@Override
	public void finalizarCompra() {
		float compra = 0;
		for(var cama : carrinho) {
			compra += cama.getPreco();
		}
		System.out.println("Total da compra: R$ " + compra);
		System.out.println("Compra finalizada com sucesso!");
	}
	
	public int gerarNumero() {
		return ++ numUltimaCama;
	}
	
	public Produto buscarNaCollection(int id) {
		for(var cama : listaCamas) {
			if(cama.getId() == id) {
				return cama;
			} 
		}
		
		return null;
	}
}
