import java.util.Scanner;

class MenuOperacoes {
    private Conta conta;

    public MenuOperacoes(Conta conta) {
        this.conta = conta;
    }

    public void menuOperacoes(Scanner scanner) {
        while(true) {
        System.out.println("----- Operações -----");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Saque");
        System.out.println("3- Depósito");
        System.out.println("4- Transferência");
        System.out.println("0- Voltar ao menu principal");
        System.out.println("Escolha a opção desejada: ");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                realizarSaque(scanner);
                break;
            case 3:
                realizarDeposito(scanner);
                break;
            case 4:
                realizarTransferencia(scanner);
                break;
            case 0:
                return; // Volta ao menu principal
            default:
                System.out.println("Opção inválida! Tente novamente.");

        }
        }
    }

            private void consultarSaldo() {
                System.out.println("Seu saldo atual é: R$ " + conta.getSaldo());
            }

        private void realizarSaque (Scanner scanner) {
            System.out.println("Você escolheu a opção SAQUE.");
            System.out.println("Digite o valor a ser sacado: ");
            double saque = scanner.nextDouble();
            if (saque > conta.getSaldo()) {
                System.out.println("Valor excede ao saldo, seu saldo é: " + conta.getSaldo());
            } else {
                conta.setSaldo(conta.getSaldo() - saque);
                System.out.println("Saque de R$ " + saque + " realizado com sucesso!");
                System.out.println("Seu saldo agora é: R$ " + conta.getSaldo());
            }
        }
        private void realizarDeposito (Scanner scanner) {
            System.out.println("Você escolheu a opção DEPÓSITO.");
            System.out.println("Digite o valor a ser depositado: ");
            double deposito = scanner.nextDouble();
            conta.setSaldo(conta.getSaldo() + deposito);
            System.out.println("Depósito de R$ " + deposito + " realizado com sucesso!");
            System.out.println("Seu saldo agora é: R$ " + conta.getSaldo());
        }
    private void realizarTransferencia(Scanner scanner) {
        System.out.print("Digite o valor a ser transferido: ");
        double transferencia = scanner.nextDouble();
        if (transferencia > conta.getSaldo()) {
            System.out.println("Saldo insuficiente! Seu saldo é: R$ " + conta.getSaldo());
        } else {
            System.out.print("Digite o número da conta de destino: ");
            String contaDestino = scanner.next();
            conta.setSaldo(conta.getSaldo() - transferencia);
            System.out.println("Transferência de R$ " + transferencia + " para a conta " + contaDestino + " realizada com sucesso!");
            System.out.println("Seu saldo agora é: R$ " + conta.getSaldo());
        }
    }
}

