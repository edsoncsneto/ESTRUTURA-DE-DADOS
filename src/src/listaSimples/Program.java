package listaSimples;

public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserir(0);
		lista.inserir(1);
		lista.inserir(2);
		lista.imprimir();
		lista.remover(0);
		lista.imprimir();
		lista.remover(1);
		lista.imprimir();
		lista.remover(2);
		lista.imprimir();
		lista.inserir(10);
		lista.inserir(11);
		lista.imprimir();
		lista.remover(11);
		lista.imprimir();
	}

}
