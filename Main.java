package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaPessoas l = new ListaPessoas();
		Pessoa p = new Pessoa("Rodgrigo", "lindinho@gmail.com","2015-03-31");
		
		l.add(p);
		
		p = new Pessoa("Tereza", "tereza@gmail.com", "2015-03-31");
		l.add(p);
		
		p = new Pessoa("outavia", "ousilva@gmail.com", "2015-03-31");
		l.add(p);
		
		p = new Pessoa("Tereza", "tereza@hotmail.com", "2015-03-31");
		l.add(p);
		
		l.remove("outavia");
		
		p = new Pessoa("Outratereza", "tereza@hotmail.com", "2015-03-31");
		l.alterar("Tereza", p);
		
		List<Pessoa> lista = l.getLista();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
		l.BuscaEmail("@gmail");
		

	}

}