package org.unifacisa.Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Atividade3 {

    public void removerDuplicatas() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaOriginal = new ArrayList<>();
        Set<Integer> listaSemDuplicatas = new LinkedHashSet<>();


        while (true) {
            System.out.print("Menu\n1-Adicionar número \n2-Terminar \nEscolha: ");
            String escolha = scanner.nextLine().trim();

            if ("1".equals(escolha)) {
                System.out.print("Digite o número que deseja adcionar: ");
                listaOriginal.add(Integer.parseInt(scanner.nextLine().trim()));
            } else if ("2".equals(escolha)) {
                break;
            } else {
                System.out.println("Inválido, tente de novo.");
            }
        }

        listaSemDuplicatas.addAll(listaOriginal);

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sem duplicatas: " + listaSemDuplicatas);

        scanner.close();
    }
}
