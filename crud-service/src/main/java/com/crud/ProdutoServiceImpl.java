package com.crud;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		
		//mocka um produto chocolate
		Produto chocolate = new Produto();
		chocolate.setId("1");
		chocolate.setId("Chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		//mocka um produto trufa
		Produto trufa = new Produto();
		trufa.setId(null);trufa.setNome("trufa");
		produtoRepository.put(trufa.getId(), trufa);
	}
	
	
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
	}

	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
	}

	@Override
	public Collection<Produto> getProdutos() {
		return produtoRepository.values();
	}

}
