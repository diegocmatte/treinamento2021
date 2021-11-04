package br.mapfre.treinamento.model;

public abstract class Funcionario extends Pessoa{

    private String matricula;
    private Double salario;
    private final Double SALARIO_BASE = 1500.0;

    public Funcionario(String nome, String cpf, String matricula, Double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = SALARIO_BASE;
    }

    public abstract Double getBonificacao();

}
