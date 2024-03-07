package listaCircularDupla;
public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
//		lista.insere(1);
//		lista.insere(1);
//		lista.insere(2);
//		lista.insere(2);
//		lista.insere(3);
//		lista.insere(3);
//		lista.insere(4);
//		lista.insere(4);
//		lista.insere(5);
//		lista.insere(5);
//		System.out.println(lista.imprime()); //1122334455
//		lista.remove(5, true);
//		System.out.println(lista.imprime()); //11223344
//		lista.remove(4, false);
//		System.out.println(lista.imprime()); //1122334
//		lista.remove(3, true);
//		System.out.println(lista.imprime()); //11224
//		lista.remove(2, false);
//		System.out.println(lista.imprime()); //1124
//		lista.remove(1, true);
//		System.out.println(lista.imprime()); //24
//		lista.remove(2, false);
//		lista.remove(4, true);
//		System.out.println(lista.imprime()); //Lista vazia
//		lista.insere(10);
//		lista.insere(11);
//		System.out.println(lista.imprime()); //10 11
		
		lista.insere(1);
		lista.insere(1);
		lista.insere(2);
		lista.insere(1);
		System.out.println(lista.imprime());
		lista.remove(1, true);
		System.out.println(lista.imprime());
		
	}
}
