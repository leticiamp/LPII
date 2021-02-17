package br.ufrn.imd.lp2;

import java.util.ArrayList;
import java.util.HashMap;

public class Loja {

	public ArrayList<Veiculo> veiculos;

	public Loja() {
		this.veiculos = new ArrayList<Veiculo>();
	}

	// Adicionar veiculo
	public void adcionarVeiculo(Veiculo v) {
		veiculos.add(v);
		System.out.println(v.getMarca() +  " " + v.getModelo() + " adicionado");
	}

	// Remover veiculo
	public void removerVeiculo(Veiculo v) {
		veiculos.remove(v);
		System.out.println(v.getMarca() + " " + v.getModelo() + " removido");
	}

	// Exibir todos os veiculos cadastrados
	public void exibirVeiculos() {

		System.out.println("\n####################################");
		System.out.println("Lista de veiculos cadastrados");
		System.out.println("####################################\n");
		for (Veiculo v : veiculos) {
			v.print();
		}
	}

	// Exibir os veiculos alugados e receita
	public void exibirVeiculosAlugados() {

		double valorTotal = 0;

		System.out.println("####################################");
		System.out.println("Lista de veiculos alugados");
		System.out.println("####################################\n");
		
		for (Veiculo v : veiculos) {
			if (v.getAlugado()) {
				v.print();
				valorTotal += v.getValorAluguel();
			}
		}
		System.out.println("A LocaLisa recebera pelo aluguel desses veiculos o valor de R$ " + valorTotal + "\n");
	}

	// Exibir os veiculos disponiveis para aluguel e seus respectivos valores
	public void exibirVeiculosDisponiveis() {
		
		System.out.println("####################################");
		System.out.println("Lista de veiculos disponiveis");
		System.out.println("####################################\n");
		
		for (Veiculo v : veiculos) {
			if (!v.getAlugado()) {
				v.print();
			}
		}
	}

	// Listar o valor de aluguel mais elevado entre os veiculos
	public double exibirMaiorAluguel() {

		double maiorAluguel = 0;

		for (Veiculo v : veiculos) {
			if (v.getValorAluguel() > maiorAluguel) {
				maiorAluguel = v.getValorAluguel();
			}
		}

		return maiorAluguel;
	}

	// Listar a marca com maior numero de carros
	public void exibirMarcaMaiorQtd() {

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		int quantidade = 0;
		String marca = new String();

		for (Veiculo v : veiculos) {
			if (mapa.containsKey(v.getMarca())) {
				int valor = mapa.get(v.getMarca()) + 1; //retorna o valor atribuido a chave
				mapa.put(v.getMarca(), valor);
				if (valor >= quantidade) {
					quantidade = valor;
					marca = v.getMarca();
				}
			} else {
				mapa.put(v.getMarca(), 1);
			}
		}

		System.out.println("####################################");
		System.out.println("Marca com maior quantidade de veiculos: " + marca + "(" + quantidade + " veiculo(s))");
		System.out.println("####################################\n");
	}
}