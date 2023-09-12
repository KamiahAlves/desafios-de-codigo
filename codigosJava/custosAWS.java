// Multiplique a quantidade de servidores pelo custo por hora de um servidor e a quantidade de bancos de dados pelo custo por hora de um banco de dados. Some esses valores para obter o custo total.


import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int quantidadeServidores = scanner.nextInt();

        int quantidadeBancosDados = scanner.nextInt();

        //TODO: Calcule os custos
        double servidores =  quantidadeServidores * custoPorHoraServidor;
        double bancodados = quantidadeBancosDados * custoPorHoraBancoDados;
        
        double custoTotal = servidores + bancodados;


        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }
}
