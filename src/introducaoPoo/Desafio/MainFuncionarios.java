package introducaoPoo.Desafio;

import introducaoPoo.entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainFuncionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Funcioarios Serâo Registrados: ");
        int quant = sc.nextInt();

        List<Funcionarios> list = new ArrayList<>() ;

        for (int i = 0; i < quant; i++) {
            System.out.println();
            System.out.println("Funcionario #"+(i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionarios func = new Funcionarios(id, nome, salario);
                list.add(func);

        }
        System.out.println();
        System.out.print("Digite o id do Funcionario: ");
        int idSalario = sc.nextInt();
        Funcionarios pos = list.stream().filter(x -> x.getId() == idSalario).findFirst().get();
         //Integer pos = verificaID(list,idSalario);
        if(pos == null){
            System.out.println("Esse id Não existe!");
        }else{
            System.out.println("Entre com a Porcentagem: ");
            double porc= sc.nextDouble();
            pos.increaseSalary(porc);
        }
        System.out.println();
        System.out.println("Lista de Funcionarios: ");
        for (Funcionarios f : list) {
            System.out.println(f);
        }


    }
    public static Integer verificaID(List<Funcionarios>func, int id){
        for(int i = 0 ; i < func.size() ; i++){
            if(func.get(i).getId() == id){
                return i;
            }
        }
        return null;

    }
}
