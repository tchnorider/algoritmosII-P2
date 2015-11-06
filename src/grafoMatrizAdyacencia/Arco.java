package grafoMatrizAdyacencia;

public class Arco {

	int origen;
	int destino;
	int peso;
	public boolean existe;

	public Arco(int peso) {
		this.peso = peso;
	}

	public Arco() {
		// TODO Auto-generated constructor stub
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
