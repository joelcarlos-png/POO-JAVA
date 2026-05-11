package ATVFUNCIONARIO;

public class Main {
    public static void main(String[] args){
        Funcionario fun = new Funcionario("Joel", "1111", 1500);
        Gerente gen = new Gerente("Marcos", "2222", 1500, 250);
        Desenvolvedor dev = new Desenvolvedor("Carlos", "3333", 2000,"Senior");
        Estagiario est = new Estagiario("Jose", "4444", 500, 20);

        fun.exibirDados();
        IO.println();

        gen.exibirDados();
        IO.println();

        dev.exibirDados();
        IO.println();

        est.exibirDados();
        IO.println();
    }
}
