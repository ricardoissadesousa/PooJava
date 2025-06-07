package introducaoPoo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ; // criação de uma Lista

        list.add("Maria"); // para adicionar em uma Lista
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");// para adicionar em uma Lista , mais primeiro passa a posição depois o parametro

        System.out.println(list.size());


        for (String x : list){
            System.out.println(x);
        }
        System.out.println("---------------------------------------------");
        //list.remove(1); // removendo pelo indice que esta na posição 1 da Lista
        list.removeIf(x -> x.charAt(0) == 'M'); // removendo pelo predicado no sera removidos Todos que começam com letra M

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------------------------------");


        System.out.println("index of Bob "+ list.indexOf("Bob")); // Filtando todos com Nome de Bob

        System.out.println("---------------------------------------------");
        // comando para pegar todos que começam com a Letra A
        List<String> Result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : Result){
            System.out.println(x);
        }

        System.out.println("---------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // comando para pegar
        // a primeira pessoa com a letra A da Lista

        System.out.println(name);


    }
}
