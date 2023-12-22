package ecommerce.model;

public class CamaNormal extends Produto{
	private String camaTamanho;

	public CamaNormal(String marca, int id, float preco, String camaTamanho) {
		super(marca, id, preco);
		this.camaTamanho = camaTamanho;
	}
	
	public String getCamaTamanho() {
		return camaTamanho;
	}

	public void setCamaTamanho(String camaTamanho) {
		this.camaTamanho = camaTamanho;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo da cama:    1 - Cama normal");
		System.out.println("*********************************************");
		System.out.println("Tamanho da cama: " + this.camaTamanho);
		System.out.println("*********************************************");
	}

}
