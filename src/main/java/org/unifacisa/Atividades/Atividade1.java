package org.unifacisa.Atividades;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Atividade1 {

    public void palavrasUnicas() {
        String palavra;

        Scanner scanner = new Scanner(System.in);
        Set<String> palavrasUnicas = new TreeSet<>();

        while (true) {
            System.out.print("Menu palavras \n1-Adicionar tarefa: \n2-Sair \n\nDigite o número da sua escolha: ");
            String escolha = scanner.nextLine().trim();

            if (escolha.equals("1")) {
                System.out.print("Digite a palavra para adicionar: ");
                palavra = scanner.nextLine().trim();
                palavrasUnicas.add(palavra);
            } else if (escolha.equals("2")) {
                break;
            } else {
                System.out.println("\n\nEscolha inválida, tente novamente!\n\n");
            }
        }

        System.out.println("Palavras em ordem alfabética:");
        for (String p : palavrasUnicas) {
            System.out.println(p);
        }

        scanner.close();
    }
}
