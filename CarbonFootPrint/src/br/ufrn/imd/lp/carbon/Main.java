package br.ufrn.imd.lp.carbon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		Carro versa = new Carro(520, 1.6);
		Carro uno = new Carro(648, 1.4);
		Taxi t1 = new Taxi(918, 4);
		Taxi t2 = new Taxi(1849, 3);
		Moto honda = new Moto(772, 150);
		Moto yamarra = new Moto(738,1000);
		
		veiculos.add(versa);
		veiculos.add(uno);
		veiculos.add(t1);
		veiculos.add(t2);
		veiculos.add(yamarra);
		veiculos.add(honda);
		
		for(Veiculo v : veiculos) {
			v.print();
		}
	}

}
