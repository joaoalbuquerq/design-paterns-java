package orcamento;

import java.math.BigDecimal;

import orcamento.situacao.Analise;
import orcamento.situacao.Finalizado;
import orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens; 
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new Analise();
	}

	public BigDecimal getValor() {
		return valor;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar(){
		this.situacao.aprovar(this);
	}
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	
}
