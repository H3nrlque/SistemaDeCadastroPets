package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;
import SistemaDeCadastroPet.enums.Sexo;
import SistemaDeCadastroPet.enums.TipoDeAnimal;

import java.util.Scanner;

public class CadastrarPet {
    public static void cadastrarPet() {
        Scanner tc = new Scanner(System.in);
        LendoArquivo.lerArquivo();
        String nome = tc.nextLine();
        String tipo = tc.nextLine();
        String sexo = tc.nextLine();
        String endereco = tc.nextLine();
        String idade = tc.nextLine();
        String peso = tc.nextLine();
        String raca = tc.nextLine();

        String regexNome = "a-zA-Z]";
        String regexIdade = "[0-9],.";
        String[] dados1 = {nome, raca};
        String[] dados2 = {idade, peso};

        boolean isValid = false;
        for (String dado : dados1) {
            if (dado.matches(regexNome)) {
                isValid = true;
            }
        }

        for (String dado : dados2) {
            if (dado.matches(regexIdade)) {
                isValid = true;
            }
        }

        if (isValid) {
            if (Double.parseDouble(peso) > 60 | Double.parseDouble(peso) < 0.5) {
                throw new IllegalArgumentException("Peso inválido");
            }
            if (Double.parseDouble(idade) > 20) {
                throw new IllegalArgumentException("Idade inválida");
            }
            if (Integer.parseInt(idade) < 1) {
                idade = idade.concat(" anos");
            }

            Pet pet = new Pet(nome, TipoDeAnimal.valueOf(tipo), Sexo.valueOf(sexo), endereco, idade, peso, raca);
            Pet.adicionarPet(pet);
            SalvarPets.salvar(pet);
        }
    }
}
