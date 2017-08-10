package br.com.mauricio.exCalculadoraIptu.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mauricio.exCalculadoraIptu.util.CalculadoraIptu;
import br.com.mauricio.exCalculadoraIptu.util.Imovel;

public class TesteCalculadora_JUnit {
	Imovel imovel = new Imovel();
	CalculadoraIptu ciptu = new CalculadoraIptu();
	
	@Test
	public void testeResidencial() {
		imovel.setValorImovel_d(314159d);
		imovel.setTipoImovel(Imovel.RESIDENCIAL);
		ciptu.calcularIptu(imovel);
		assertEquals(Math.round(2141.43), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
	
	@Test
	public void testeNaoResidencial(){
		imovel.setValorImovel_d(265359d);
		imovel.setTipoImovel(Imovel.NAO_RESIDENCIAL);
		ciptu.calcularIptu(imovel);
		assertEquals(Math.round(3559.92), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
	
	@Test
	public void testeTerritorial(){
		imovel.setValorImovel_d(112358d);
		imovel.setTipoImovel(Imovel.TERRITORIAL);
		ciptu.calcularIptu(imovel);
		assertEquals(Math.round(1511.38), Math.round(imovel.getValorImovelComAliquota_d()), 0);
	}
}
