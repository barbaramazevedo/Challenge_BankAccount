import static java.awt.SystemColor.menu;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta("Jacqueline Oliveira", "Corrente", 2500);
        ConsultarDadosClientes consultaDados = new ConsultarDadosClientes(conta);
        MenuOperacoes operacoes = new MenuOperacoes(conta);

            while (true) {
                System.out.println("----- MENU INICIAL -----");
                System.out.println("1. Consultar dados do Cliente");
                System.out.println("2. Menu Operações");
                System.out.println("0. Sair");
                System.out.println("Escolha uma opção: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        consultaDados.exibirDadosCliente(scanner);
                        break;
                    case 2:
                        operacoes.menuOperacoes(scanner);
                        break;
                    case 0:
                        System.out.println("Você finalizou o acesso ao banco. Volte Sempre!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            }
        }
    }

