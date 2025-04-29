package SistemaDeCadastroPet.services;

import SistemaDeCadastroPet.entities.Pet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SalvarPets {
    public static void salvar(Pet pet) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String now = LocalDateTime.now().format(formatter);
        File file;
        file = new File("src/SistemaDeCadastroPet/petsCadastrados", now.concat("-").concat(pet.getNome().toUpperCase(Locale.ROOT)).concat(".txt"));
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("Nome: ".concat(pet.getNome()));
                bw.newLine();
                bw.write("Tipo: ".concat(pet.getTipoDeAnimal().toString()));
                bw.newLine();
                bw.write("Sexo: ".concat(pet.getSexo().toString()));
                bw.newLine();
                bw.write("Endereço: ".concat(pet.getEndereco()));
                bw.newLine();
                bw.write("Idade: " + pet.getIdade() + " anos");
                bw.newLine();
                bw.write("Peso: " + pet.getPeso() + "Kg");
                bw.newLine();
                bw.write("Raça: ".concat(pet.getRaca()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
