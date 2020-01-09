package main;

import model.Aviao;
import model.CriaVeiculo;

public class Main {

	public static void main(String[] args) {
		
		
		 CriaVeiculo aviao = new CriaVeiculo();
		 aviao.setModelo("boing747");
		 System.out.println(aviao.getModelo());
		 
		 Aviao aviaoespecifico = new Aviao();
		 aviaoespecifico.setTipo("comercial");
		 System.out.println(aviaoespecifico.getTipo());
		 

	}

}
