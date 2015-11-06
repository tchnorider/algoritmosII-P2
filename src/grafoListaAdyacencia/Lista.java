package grafoListaAdyacencia;

public class Lista implements IListaD {

	NodoLD inicio;
	int peso;

	public NodoLD getInicio() {
		return inicio;
	}

	public void setInicio(NodoLD inicio) {
		this.inicio = inicio;
	}

	public Lista() {
		this.setInicio(null);
	}

	@Override
	public void insertarInicio(int dest, int peso) {
		NodoLD nuevoNodo = new NodoLD();
		nuevoNodo.setSiguiente(this.inicio);
		nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
		nuevoNodo.setAnterior(null);
		nuevoNodo.setDestino(dest);
		nuevoNodo.setPeso(peso);
		this.inicio = nuevoNodo;
	}

	@Override
	public boolean esVacia() {
		return this.inicio == null;
	}

	@Override
	public void imprimir() {
		if (this.esVacia()) {
			System.out.println("Lista vacia");
		} else {
			NodoLD nodoAux = this.inicio;
			while (nodoAux != null) {
				System.out.println(nodoAux.getDato());
				nodoAux = nodoAux.getSiguiente();
			}
		}
	}

	@Override
	public void vaciarLista() {
		if (!this.esVacia()) {
			borrarInicio();
		}
	}

	@Override
	public void borrarInicio() {
		if (!this.esVacia())
			this.inicio = this.inicio.getSiguiente();

	}

	@Override
	public boolean existe(int valor) {
		NodoLD nodoAux = this.inicio;
		while (nodoAux != null) {
			if (nodoAux.getDato() == valor) {
				return true;
			}
			nodoAux = nodoAux.getSiguiente();
		}
		return false;
	}

	@Override
	public NodoLD buscarElemento(int valor) {
		NodoLD nodoAux = this.inicio;
		while (nodoAux != null) {
			if (nodoAux.getDato() == valor) {
				return nodoAux;
			}
			nodoAux = nodoAux.getSiguiente();
		}
		return nodoAux;
	}

	@Override
	public void borrar(int valor) {
		NodoLD nodoAux = buscarElemento(valor);
		if (nodoAux != null) {
			nodoAux.getAnterior().setSiguiente(nodoAux.getSiguiente());
			nodoAux.getSiguiente().setAnterior(nodoAux.getAnterior());
		}
	}
}
