package listaDupla;

public class Lista {
	
	private No ref;
	
	public Lista() {
		this.ref=null;
	}
	
	public void insere(int info) {
		if(vazia()) {
			No no = new No(info, ref, null);
			ref=no;
			
		} else {
			for(No item = ref; item!=null; item=item.getProx()) {
				if (item==ref) {
					No no = new No(info, ref, null);
					item.setAnt(no);
					ref=no;
				}
			}
		}
		
	}
	
	public boolean vazia() {
		return ref==null;
	}
	
	public void imprime() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		for(No item = ref; item!=null; item=item.getProx()) {
			System.out.print(item.getInfo()+" ");
		}
		System.out.println();
		
	}
	
	public void imprime2() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		for(No item = ref; item!=null; item=item.getProx()) {
			if (item.getProx()==null) {
				for(No item2 = item; item2!=null; item2=item2.getAnt()) {
					System.out.print(item2.getInfo()+" ");
				}
				System.out.println();
			}
		}
		
	}
	
	public void remove(int item) {
		
		if(vazia()) {
			return;
		}
		
		if (item==ref.getInfo()) {
			ref.setAnt(null);
			ref=ref.getProx();
			return;
		}
		
		for(No aux = ref; aux.getProx()!=null; aux=aux.getProx()) {
			if (aux.getProx().getInfo() == item) {
				
				if (aux.getProx().getProx()==null) {
					aux.setProx(null);
					return;
					
				}else {
					aux.getProx().getProx().setAnt(aux);
					aux.setProx(aux.getProx().getProx());
					return;
				}
			}
		}
		System.out.println("Não há esse item na estrutura");
	}
	
	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}
}
