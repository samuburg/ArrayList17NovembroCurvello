package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
	
	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public String BuscaEmail(String email) {
			StringBuilder emails = new StringBuilder();
			for (int x=0;x<lista.size();x++) {
				if (lista.get(x).getEmail().contains(email)) {
					emails.append(lista.get(x));
				}
			}
			
			return emails.toString();
		}
	
	public List<Pessoa> getLista() {
		return lista;
	}


	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	// somente adicionar se o nome não se repetir
	public boolean add(Pessoa pessoa) {
		int count =0;
		for(int x=0;x<lista.size();x++) {
			if (lista.get(x).getNome().equals(pessoa.getNome())) {
				count=1;
			}
		}
		if (count<1) {
			lista.add(pessoa);
		}
		
		return true;
	}
	
	public boolean remove(String nome) {
		for(int x=0;x<lista.size();x++) {
			if (lista.get(x).getNome().equals(nome)) {
				lista.remove(x);
			}
		}
		return true;
	}
	
	public boolean alterar(String nome, Pessoa pessoa) {
		
		for(int x=0;x<lista.size();x++) {
			if (lista.get(x).getNome().equals(nome)) {
				lista.remove(x);
				lista.add(pessoa);
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
}


// não repetir nome ou com menos de 3 letras, Buscar todos os dominios de email, remover pelo nome, alterar pessoa, fazer uma busca usando 'like' inicial do nome
// criar funçoes separadas, buscar idade>? , aniversariante do mes (1 - janeiro, 2 - fevereiro, 3...)