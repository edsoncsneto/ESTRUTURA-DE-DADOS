package listaCircular;

public class Lista {
	
	No ref;
	
	public Lista() {
		this.ref = null;
	}
	
	public void insere(int info) {
		if(vazia()) {
			No no = new No(info, ref);
			no.setProx(no);
			ref=no;
			
		} else {
			No aux = ref.getProx();
			No no = new No(info, null);
			ref.setProx(no);
			no.setProx(aux);
			
		}
	}
	
	public void imprime() {
		if (vazia()) {
			System.out.println("Lista vazia!");
			return;
		}
		
		for(No item = ref.getProx(); item!=ref; item=item.getProx()) {
			System.out.print(item.getInfo()+" ");
		}
		System.out.println(ref.getInfo());
	}
	
	public void remove(int info) {
		
		if (vazia()) {
			return;
		}
		
		for(No item = ref.getProx(); item!=ref; item=item.getProx()) {
			
			if(item.getProx().getInfo()==info) {
				item.setProx(item.getProx().getProx());
				return;
			}
		}
	}
	
	public boolean vazia() {
		return ref==null;
	}

}
