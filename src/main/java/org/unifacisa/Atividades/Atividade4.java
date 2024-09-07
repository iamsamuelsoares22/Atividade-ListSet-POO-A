package org.unifacisa.Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Atividade4 {
    public void processarNomes() {
        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        while (true) {
            System.out.print("Menu\n1-Adicionar nome \n2-Terminar \nEscolha: ");
            String escolha = scanner.nextLine().trim();

            if ("1".equals(escolha)) {
                System.out.print("Digite o nome: ");
                listaNomes.add(scanner.nextLine().trim());
            } else if ("2".equals(escolha)) {
                break;
            } else {
                System.out.println("Inválido, tente de novo.");
            }
        }

        Collections.sort(listaNomes);
        Set<String> conjuntoNomes = new LinkedHashSet<>(listaNomes);

        System.out.println("Conjunto de nomes ordenados e sem duplicatas: " + conjuntoNomes);

        scanner.close();
    }
}
