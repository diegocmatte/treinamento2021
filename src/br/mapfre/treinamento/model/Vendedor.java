package br.mapfre.treinamento.model;

public class Vendedor extends Funcionario{

    private Double bonificacao;

    public Vendedor(String nome, String cpf, String matricula, Double salario, Double bonificacao) {
        super(nome, cpf, matricula, salario);
        this.bonificacao = bonificacao;
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 0.25;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public Double getSalario(){
        return super.getSalario() * 1.20;
    }
}
