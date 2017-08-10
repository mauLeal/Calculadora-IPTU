package br.com.mauricio.calculadoraIPTU.util;

public class Imovel {
	private Double valorImovel_d;
	private Double valorAliquotaImovel_d;
	private Double valorImovelComAliquota_d;
	private TipoImovel tipoImovel;
	
	public Imovel(){}
	
	public Imovel(Double valor, TipoImovel tipo){
		this.valorImovel_d = valor;
		this.tipoImovel = tipo;
	}
	
	@Override
	public String toString() {
		return "Tipo Imovel: "+tipoImovel.toString().toUpperCase()+
				"\nValor Imovel Sem Aliquota: "+valorImovel_d+
				"\nValor Aliquota: "+valorAliquotaImovel_d+
				"\nValor Imovel Com Aliquota: "+valorImovelComAliquota_d;
	}
	
	/**
	 * @return the tipoImovel
	 */
	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	/**
	 * @param tipoImovel the tipoImovel to set
	 */
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}


	/**
	 * @return the valorAliquotaImovel_d
	 */
	public Double getValorAliquotaImovel_d() {
		return valorAliquotaImovel_d;
	}

	/**
	 * @param valorAliquotaImovel_d the valorAliquotaImovel_d to set
	 */
	public void setValorAliquotaImovel_d(Double valorAliquotaImovel_d) {
		this.valorAliquotaImovel_d = valorAliquotaImovel_d;
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
}
