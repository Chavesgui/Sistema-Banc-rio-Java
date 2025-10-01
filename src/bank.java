import java.sql.SQLOutput;
import java.util.Scanner;

public class bank {
    static void main() {
        //AQUI INICIA OS DADOS DOS CLIENTES

        String nome = "Guilherme Chaves";
        String tipoDeconta = "Corrente";
        double saldo = 3000.00;
        int escolha = 0;
        double valorRecebido = 0.0;
        double valorTransferido = 0.0;

        System.out.println("*********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeconta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n*********************");


        //AQUI FICA O MENU DE OPÇÕES E A LOGICA POR TRÁS DELE
        Scanner scanner = new Scanner(System.in);

        String menu = """
                ** Digite sua opção**
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (escolha != 4){
            System.out.println(menu);
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("\nSeu saldo é de: " + saldo + " reais.\n ");
            } else if (escolha == 2) {
                System.out.println("Digite quanto irá receber: ");
                valorRecebido = scanner.nextDouble();
                System.out.println("\nVocê recebeu: " + valorRecebido + " reais\n ");
                saldo += valorRecebido;
            } else if (escolha == 3) {
                System.out.println("Digite quanto deseja transferir: ");
                valorTransferido = scanner.nextDouble();
                if (valorTransferido > saldo){
                    System.out.println("Você não tem saldo para transferir");
                }else {
                    System.out.println("\nvocê transferiu: " + valorTransferido + " reais\n ");
                    saldo -= valorTransferido;
                }
            }else if (escolha == 4){
                System.out.println("Obrigado por nos escolher!❤");
            }else {
                System.out.println("opção invalida!");
            }
        }
    }


    }