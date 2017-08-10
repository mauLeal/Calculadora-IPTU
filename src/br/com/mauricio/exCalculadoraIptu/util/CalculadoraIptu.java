package br.com.mauricio.exCalculadoraIptu.util;


public class CalculadoraIptu extends Imposto{

	public Double calcularIptu(Imovel imovel) {
		Double total = 0d;
		Double somaPrimeiraAliquota = 0d;
		Double somaSegundaAliquota = 0d;
		Double somaTerceiraAliquota = 0d;
		Double somaQuartaAliquota = 0d;
		Double somaQuintaAliquota = 0d;
		Double somaSextaAliquota = 0d;
		Double somaSetimaAliquota = 0d;
		
		Double valorImovel = imovel.getValorImovel_d();
		switch (imovel.getTipoImovel()) {
		case "residencial":
			if (valorImovel <= RESIDENCIAL.PRIMEIRA_FAIXA_VALOR) {
				
				total = valorImovel * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > RESIDENCIAL.PRIMEIRA_FAIXA_VALOR && 
					   valorImovel <= RESIDENCIAL.SEGUNDA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d) * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				total += somaPrimeiraAliquota;
				valorImovel-=95450d;
				
				somaSegundaAliquota = (valorImovel) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > RESIDENCIAL.SEGUNDA_FAIXA_VALOR &&
					   valorImovel <= RESIDENCIAL.TERCEIRA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d) * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				total += somaPrimeiraAliquota;
				valorImovel -= 95450d;
				
				somaSegundaAliquota = (143176d) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=143176d;
				
				somaTerceiraAliquota = (valorImovel) * RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > RESIDENCIAL.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= RESIDENCIAL.QUARTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d) * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				total += somaPrimeiraAliquota;
				valorImovel -= 95450d;
				
				somaSegundaAliquota = (143176d) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=143176d;
				
				somaTerceiraAliquota = (178970d) * RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel-=178970d;
				
				somaQuartaAliquota = (valorImovel) * RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > RESIDENCIAL.QUARTA_FAIXA_VALOR &&
					   valorImovel <= RESIDENCIAL.QUINTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d) * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				total += somaPrimeiraAliquota;
				valorImovel -= 95450d;
				
				somaSegundaAliquota = (143176d) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=143176d;
				
				somaTerceiraAliquota = (178970d) * RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel-=178970d;
				
				somaQuartaAliquota = (298283d) * RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				valorImovel-=298283d;
				
				somaQuintaAliquota = (valorImovel) * RESIDENCIAL.QUINTA_ALIQUOTA / 100;
				total += somaQuintaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > RESIDENCIAL.QUINTA_FAIXA_VALOR &&
					   valorImovel <= RESIDENCIAL.SEXTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d) * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				total += somaPrimeiraAliquota;
				valorImovel -= 95450d;
				
				somaSegundaAliquota = (143176d) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=143176d;
				
				somaTerceiraAliquota = (178970d) * RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel-=178970d;
				
				somaQuartaAliquota = (298283d) * RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				valorImovel-=298283d;
				
				somaQuintaAliquota = (238626d) * RESIDENCIAL.QUINTA_ALIQUOTA / 100;
				total += somaQuintaAliquota;
				valorImovel -= 238626d;
				
				somaSextaAliquota = (valorImovel) * RESIDENCIAL.SEXTA_ALIQUOTA / 100;
				total += somaSextaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel >= RESIDENCIAL.SEXTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (95450d * RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 95450d;
				
				somaSegundaAliquota = (143176d) * RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=143176d;
				
				somaTerceiraAliquota = (178970d) * RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel-=178970d;
				
				somaQuartaAliquota = (298283d) * RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				valorImovel-=298283d;
				
				somaQuintaAliquota = (238626d) * RESIDENCIAL.QUINTA_ALIQUOTA / 100;
				total += somaQuintaAliquota;
				valorImovel -= 238626d;
				
				somaSextaAliquota = (238626d) * RESIDENCIAL.SEXTA_ALIQUOTA / 100;
				total += somaSextaAliquota;
				valorImovel-= 238626d;
				
				somaSetimaAliquota = (valorImovel) * RESIDENCIAL.SETIMA_ALIQUOTA / 100;
				total += somaSetimaAliquota;
				imovel.setValorImovelComAliquota_d(total);
			}
			break;

		case "não residencial":
			
			if (valorImovel <= NAO_RESIDENCIAL.PRIMEIRA_FAIXA_VALOR) {
				
				total = valorImovel * NAO_RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > NAO_RESIDENCIAL.PRIMEIRA_FAIXA_VALOR &&
					   valorImovel <= NAO_RESIDENCIAL.SEGUNDA_FAIXA_VALOR) {		
				
				somaPrimeiraAliquota = (35793d * NAO_RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel-=35793d;
				
				somaSegundaAliquota = (valorImovel) * NAO_RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > NAO_RESIDENCIAL.SEGUNDA_FAIXA_VALOR &&
				       valorImovel <= NAO_RESIDENCIAL.TERCEIRA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (35793d * NAO_RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 35793d;
				
				somaSegundaAliquota = (83520d) * NAO_RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=83520d;
				
				somaTerceiraAliquota = (valorImovel) * NAO_RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > NAO_RESIDENCIAL.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= NAO_RESIDENCIAL.QUARTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (35793d * NAO_RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 35793d;
				
				somaSegundaAliquota = (83520d) * NAO_RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=83520d;
				
				somaTerceiraAliquota = (477252d) * NAO_RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel -= 477252d;
				
				somaQuartaAliquota = (valorImovel) * NAO_RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > NAO_RESIDENCIAL.QUARTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (35793d * NAO_RESIDENCIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 35793d;
				
				somaSegundaAliquota = (83520d) * NAO_RESIDENCIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=83520d;
				
				somaTerceiraAliquota = (477252d) * NAO_RESIDENCIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel -= 477252d;
				
				somaQuartaAliquota = (596566d) * NAO_RESIDENCIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				valorImovel -= 596566d;
				
				somaQuintaAliquota = (valorImovel) * NAO_RESIDENCIAL.QUINTA_ALIQUOTA / 100;
				total += somaQuintaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			}
			break;
			
		case "territorial":
			
			if (valorImovel <= TERRITORIAL.PRIMEIRA_FAIXA_VALOR) {
				
				total = valorImovel * TERRITORIAL.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > TERRITORIAL.PRIMEIRA_FAIXA_VALOR &&
					   valorImovel <= TERRITORIAL.SEGUNDA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (47724d * TERRITORIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel-=47724d;
				
				somaSegundaAliquota = (valorImovel) * TERRITORIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > TERRITORIAL.SEGUNDA_FAIXA_VALOR &&
					   valorImovel <= TERRITORIAL.TERCEIRA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (47724d * TERRITORIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 47724d;
				
				somaSegundaAliquota = (310215d) * TERRITORIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=310215d;
				
				somaTerceiraAliquota = (valorImovel) * TERRITORIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > TERRITORIAL.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= TERRITORIAL.QUARTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (47724d * TERRITORIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 47724d;
				
				somaSegundaAliquota = (310215d) * TERRITORIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=310215d;
				
				somaTerceiraAliquota = (357940d) * TERRITORIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel -= 357940d;
				
				somaQuartaAliquota = (valorImovel) * TERRITORIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			} else if (valorImovel > TERRITORIAL.QUARTA_FAIXA_VALOR) {
				
				somaPrimeiraAliquota = (47724d * TERRITORIAL.PRIMEIRA_ALIQUOTA / 100);
				total += somaPrimeiraAliquota;
				valorImovel -= 47724d;
				
				somaSegundaAliquota = (310215d) * TERRITORIAL.SEGUNDA_ALIQUOTA / 100;
				total += somaSegundaAliquota;
				valorImovel-=310215d;
				
				somaTerceiraAliquota = (357940d) * TERRITORIAL.TERCEIRA_ALIQUOTA / 100;
				total += somaTerceiraAliquota;
				valorImovel -= 357940d;
				
				somaQuartaAliquota = (477252d) * TERRITORIAL.QUARTA_ALIQUOTA / 100;
				total += somaQuartaAliquota;
				valorImovel -= 477252d;
				
				somaQuintaAliquota = (valorImovel) * TERRITORIAL.QUINTA_ALIQUOTA / 100;
				total += somaQuintaAliquota;
				imovel.setValorImovelComAliquota_d(total);
				
			}
			break;
		}
		return imovel.getValorImovelComAliquota_d();
	}

}
