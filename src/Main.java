import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setNome();
        cliente.setEmail();
        cliente.setCpf();

        Boleto boleto = new Boleto();

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        boolean escolha = true;
        while (escolha) {
            System.out.println("Digite a operação que você deseja realizar: \n1. Depositar \n2. Sacar \n3. Transferir \n4. Pagar boleto \n5. Encerrar programa");
            int opcoes = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcoes) {
                case 1:
                    System.out.println("Digite o valor para depósito:");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); 
                    cc.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para saque:");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    cc.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferência:");
                    double valorTransferencia = scanner.nextDouble();
                    scanner.nextLine(); 
                    cc.transferir(valorTransferencia, poupanca);
                    break;
                case 4:
                    boleto.informacoesBoleto(scanner, cliente.getNome());
                    System.out.println("\nDados do Boleto:");
                    boleto.imprimirInfosBoleto();
                    cc.sacar(boleto.getValor());
                    break;
                case 5:
                    System.out.println("Programa encerrado");
                    escolha = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
            System.out.println();
        }

        scanner.close();
    }
}
