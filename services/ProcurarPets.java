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
                String idade = tc.nextLine();
                for (Pet pet : pets) {
                    if (pet.getIdade().equalsIgnoreCase(idade) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case "peso":
                System.out.print("Digite o peso: ");
                String peso = tc.nextLine();
                for (Pet pet : pets) {
                    if (pet.getPeso().equalsIgnoreCase(peso) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo)) {
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

    public static void buscarPor2Filtros(List<Pet> pets) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Escolha o tipo de animal - [Cachorro, Gato]: ");
        String tipo = tc.nextLine();
        System.out.println("Qual critério você deseja utilizar? ");
        System.out.println("[1] Nome e Idade");
        System.out.println("[2] Nome e Peso");
        System.out.println("[3] Idade e Peso");
        System.out.println("[4] Idade e Raça");
        System.out.println("[5] Peso e Raça");
        int esc = tc.nextInt();
        tc.nextLine();
        switch (esc) {
            case 1:
                System.out.print("Digite o nome: ");
                String nome = tc.nextLine().toLowerCase();
                System.out.print("Digite a idade: ");
                String idade = tc.nextLine();
                for (Pet pet : pets) {
                    if (pet.getNome().toLowerCase().contains(nome) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo) && pet.getIdade().equalsIgnoreCase(idade) ) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case 2:
                System.out.print("Digite o nome: ");
                String nome2 = tc.nextLine().toLowerCase();
                System.out.print("Digite o peso: ");
                String peso2 = tc.nextLine();
                for (Pet pet : pets) {
                    if (pet.getNome().toLowerCase().contains(nome2) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo) && pet.getPeso().equalsIgnoreCase(peso2)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;

            case 3:
                System.out.print("Digite a idade: ");
                String idade3 = tc.nextLine();
                System.out.print("Digite o peso: ");
                String peso3 = tc.nextLine();
                for (Pet pet : pets) {
                    if (pet.getIdade().equalsIgnoreCase(idade3) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo) && pet.getPeso().equalsIgnoreCase(peso3)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;

            case 4:
                System.out.print("Digite a idade: ");
                String idade4 = tc.nextLine();
                System.out.print("Digite a raça: ");
                String raca4 = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getIdade().equalsIgnoreCase(idade4) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo) && pet.getRaca().toLowerCase().contains(raca4)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            case 5:
                System.out.print("Digite o peso: ");
                String peso5 = tc.nextLine();
                System.out.print("Digite a raça: ");
                String raca5 = tc.nextLine().toLowerCase();
                for (Pet pet : pets) {
                    if (pet.getRaca().toLowerCase().contains(raca5) && pet.getTipoDeAnimal().toString().equalsIgnoreCase(tipo) && pet.getPeso().equalsIgnoreCase(peso5)) {
                        System.out.println(pets.indexOf(pet)+". "+pet);
                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + esc);
        }
    }
}
