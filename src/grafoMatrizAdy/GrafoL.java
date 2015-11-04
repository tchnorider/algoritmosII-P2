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

	public void agregarArista(int origen, int destino, int peso) {
		this.nodosAdyacentes[origen].insertar(destino, peso);
	}

	public void eliminarArista(int origen, int destino) {
		this.nodosAdyacentes[origen].eliminar(destino);
	}

	public boolean esVacio() {
		return this.size == 0;
	}

	public boolean sonAdyacentes(int a, int b) {
		return this.nodosAdyacentes[a].pertenece(b);
	}

	public void eliminarVertice(int v) {
		this.nodosUsados[v] = false;
		this.size--;

		this.nodosAdyacentes[v] = new Lista();
		for (int i = 0; i < this.cantNodos; i++) {
			this.nodosAdyacentes[i].eliminar(v);
		}
	}

	public Lista verticesAdyacentes(int v){
		return this.nodosAdyacentes[v];
	}
	
	public boolean estaVertice(int v){
		return this.nodosUsados[v];
	}
}
