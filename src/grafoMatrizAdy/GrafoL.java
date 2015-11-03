package grafoMatrizAdy;

import otrasEstructuras.Lista;

public class GrafoL {
	private int size;
	private int cantNodos;
	private Lista[] nodosAdyacentes;
	private boolean[] nodosUsados;

	public GrafoL(int n) {
		this.size = 0;
		this.cantNodos = n;
		this.nodosAdyacentes = new Lista[this.cantNodos + 1];

		for (int i = 0; i < this.cantNodos; i++) {
			this.nodosAdyacentes[i] = new Lista();
		}
		this.nodosUsados = new boolean[this.cantNodos + 1];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	public void setCantNodos(int cantNodos) {
		this.cantNodos = cantNodos;
	}

}
