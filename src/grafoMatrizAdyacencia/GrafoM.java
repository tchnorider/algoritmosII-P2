package grafoMatrizAdyacencia;

import listaDoble.Lista;

public class GrafoM implements IGrafoM {

	private int size;
	private int cantNodos;
	private Arco[][] matrizNodosAdyacentes;
	private boolean[] nodosUsados;

	public GrafoM(int cant) {
		this.size = 0;
		this.cantNodos = cant;
		this.matrizNodosAdyacentes = new Arco[cant + 1][cant + 1];
		for (int i = 1; i <= cant; i++) {
			for (int j = 1; j <= cant; j++) {
				this.matrizNodosAdyacentes[i][j] = new Arco();
			}
		}
		this.nodosUsados = new boolean[cant + 1];
	}

	@Override
	public void agregarArista(int origen, int destino, int peso) {
		Arco nuevoArco = new Arco(peso);
		this.matrizNodosAdyacentes[origen][destino] = nuevoArco;
	}

	@Override
	public void agregarVertice(int v) {
		this.nodosUsados[v] = true;
		this.size++;
	}

	@Override
	public void eliminarArista(int origen, int destino) {
		Arco nuevoArco = new Arco();
		this.matrizNodosAdyacentes[origen][destino] = nuevoArco;
	}

	@Override
	public void eliminarVertice(int v) {
		this.nodosUsados[v] = false;
		this.size--;

		for (int i = 1; i <= cantNodos; i++) {

			this.matrizNodosAdyacentes[i][v] = new Arco();
			this.matrizNodosAdyacentes[v][i] = new Arco();
		}
	}

	@Override
	public Lista listaAdyacentes(int vertice) {
		Lista adyacentes = new Lista();
		for (int i = 1; i <= this.cantNodos; i++) {
			if (this.sonAdyacentes(vertice, i)) {
				adyacentes.insertarInicio(vertice);
			}
		}
		return adyacentes;
	}

	@Override
	public boolean existeVertice(int v) {
		return this.nodosUsados[v];
	}

	@Override
	public boolean esVacio() {
		return this.size == 0;
	}

	@Override
	public boolean sonAdyacentes(int origen, int destino) {
		return this.matrizNodosAdyacentes[origen][destino].existe;
	}

	@Override
	public boolean esConexo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void crearGrafo(int cantMax) {
		// TODO Auto-generated method stub

	}
}
