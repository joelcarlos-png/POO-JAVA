package ATVFUNCIONARIO;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public void exibirDados(){
        System.out.printf("=-=DadosDoFuncionario=-=\nNome: %s\nCPF: %s\nSalario Base: %.2f\n", nome, cpf, salarioBase);
    }

    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public double getSalarioBase(){return salarioBase;}
}