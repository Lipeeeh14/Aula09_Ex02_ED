package controller;

import br.edu.fateczl.lipe.ListaEncadeada.ListaEncadeada;
import br.edu.fateczl.lipe.ListaEncadeada.No;

public class BuscaElementoController {
	private ListaEncadeada lista;
	
	public BuscaElementoController(ListaEncadeada lista) {
		this.lista = lista;
	}
	
	public No IterativoBuscaElemento(String elemento) throws Exception {
		try {
			No atual = lista.pegaNo(0);
			
			while (atual != null) {
				if (atual.getElemento() == elemento)
					return atual;
				
				atual = atual.getProximo();
			}
			
			return null;
		} catch (Exception e) {	
			throw new Exception(e.getMessage());
		}
	}
	
	public No RecursivaBuscaElemento(String elemento, No atual) throws Exception {
		try {
			if (atual == null)
				return null;
			if (atual.getElemento() == elemento)
				return atual;
			else
				return RecursivaBuscaElemento(elemento, atual.getProximo());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
}
