package ATVFUNCIONARIO;

public class Estagiario extends Funcionario{
    private int horasTrabalhadas;

    public Estagiario(String nome, String cpf, double salarioBase, int horasTrabalhadas){
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    private double calcularSalario(){
        return getSalarioBase() + calcularBonus();
    }

    public int getHorasTrabalhadas(){return horasTrabalhadas;}
    public double calcularBonus(){return horasTrabalhadas * 20;}

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("---DadosDoEstagiario---\nHoras Trabalhadas: %d\nBonus: %.2f\nSalario final: %.2f\n",getHorasTrabalhadas(), calcularBonus(), calcularSalario());
    }
}
