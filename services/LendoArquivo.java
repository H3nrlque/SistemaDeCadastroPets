package SistemaDeCadastroPet.services;

import java.io.*;

public class LendoArquivo {
    public static void lerArquivo() {
        try (FileReader fr = new FileReader("src/SistemaDeCadastroPet/formulario.txt"); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
