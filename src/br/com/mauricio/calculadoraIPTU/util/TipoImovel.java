package br.com.mauricio.calculadoraIPTU.util;

public enum TipoImovel {
	RESIDENCIAL, NAO_RESIDENCIAL, TERRITORIAL;

	public static TipoImovel getTipoImovel(String x) {
		if (x.equals("RESIDENCIAL")) {
			return TipoImovel.RESIDENCIAL;
		} else if (x.equals("NÃO-RESIDENCIAL")){
			return TipoImovel.NAO_RESIDENCIAL;
		} else {
			return TipoImovel.TERRITORIAL;
		}
	}
}
