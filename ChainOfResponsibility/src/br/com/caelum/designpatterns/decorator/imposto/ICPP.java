package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}