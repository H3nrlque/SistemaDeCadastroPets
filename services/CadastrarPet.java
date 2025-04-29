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
        int idade = tc.nextInt();
        double peso = tc.nextDouble();
        String raca = tc.nextLine();

        String[] regexs = {"[a-zA-Z]", "[\\d]"};
        String[] dados = {nome, Integer.toString(idade)};

        boolean isValid = false;
        for (String dado : dados) {
            for (String regex : regexs) {
                if (dado.matches(regex)) {
                    isValid = true;
                    break;
                }
            }
        }
        if (peso > 60 | peso < 0.5) {
            throw new IllegalArgumentException("Peso inválido");
        }
        if (idade > 20) {
            throw new IllegalArgumentException("Idade inválida");
        }
        if (isValid) {
            Pet pet = new Pet(nome, TipoDeAnimal.valueOf(tipo), Sexo.valueOf(sexo), endereco, idade, peso, raca);
            Pet.adicionarPet(pet);
            SalvarPets.salvar(pet);
        }


    }
}
