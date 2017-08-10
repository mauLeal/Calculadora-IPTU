package br.com.mauricio.exCalculadoraIptu.util;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Selecione o tipo de imovel (Residencial, Não-Residencial ou Territorial");
		String tipoImovel = s.nextLine().toLowerCase();
		while (!tipoImovel.equals(Imovel.RESIDENCIAL) && !tipoImovel.equals(Imovel.NAO_RESIDENCIAL)
				&& !tipoImovel.equals(Imovel.TERRITORIAL)) {
			System.out.println("Selecione um tipo de imovel valido (Residencial, Não-Residencial ou Territorial)");
			tipoImovel = s.nextLine().toLowerCase();
		}
		System.out.println("Selecione o valor do imovel");
		Double valorImovel = s.nextDouble();
		Imovel i = new Imovel(valorImovel, tipoImovel);
		System.out.println(new CalculadoraIptu().calcularIptu(i));

	}
}
