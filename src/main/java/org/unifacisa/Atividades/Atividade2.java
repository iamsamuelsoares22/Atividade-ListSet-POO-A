package org.unifacisa.Atividades;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Atividade2 {
    public void verificarConjunto() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("conjunto 1");
        while (true) {
            System.out.print("Menu conjunto 1\n1-Adicionar número \n2-Terminar \nEscolha: ");
            String escolha = scanner.nextLine().trim();

            if ("1".equals(escolha)) {
                System.out.print("Digite o número que deseja adcionar: ");
                conjunto1.add(Integer.parseInt(scanner.nextLine().trim()));
            } else if ("2".equals(escolha)) {
                break;
            } else {
                System.out.println("Escolha inválida, tente novamente!");
            }
        }

        System.out.println("conjunto 2");
        while (true) {
            System.out.print("Menu conjunto 2\n1-Adicionar número \n2-Terminar \nEscolha: ");
            String escolha = scanner.nextLine().trim();

            if ("1".equals(escolha)) {
                System.out.print("Digite o número que deseja adcionar: ");
                conjunto2.add(Integer.parseInt(scanner.nextLine().trim()));
            } else if ("2".equals(escolha)) {
                break;
            } else {
                System.out.println("Inválido, tente de novo.");
            }
        }

        if (conjunto1.containsAll(conjunto2)) {
            System.out.println("O segundo conjunto é subconjunto do primeiro.");
        } else {
            System.out.println("O segundo conjunto não é subconjunto do primeiro.");
        }

        scanner.close();
    }
}
