package ATVFUNCIONARIO;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus){
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    private double calcularSalario(){
        return getSalarioBase() + bonus;
    }

    public double getBonus(){return bonus;}

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("---DadosDoGerente---\nBonus: %.2f\nSalario Final: %.2f\n", bonus, calcularSalario());
    }
}
