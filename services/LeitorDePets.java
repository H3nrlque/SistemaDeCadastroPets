package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;
import SistemaDeCadastroPet.enums.Sexo;
import SistemaDeCadastroPet.enums.TipoDeAnimal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDePets {
    public static void leitor() {
        File pasta = new File("src/SistemaDeCadastroPet/petsCadastrados");
        List<Pet> listaPets = new ArrayList<>();
        if (pasta.exists() && pasta.isDirectory()) {
            File[] arquivos = pasta.listFiles((dir, name) -> name.endsWith(".txt"));

            if (arquivos != null) {
                for (File arquivo : arquivos) {
                    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                        String nome = br.readLine();
                        String tipo = br.readLine();
                        String sexo = br.readLine();
                        String endereco = br.readLine();
                        String idade = br.readLine();
                        String peso = br.readLine();
                        String raca = br.readLine();
                        Pet pet = new Pet(nome, TipoDeAnimal.valueOf(tipo), Sexo.valueOf(sexo), endereco, idade, peso, raca);
                        listaPets.add(pet);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            Pet.setPets(listaPets);
        }
    }
}
