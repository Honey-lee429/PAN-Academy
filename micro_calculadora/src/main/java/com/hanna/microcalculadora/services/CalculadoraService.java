package com.hanna.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hanna.microcalculadora.model.Calculadora;
import com.hanna.microcalculadora.model.Tabela;


@Service
public class CalculadoraService {
	@Value("http://localhost:8004")
	//@Value("${micro_tabela.host}")
	private String microTabela;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public Calculadora getCalculo(long tabelaId, int dias) {
		//crio um hash e nele passo um parametro la para o conroller como string
		Map<String, String> urlParametros = new HashMap<>();
		//a variavel id, vira do parametro
		urlParametros.put("id",""+tabelaId);
		System.out.println(urlParametros.put("id",""+tabelaId));
		System.out.println(tabelaId);
		
		//pegua os dados relativos a outra aplicação
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}", Tabela.class, urlParametros);
		return new Calculadora(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}
	
	
}
