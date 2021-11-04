package br.mapfre.treinamento.main;

import br.mapfre.treinamento.model.Gerente;
import br.mapfre.treinamento.model.Vendedor;

public class Main{

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("vendedor", "123", "mat123", 1500.00, 0.25);
        System.out.println("Salario vendedor: " + vendedor.getSalario());
        System.out.println("Bonificacao vendedor: " +vendedor.getBonificacao());
        System.out.println("---------------------");

        Gerente gerente = new Gerente("gerente", "123", "mat123", 1500.00, 0.25, 1, "T.I.");
        System.out.println("Salario gerente: " + gerente.getSalario());
        System.out.println("Salario gerente: " + gerente.getBonificacao());
        System.out.println("---------------------");
    }
}
