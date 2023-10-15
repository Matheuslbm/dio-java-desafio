import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: 
        //Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência!");
            int numeroAgencia = scanner.nextInt();

            System.out.println("Digite a conta!");
            String conta = scanner.next();

            System.out.println("Digite seu nome!");
            String nome = scanner.next();

            System.out.println("Qual valor você deseja depositar?");
            double dinheiro = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco");
            System.out.println("Sua agência é: " + numeroAgencia + ", conta: " + conta + " e seu saldo de:  " + dinheiro + " está disponível para saque");
        }


    }
}
