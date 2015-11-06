package grafoListaAdyacencia;

public class NodoLD {

	private int dato;
	private int destino;
	private int peso;
	private NodoLD siguiente;
	private NodoLD anterior;

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
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

	public NodoLD getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLD siguiente) {
		this.siguiente = siguiente;
	}

	public NodoLD getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoLD anterior) {
		this.anterior = anterior;
	}

	public NodoLD() {
		
	}
}
