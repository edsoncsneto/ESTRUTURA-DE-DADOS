package listaCircularDupla;

public class ListaCircularDupla {
	
	No ref;
	
	public ListaCircularDupla() {
		this.ref = null;
	}
	
	public void inserir(int info) {
		if(vazia()) {
			No novo = new No(info, ref, null);
			novo.setProx(novo);
			novo.setProx(novo);
			ref=novo;
			
		} else {
			No novo = new No(info, ref.getProx(), ref);
			ref.setProx(novo);
			novo.getProx().setAnt(novo);
			ref=novo;
		}
	}
	
	public void imprimir() {
		if (vazia()) {
			System.out.println("lista vazia");
			return;
		}
		System.out.println("direção normal: ");
		for(No item = ref.getProx(); item!=ref; item=item.getProx()) {
			System.out.print(item.getInfo()+" ");
		}
		System.out.println(ref.getInfo());
		
		System.out.println("direção contrária: ");
		if (ref == ref.getProx()) {
			System.out.println(ref.getInfo());
		}
		
		for(No item = ref.getProx(); item!=ref; item=item.getProx()) {
			if (item.getProx() == ref) {
				System.out.print(ref.getInfo() + " ");
				for(No item2 = item; item2!=ref; item2=item2.getAnt()) {
					System.out.print(item2.getInfo()+" ");
				}
				System.out.println();
			}
		}
	}
	
	public void remover(int item) {
		
		if (vazia()) {
			System.out.println("lista já está vazia");
			return;
		}
		
		if(ref==ref.getProx()) {
			ref.setProx(null);
			ref.setAnt(null);
			ref=null;
			return;
		}
		
		No aux = ref;
		do {
			if(aux.getInfo() == item) {
				if (aux == ref) {
					ref = ref.getAnt();
				}
				No auxAnt = aux.getAnt();
				No auxProx = aux.getProx();
				aux.getAnt().setProx(auxProx);
				aux.getProx().setAnt(auxAnt);
				return;
			}
			aux = aux.getProx();
			
		} while(aux!=ref);
	}
	
	public boolean vazia() {
		return ref==null;
	}

}
