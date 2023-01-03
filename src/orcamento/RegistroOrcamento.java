package orcamento;

import java.util.Map;

import exceptions.DomainException;
import http.HttpAdapter;

public class RegistroOrcamento {

	private HttpAdapter HttpAdapter;
	
	public RegistroOrcamento(HttpAdapter http) {
		this.HttpAdapter = http;
	}
	
	public void registrar(Orcamento orcamento) {
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado");
		}
		
		String url = "http://api.externa/orcamento";
		
		Map<String, Object> dados = Map.of(
		"Valor", orcamento.getValor(),
		"QuantidadeItens", orcamento.getQuantidadeItens()
		);
		
		HttpAdapter.post(url, dados);
	}
	
	
}
