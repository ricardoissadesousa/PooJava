package introducaoPoo.application;

import introducaoPoo.entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class MainContaBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBanco conta = new ContaBanco();

        System.out.println("Digite o numero do conta: ");
        int num = sc.nextInt();

        System.out.println("Digite o Nome");
        conta.setNome(sc.next());

        System.out.println("Digite o valor do primeiro deposito: ");
        double saldo = sc.nextDouble();

        System.out.println("Numero da conta "+ num+ " Nome: "+conta.getNome()+" saldo: "+saldo);

        System.out.println("Digite o um deposito: ");
        saldo += sc.nextDouble();
        conta.addSaldo(saldo);

        System.out.println("Numero da conta "+ num+ " Nome: "+conta.getNome()+" saldo: "+conta.getSaldo());

        System.out.println("retirar seu dinheiro: ");
        saldo = sc.nextDouble();
        conta.saqueSaldo(saldo);

        System.out.println("Numero da conta "+ num+ " Nome: "+conta.getNome()+" saldo: "+conta.getSaldo());

sc.close();
    }
}
