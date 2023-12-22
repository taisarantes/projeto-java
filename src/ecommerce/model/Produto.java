package ecommerce.model;

public abstract class Produto {
	String marca;
	int id;
	float preco;
	
	public Produto(String marca, int id, float preco) {
		this.marca = marca;
		this.id = id;
		this.preco = preco;
	}

	public String getNome() {
		return marca;
	}

	public void setNome(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\n*********************************************");
		System.out.println("Marca Produto: " + this.marca);
		System.out.println("*********************************************");
		System.out.println("ID Produto:         " + this.id);
		System.out.println("*********************************************");
		System.out.println("Preço Produto:         " + this.preco);
		System.out.println("*********************************************");
	}

}
