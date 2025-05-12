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
                bw.write(pet.getNome());
                bw.newLine();
                bw.write(pet.getTipoDeAnimal().toString());
                bw.newLine();
                bw.write(pet.getSexo().toString());
                bw.newLine();
                bw.write(pet.getEndereco());
                bw.newLine();
                bw.write(pet.getIdade() + " anos");
                bw.newLine();
                bw.write(pet.getPeso() + "Kg");
                bw.newLine();
                bw.write(pet.getRaca());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
