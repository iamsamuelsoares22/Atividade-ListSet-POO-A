package org.unifacisa.Atividades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Atividade5 {
    public void processarConjuntos() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        System.out.println("Preencha o primeiro conjunto:");
        preencherLista(scanner, lista1);

        System.out.println("Preencha o segundo conjunto:");
        preencherLista(scanner, lista2);

        Set<Integer> conjunto1 = new HashSet<>(lista1);
        Set<Integer> conjunto2 = new HashSet<>(lista2);

        Set<Integer> uniao = new HashSet<>(conjunto1);
        uniao.addAll(conjunto2);

        Set<Integer> intersecao = new HashSet<>(conjunto1);
        intersecao.retainAll(conjunto2);

        System.out.println("União dos conjuntos: " + uniao);
        System.out.println("Interseção dos conjuntos: " + intersecao);

        scanner.close();
    }

    private void preencherLista(Scanner scanner, List<Integer> lista) {
        while (true) {
            System.out.print("Menu\n1-Adicionar número \n2-Terminar \nEscolha: ");
            String escolha = scanner.nextLine().trim();

            if ("1".equals(escolha)) {
                System.out.print("Digite o número: ");
                lista.add(Integer.parseInt(scanner.nextLine().trim()));
            } else if ("2".equals(escolha)) {
                break;
            } else {
                System.out.println("Inválido, tente de novo.");
            }
        }
    }
}
