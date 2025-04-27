package SistemaDeCadastroPet.services;

import java.io.*;

public class LendoArquivo {
    public static void lerArquivo() {
        try (FileReader fr = new FileReader("C:\\Users\\israe\\IdeaProjects\\Exerci\\src\\SistemaDeCadastro\\formulario.txt"); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
