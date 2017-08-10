package br.com.mauricio.calculadoraIPTU.util;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Selecione o tipo de imovel (Residencial, Não-Residencial ou Territorial");
		String tipoImovelEntrada = s.nextLine().toUpperCase();
		while (!tipoImovelEntrada.equals(TipoImovel.RESIDENCIAL.toString()) && !tipoImovelEntrada.equals(TipoImovel.NAO_RESIDENCIAL.toString())
				&& !tipoImovelEntrada.equals(TipoImovel.TERRITORIAL.toString())) {
			System.out.println("Selecione um tipo de imovel valido (Residencial, Não-Residencial ou Territorial)");
			tipoImovelEntrada = s.nextLine().toUpperCase();
		}
		TipoImovel tipoImovelENUM = TipoImovel.getTipoImovel(tipoImovelEntrada);
		System.out.println("Selecione o valor do imovel");
		Double valorImovelEntrada = s.nextDouble();
		Imovel i = new Imovel(valorImovelEntrada, tipoImovelENUM);
		System.out.println(CalculadoraIPTU.calcularIPTU(i));

	}
}



