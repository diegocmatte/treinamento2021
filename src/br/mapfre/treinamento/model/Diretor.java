package br.mapfre.treinamento.model;

public class Diretor extends Funcionario{

    public Diretor(String nome, String cpf, String matricula, Double salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public Double getSalario(){
        return super.getSalario() * 1.50;
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 0.05;
    }
}
