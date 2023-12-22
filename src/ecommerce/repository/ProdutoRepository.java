package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {
	public void listarTodos();
	public void cadastrar(Produto cama);
	public void deletar(int id);
	public void carrinho();
	public void cadastrarCarrinho(int id);
	public void finalizarCompra();

}
