package br.mapfre.treinamento.model;

public class Gerente extends Funcionario{

    private Integer nroVendedores;
    private String areaGerenciada;

    public Gerente(String nome, String cpf, String matricula, Double salario, Double bonificacao, Integer nroVendedores, String areaGerenciada) {
        super(nome, cpf, matricula, salario);
        this.nroVendedores = nroVendedores;
        this.areaGerenciada = areaGerenciada;
    }

    public Integer getNroVendedores() {
        return nroVendedores;
    }

    public void setNroVendedores(Integer nroVendedores) {
        this.nroVendedores = nroVendedores;
    }

    public String getAreaGerenciada() {
        return areaGerenciada;
    }

    public void setAreaGerenciada(String areaGerenciada) {
        this.areaGerenciada = areaGerenciada;
    }

    @Override
    public Double getSalario(){
        return super.getSalario() * 1.30;
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 0.15;
    }

}
