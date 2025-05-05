package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;

import java.util.List;
import java.util.Scanner;

public class AlterandoDados {
    public static void alterando(List<Pet> pets) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o número do pet que você quer alterar: ");
        int n = tc.nextInt();
        System.out.print("O que você deseja alterar? ");
        String oq = tc.nextLine();
        switch (oq) {
            case "Nome":
                System.out.print("Digite o novo nome: ");
                String novoNome = tc.nextLine();
                pets.get(n).setNome(novoNome);
                if (pets.get(n).getNome().equalsIgnoreCase(novoNome)) {
                    System.out.println("Nome alterado com sucesso!");
                }
                break;
            case "Endereço":
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = tc.nextLine();
                pets.get(n).setEndereco(novoEndereco);
                if (pets.get(n).getEndereco().equalsIgnoreCase(novoEndereco)) {
                    System.out.println("Endereço alterado com isso");
                }
                break;
            case "Idade":
                System.out.print("Digite a nova idade: ");
                int novaIdade = tc.nextInt();
                pets.get(n).setIdade(novaIdade);
                if (pets.get(n).getIdade() == novaIdade) {
                    System.out.println("Idade alterada com sucesso");
                }
                break;
            case "Peso":
                System.out.print("Digite o novo peso: ");
                double novoPeso = tc.nextDouble();
                pets.get(n).setPeso(novoPeso);
                if (pets.get(n).getPeso() == novoPeso) {
                    System.out.println("Peso alterada com sucesso");
                }
                break;
            case "Raça":
                System.out.print("Digite a nova raça: ");
                String novaRaca = tc.nextLine();
                pets.get(n).setRaca(novaRaca);
                if (pets.get(n).getRaca().equalsIgnoreCase(novaRaca)) {
                    System.out.println("Raça alterada com sucesso");
                }
                break;
        }
    }
}
