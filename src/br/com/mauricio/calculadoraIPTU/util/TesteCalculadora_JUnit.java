package br.com.mauricio.calculadoraIPTU.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora_JUnit {
	Imovel imovel = new Imovel();
	
	@Test
	public void testeResidencial() {
		imovel.setValorImovel_d(314159d);
		imovel.setTipoImovel(TipoImovel.RESIDENCIAL);
		CalculadoraIPTU.calcularIPTU(imovel);
		assertEquals(Math.round(2141.43), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
	
	@Test
	public void testeNaoResidencial(){
		imovel.setValorImovel_d(265359d);
		imovel.setTipoImovel(TipoImovel.NAO_RESIDENCIAL);
		CalculadoraIPTU.calcularIPTU(imovel);
		assertEquals(Math.round(3559.92), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
	
	@Test
	public void testeTerritorial(){
		imovel.setValorImovel_d(112358d);
		imovel.setTipoImovel(TipoImovel.TERRITORIAL);
		CalculadoraIPTU.calcularIPTU(imovel);
		assertEquals(Math.round(1511.38), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
}
