package listaCircularDupla;
public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.insere(5);
		lista.insere(5);
		lista.remove(4, true);
		System.out.println(lista.imprime());	
	}
}
