package grafoListaAdyacencia;

public class GrafoL implements IGrafoL {

	private int size;
	private int cantNodos;
	private Lista[] verticesAdyacentes;
	private boolean[] nodosUsados;

	@Override
	public void crearGrafoVacio(int maxNodos) {
		this.size = 0;
		this.cantNodos = maxNodos;
		this.verticesAdyacentes = new Lista[this.cantNodos + 1];

		for (int i = 0; i < this.cantNodos; i++) {
			this.verticesAdyacentes[i] = new Lista();
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

	@Override
	public void agregarArista(int origen, int destino, int peso) {
		this.verticesAdyacentes[origen].insertarInicio(destino, peso);
	}

	@Override
	public void agregarVertice(int v) {
		this.nodosUsados[v] = true;
		this.size++;
	}

	@Override
	public void eliminarArista(int origen, int destino) {
		this.verticesAdyacentes[origen].borrar(destino);
	}

	public boolean esVacio() {
		return this.size == 0;
	}

	public boolean sonAdyacentes(int a, int b) {
		return this.verticesAdyacentes[a].existe(b);
	}

	@Override
	public void eliminarVertice(int v) {
		this.nodosUsados[v] = false;
		this.size--;

		this.verticesAdyacentes[v] = new Lista();
		for (int i = 0; i < this.cantNodos; i++) {
			this.verticesAdyacentes[i].borrar(v);
		}
	}
	
	@Override
	public Lista verticesAdyacentes(int v) {
		return this.verticesAdyacentes[v];
	}

	@Override
	public boolean existeVertice(int v) {
		return this.nodosUsados[v];
	}
	
	@Override
	public boolean esConexo() {
		// TODO >> esConexo..?
		return false;
	}
}
