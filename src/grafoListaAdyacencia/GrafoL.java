package grafoListaAdyacencia;

public class GrafoL implements IGrafoL {
	
	private int size;
	private int cantNodos;
	private Lista[] verticesAdyacentes;
	private boolean[] nodosUsados;

	public GrafoL(int n) {
		this.size = 0;
		this.cantNodos = n;
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

	public void agregarArista(int origen, int destino, int peso) {
		this.verticesAdyacentes[origen].insertarInicio(destino,peso);
	}

	@Override
	public void eliminarArista(int origen, int destino) {

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

	public Lista verticesAdyacentes(int v) {
		return this.verticesAdyacentes[v];
	}

	@Override
	public boolean existeVertice(int v) {
		return this.nodosUsados[v];
	}
	
	@Override
	public void crearGrafo(int cantMax) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarVertice(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarArista(int origen, int destino) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lista listaAdyacentes(int vertice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean esConexo() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
