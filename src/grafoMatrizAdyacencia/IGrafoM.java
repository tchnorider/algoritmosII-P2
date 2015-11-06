package grafoMatrizAdyacencia;

import listaDoble.Lista;

public interface IGrafoM {

	public void crearGrafo(int cantMax);

	public void agregarVertice(int numero);

	public void agregarArista(int origen, int destino, int peso);

	public void eliminarVertice(int numero);

	public void eliminarArista(int origen, int destino);

	public boolean sonAdyacentes(int origen, int destino);

	public Lista listaAdyacentes(int vertice);

	public boolean existeVertice(int v);

	public boolean esConexo();
	
	public boolean esVacio();
}
