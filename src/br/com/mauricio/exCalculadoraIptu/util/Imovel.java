package br.com.mauricio.exCalculadoraIptu.util;

public class Imovel {
	
	private Double valorImovel_d;
	private Double valorImovelComAliquota_d;
	private String tipoImovel;
	public static final String RESIDENCIAL = "residencial";
	public static final String NAO_RESIDENCIAL = "não residencial";
	public static final String TERRITORIAL = "territorial";
	
	public Imovel(){}
	
	public Imovel(Double valor, String tipo){
		this.valorImovel_d = valor;
		this.tipoImovel = tipo;
	}

	@Override
	public String toString() {
		return "Tipo Imovel: "+tipoImovel.toUpperCase()+
				"\nValor Imovel Sem Aliquota: "+valorImovel_d+
				"\nValor Aliquota: "+valorImovelComAliquota_d;
	}
	
	/**
	 * @return the valorImovel_d
	 */
	public Double getValorImovel_d() {
		return valorImovel_d;
	}
	/**
	 * @param valorImovel_d the valorImovel_d to set
	 */
	public void setValorImovel_d(Double valorImovel_d) {
		this.valorImovel_d = valorImovel_d;
	}
	/**
	 * @return the valorImovelComAliquota_d
	 */
	public Double getValorImovelComAliquota_d() {
		return valorImovelComAliquota_d;
	}
	/**
	 * @param valorImovelComAliquota_d the valorImovelComAliquota_d to set
	 */
	public void setValorImovelComAliquota_d(Double valorImovelComAliquota_d) {
		this.valorImovelComAliquota_d = valorImovelComAliquota_d;
	}
	/**
	 * @return the tipoImovel
	 */
	public String getTipoImovel() {
		return tipoImovel;
	}
	/**
	 * @param tipoImovel the tipoImovel to set
	 */
	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
}
