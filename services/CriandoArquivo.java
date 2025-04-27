package SistemaDeCadastroPet.services;

import java.io.File;
import java.io.IOException;

public class CriandoArquivo {
    public static void criarArquivo() {
        File file = new File("formulario.txt");
        try {
            if (file.createNewFile()) {
                LendoArquivo.lerArquivo();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
