package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;

import java.util.List;
import java.util.Scanner;

public class AlterandoDados {
    public static void alterando(List<Pet> pets) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o número do pet que você quer alterar: ");
        int n = tc.nextInt();
        escolha();
        int esc = tc.nextInt();
        switch (esc) {
            case 1:
                System.out.print("Digite o novo nome: ");
                String novoNome = tc.nextLine();
                pets.get(n).setNome(novoNome);
                if (pets.get(n).getNome().equalsIgnoreCase(novoNome)) {
                    System.out.println("Nome alterado com sucesso!");
                }
                break;
            case 2:
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = tc.nextLine();
                pets.get(n).setEndereco(novoEndereco);
                if (pets.get(n).getEndereco().equalsIgnoreCase(novoEndereco)) {
                    System.out.println("Endereço alterado com isso");
                }
                break;
            case 3:
                System.out.print("Digite a nova idade: ");
                String novaIdade = tc.nextLine();
                pets.get(n).setIdade(novaIdade);
                if (pets.get(n).getIdade().equalsIgnoreCase(novaIdade)) {
                    System.out.println("Idade alterada com sucesso");
                }
                break;
            case 4:
                System.out.print("Digite o novo peso: ");
                String novoPeso = tc.nextLine();
                pets.get(n).setPeso(novoPeso);
                if (pets.get(n).getPeso().equalsIgnoreCase(novoPeso)) {
                    System.out.println("Peso alterada com sucesso");
                }
                break;
            case 5:
                System.out.print("Digite a nova raça: ");
                String novaRaca = tc.nextLine();
                pets.get(n).setRaca(novaRaca);
                if (pets.get(n).getRaca().equalsIgnoreCase(novaRaca)) {
                    System.out.println("Raça alterada com sucesso");
                }
                break;
        }
    }

    public static void escolha() {
        System.out.println("O que você deseja alterar? ");
        System.out.println("[1] Nome");
        System.out.println("[2] Endereço");
        System.out.println("[3] Idade");
        System.out.println("[4] Peso");
        System.out.println("[5] Raça");
    }
}
