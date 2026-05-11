package ATVFUNCIONARIO;

public class Desenvolvedor extends Funcionario{
    private String nivel;
    private double bonus = 500;

    public Desenvolvedor(String nome, String cpf, double salrioBase, String nivel){
        super(nome, cpf, salrioBase);
        this.nivel = nivel;
    }

    private double calcularSalario(){
        return getSalarioBase() + bonus;
    }

    public String getNivel(){return nivel;}

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("---DadosDoDesenvolvedor---\nNivel: %s\nBonus: %.2f\nSalario Final: %.2f\n",getNivel(), bonus, calcularSalario());
    }
}
