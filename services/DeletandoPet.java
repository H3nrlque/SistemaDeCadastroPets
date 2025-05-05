package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;

import java.util.List;
import java.util.Scanner;

public class DeletandoPet {
    public static void deletando(List<Pet> pets) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o número do pet que você quer alterar: ");
        int n = tc.nextInt();
        System.out.println("você tem certeza que deseja remover este pet:");
        System.out.println(pets.indexOf(pets.get(n))+". "+pets.get(n));
        String res = tc.nextLine();
        if (res.equalsIgnoreCase("sim")) {
            pets.remove(n);
            System.out.println("Pet removido com sucesso");
        }
    }
}
