import java.util.Scanner;

 class ConsultarDadosClientes {
        private Conta conta;

        public ConsultarDadosClientes(Conta conta) {
            this.conta = conta;
        }
        public void exibirDadosCliente(Scanner scanner) {

        System.out.println("###############################################");
        System.out.println("Dados iniciais do cliente");
        System.out.println(" ");
        System.out.println("Nome:               " + conta.getNome());
        System.out.println("Tipo de conta:      " + conta.getTipoConta());
        System.out.println("Saldo inicial:      " + conta.getSaldo());
        System.out.println(" ");
        System.out.println("###############################################");

        System.out.println("Para voltar ao menu inicial aperte 1 ou 0 para Sair");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                return; //volta para o menu principal
            case 0:
                System.out.println("Finalizando acesso. Até mais!");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
