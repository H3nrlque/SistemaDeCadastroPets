package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;

import java.util.List;
import java.util.Scanner;

public class ProcurarPets {
    public static void listarTodosOsPets(List<Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet);
        }

    }
    public static void buscarPorFiltro(List<Pet> pets) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Escolha o tipo de animal - [Cachorro, Gato]: ");
        String tipo = tc.nextLine();
        System.out.print("Qual critério você deseja utilizar? ");
        String criterio = tc.nextLine().toLowerCase();
        switch (criterio) {
            case "nome":
                System.out.print("Digite o nome: ");
                String nome = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getNome().toLowerCase().contains(nome) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "sexo":
                System.out.print("Digite o sexo: ");
                String sexo = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getSexo().toString().toLowerCase().contains(sexo) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "idade":
                System.out.print("Digite a idade: ");
                int idade = tc.nextInt();
                for (Pet pet : pets) {
                    if (pet.getIdade() == idade && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "peso":
                System.out.print("Digite o peso: ");
                double peso = tc.nextDouble();
                for (Pet pet : pets) {
                    if (pet.getPeso() == peso && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "raça":
                System.out.print("Digite a raça: ");
                String raca = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getRaca().toLowerCase().contains(raca) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "endereço":
                System.out.print("Digite o endereço: ");
                String endereco = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getEndereco().toLowerCase().contains(endereco) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
        }
    }
}
