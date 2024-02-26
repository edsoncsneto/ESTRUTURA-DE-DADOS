package listaDupla;

public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(5);
		lista.insere(6);
		
		lista.imprime2();
		lista.remove(6);
		lista.imprime2();
		lista.remove(1);
		lista.imprime2();
		lista.insere(7);
		lista.insere(8);
		lista.imprime();
		lista.remove(8);
		lista.imprime2();
		lista.remove(2);
		lista.imprime();
		
		lista.remove(7);
		lista.remove(5);
		lista.remove(4);
		lista.remove(3);
		
		lista.imprime2();
		
	}

}
