package ecommerce.model;

public class CamaBeliche extends Produto{
	private int camaAndares;

	public CamaBeliche(String marca, int id, float preco, int camaAndares) {
		super(marca, id, preco);
		this.camaAndares = camaAndares;
	}
	
	public int getCamaAndares() {
		return camaAndares;
	}

	public void setCamaAndares(int camaAndares) {
		this.camaAndares = camaAndares;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo da cama:    1 - Cama beliche");
		System.out.println("*********************************************");
		System.out.println("Altura da cama: " + this.camaAndares + " andares");
		System.out.println("*********************************************");
	}

}
