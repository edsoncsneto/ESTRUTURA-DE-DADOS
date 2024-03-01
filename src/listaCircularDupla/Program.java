package listaCircularDupla;

public class Program {

	public static void main(String[] args) {
		ListaCircularDupla lista = new ListaCircularDupla();
		
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.imprimir(); //1 2 3 4 5
		lista.imprimir2(); //5 4 3 2 1
		lista.remover(3);
		lista.imprimir(); //1 2 4 5
		lista.remover(1);
		lista.imprimir(); // 2 4 5
		lista.remover(5);
		lista.imprimir(); // 2 4
		lista.remover(2);
		lista.imprimir(); //4
		lista.remover(4);
		lista.imprimir(); //lista vazia
		lista.inserir(10);
		lista.inserir(11);
		lista.imprimir(); // 10 11
	}

}
