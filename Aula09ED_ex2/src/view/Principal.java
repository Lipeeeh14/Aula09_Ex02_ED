package view;

import br.edu.fateczl.lipe.ListaEncadeada.ListaEncadeada;
import br.edu.fateczl.lipe.ListaEncadeada.No;
import controller.BuscaElementoController;

public class Principal {

	public static void main(String[] args) {
		No e4 = new No("4", null);
		No e3 = new No("3", e4);
		No e2 = new No("2", e3);
		No e1 = new No("1", e2);
		
		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionaElemento(e1);
		lista.adicionaElemento(e2);
		lista.adicionaElemento(e3);
		lista.adicionaElemento(e4);
		
		BuscaElementoController busca = new BuscaElementoController(lista);
		
		try {
			exibeResultado(busca.IterativoBuscaElemento("2"));
			exibeResultado(busca.RecursivaBuscaElemento("7", lista.pegaNo(0)));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private static void exibeResultado(No resultado) {
		if (resultado == null)
			System.out.println("Elemento não encontrado");
		else
			System.out.println(resultado.getElemento());		
	}

}
