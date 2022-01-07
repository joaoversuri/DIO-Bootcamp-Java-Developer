package com.exercicios.equals_hascodes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// ================ Hash Map ==================

        Map<String, String>  aluno = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","31");
        aluno.put("Media","8.5");
        aluno.put("Turma","PROMAN04");


        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String>  aluno2 = new HashMap<>();
        aluno2.put("Nome","Jacque");
        aluno2.put("Idade","33");
        aluno2.put("Media","8.5");
        aluno2.put("Turma","BARÇA");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);


// ================ Interface Set (hashSet e treeSet) ===========
//        Set<Carro> hashSetCarros = new HashSet<>();
//
//        hashSetCarros.add(new Carro("Ford"));
//        hashSetCarros.add(new Carro("Chevrolet"));
//        hashSetCarros.add(new Carro("Fiat"));
//        hashSetCarros.add(new Carro("Zip"));
//        hashSetCarros.add(new Carro("Peugeot"));
//        hashSetCarros.add(new Carro("Alfa Romeo"));
//
//        System.out.println(hashSetCarros);
//
//        Set<Carro> treeSetCarros = new TreeSet<>();
//
//        treeSetCarros.add(new Carro("Ford"));
//        treeSetCarros.add(new Carro("Chevrolet"));
//        treeSetCarros.add(new Carro("Fiat"));
//        treeSetCarros.add(new Carro("Zip"));
//        treeSetCarros.add(new Carro("Peugeot"));
//        treeSetCarros.add(new Carro("Alfa Romeo"));
//
//        System.out.println(treeSetCarros);

// ================= Listas =================
//        List<Carro> listCarros = new ArrayList<>();
//
//        listCarros.add(new Carro("Ford"));
//        listCarros.add(new Carro("Chevrolet"));
//        listCarros.add(new Carro("Fiat"));
//        listCarros.add(new Carro("Peugeot"));
//
//        System.out.println(listCarros.contains(new Carro("Ford")));
//
//        System.out.println(listCarros.get(2));
//
//        System.out.println(listCarros.indexOf(new Carro("Fiat")));
//
//        System.out.println(listCarros.remove(2));
//        System.out.println(listCarros);


//================== Queue e Linked List ==============
//        Queue<Carro> quereCarros = new LinkedList<>();
//        quereCarros.add(new Carro("Ford"));
//        quereCarros.add(new Carro("Chevrolet"));
//        quereCarros.add(new Carro("Fiat"));
//
//        System.out.println(quereCarros.add(new Carro("Peugeot")));
//        System.out.println(quereCarros);
//
//        System.out.println(quereCarros.offer(new Carro("Renault")));
//        System.out.println(quereCarros);
//
//        System.out.println(quereCarros.peek());
//        System.out.println(quereCarros);
//
//        System.out.println(quereCarros.poll());
//        System.out.println(quereCarros);

// ============= stacks ==================
//        Stack<Carro> stackCarro = new Stack<>();
//
//        stackCarro.push(new Carro("Ford"));
//        stackCarro.push(new Carro("Chevrolet"));
//        stackCarro.push(new Carro("Fiat"));
//
//        System.out.println(stackCarro);
//        System.out.println(stackCarro.pop());
//        System.out.println(stackCarro);
//
//        System.out.println(stackCarro.peek());
//        System.out.println(stackCarro);


// ============= equals e hashcode ==================
//        List<Carro> listaCarros = new ArrayList<>();
//        listaCarros.add(new Carro("Ford"));
//        listaCarros.add(new Carro("Chevrolet"));
//        listaCarros.add(new Carro("Volkswagen"));
//
//        System.out.println(listaCarros.contains(new Carro("Ford")));
//        System.out.println(new Carro("Ford").hashCode());
//        System.out.println(new Carro("Ford1").hashCode());
//
//        Carro carro1 = new Carro("Ford");
//        Carro carro2 = new Carro("Chevrolet");
//
//        System.out.println(carro1.equals(carro2));

    }
}
