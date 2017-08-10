package br.com.mauricio.calculadoraIPTU.util;

public interface TaxaAliquota {
	static final Residencial residencial = new Residencial();
	static final NaoResidencial nao_residencial = new NaoResidencial();
	static final Territorial territorial = new Territorial();
}
