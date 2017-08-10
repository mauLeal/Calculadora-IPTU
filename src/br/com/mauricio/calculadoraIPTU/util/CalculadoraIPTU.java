package br.com.mauricio.calculadoraIPTU.util;

public class CalculadoraIPTU implements TaxaAliquota{
	
	private CalculadoraIPTU(){
	}
	
	public static Imovel calcularIPTU(Imovel imovel) {
		Double total = 0d;

		Double valorImovel = imovel.getValorImovel_d();
		String tipoImovel = imovel.getTipoImovel().toString();
		switch (imovel.getTipoImovel()) {
		case RESIDENCIAL:
			if (valorImovel <= residencial.PRIMEIRA_FAIXA_VALOR) {
				
				total += valorImovel * residencial.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > residencial.PRIMEIRA_FAIXA_VALOR && 
					   valorImovel <= residencial.SEGUNDA_FAIXA_VALOR) {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel-=95450d;
				
				total += valorImovel * residencial.SEGUNDA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > residencial.SEGUNDA_FAIXA_VALOR &&
					   valorImovel <= residencial.TERCEIRA_FAIXA_VALOR) {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 95450d;
				
				total += 143176d * residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=143176d;
				
				total += valorImovel * residencial.TERCEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > residencial.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= residencial.QUARTA_FAIXA_VALOR) {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 95450d;
				
				total += 143176d * residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=143176d;
				
				total += 178970d * residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel-=178970d;
				
				total += valorImovel * residencial.QUARTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > residencial.QUARTA_FAIXA_VALOR &&
					   valorImovel <= residencial.QUINTA_FAIXA_VALOR) {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 95450d;
				
				total += 143176d * residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=143176d;
				
				total += 178970d * residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel-=178970d;
				
				total += 298283d * residencial.QUARTA_ALIQUOTA / 100;
				valorImovel-=298283d;
				
				total += valorImovel * residencial.QUINTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > residencial.QUINTA_FAIXA_VALOR &&
					   valorImovel <= residencial.SEXTA_FAIXA_VALOR) {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 95450d;
				
				total += 143176d * residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=143176d;
				
				total += 178970d * residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel-=178970d;
				
				total += 298283d * residencial.QUARTA_ALIQUOTA / 100;
				valorImovel-=298283d;
				
				total += 238626d * residencial.QUINTA_ALIQUOTA / 100;
				valorImovel -= 238626d;
				
				total += valorImovel * residencial.SEXTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else {
				
				total += 95450d * residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 95450d;
				
				total += 143176d * residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=143176d;
				
				total += 178970d * residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel-=178970d;
				
				total += 298283d * residencial.QUARTA_ALIQUOTA / 100;
				valorImovel-=298283d;
				
				total += 238626d * residencial.QUINTA_ALIQUOTA / 100;
				valorImovel -= 238626d;
				
				total += 238626d * residencial.SEXTA_ALIQUOTA / 100;
				valorImovel-= 238626d;
				
				total += valorImovel * residencial.SETIMA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
			}
			break;

		case NAO_RESIDENCIAL:
			
			if (valorImovel <= nao_residencial.PRIMEIRA_FAIXA_VALOR) {
				
				total += valorImovel * nao_residencial.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > nao_residencial.PRIMEIRA_FAIXA_VALOR &&
					   valorImovel <= nao_residencial.SEGUNDA_FAIXA_VALOR) {		
				
				total += 35793d * nao_residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel-=35793d;
				
				total += valorImovel * nao_residencial.SEGUNDA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > nao_residencial.SEGUNDA_FAIXA_VALOR &&
				       valorImovel <= nao_residencial.TERCEIRA_FAIXA_VALOR) {
				
				total += 35793d * nao_residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 35793d;
				
				total += 83520d * nao_residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=83520d;
				
				total += valorImovel * nao_residencial.TERCEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > nao_residencial.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= nao_residencial.QUARTA_FAIXA_VALOR) {
				
				total = 35793d * nao_residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 35793d;
				
				total += 83520d * nao_residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=83520d;
				
				total += 477252d * nao_residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel -= 477252d;
				
				total += valorImovel * nao_residencial.QUARTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else {
				
				total += 35793d * nao_residencial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 35793d;
				
				total += 83520d * nao_residencial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=83520d;
				
				total += 477252d * nao_residencial.TERCEIRA_ALIQUOTA / 100;
				valorImovel -= 477252d;
				
				total += 596566d * nao_residencial.QUARTA_ALIQUOTA / 100;
				valorImovel -= 596566d;
				
				total += valorImovel * nao_residencial.QUINTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			}
			break;
			
		case TERRITORIAL:
			
			if (valorImovel <= territorial.PRIMEIRA_FAIXA_VALOR) {
				
				total += valorImovel * territorial.PRIMEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > territorial.PRIMEIRA_FAIXA_VALOR &&
					   valorImovel <= territorial.SEGUNDA_FAIXA_VALOR) {
				
				total += 47724d * territorial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 47724d;
				
				total += valorImovel * territorial.SEGUNDA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > territorial.SEGUNDA_FAIXA_VALOR &&
					   valorImovel <= territorial.TERCEIRA_FAIXA_VALOR) {
				
				total += 47724d * territorial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 47724d;
				
				total += 310215d * territorial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=310215d;
				
				total += valorImovel * territorial.TERCEIRA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else if (valorImovel > territorial.TERCEIRA_FAIXA_VALOR &&
					   valorImovel <= territorial.QUARTA_FAIXA_VALOR) {
				
				total += 47724d * territorial.PRIMEIRA_ALIQUOTA / 100;
				valorImovel -= 47724d;
				
				total += 310215d * territorial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=310215d;
				
				total += 357940d * territorial.TERCEIRA_ALIQUOTA / 100;
				valorImovel -= 357940d;
				
				total += valorImovel * territorial.QUARTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			} else {
				
				total += (47724d * territorial.PRIMEIRA_ALIQUOTA / 100);
				valorImovel -= 47724d;
				
				total += 310215d * territorial.SEGUNDA_ALIQUOTA / 100;
				valorImovel-=310215d;
				
				total += 357940d * territorial.TERCEIRA_ALIQUOTA / 100;
				valorImovel -= 357940d;
				
				total += 477252d * territorial.QUARTA_ALIQUOTA / 100;
				valorImovel -= 477252d;
				
				total += valorImovel * territorial.QUINTA_ALIQUOTA / 100;
				imovel.setValorAliquotaImovel_d(total);
				
			}
			break;
		}
		imovel.setValorImovelComAliquota_d(imovel.getValorAliquotaImovel_d() + imovel.getValorImovel_d());
		return imovel;
	}
}
