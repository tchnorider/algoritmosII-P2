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
	public void crearGrafo(int cantMax) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarVertice(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean esAdyacente(int origen, int destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Lista listaAdyacentes(int vertice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeVertice(int v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esConexo() {
		// TODO Auto-generated method stub
		return false;
	}

	// TODO resto
}
