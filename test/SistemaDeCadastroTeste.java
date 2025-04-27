package SistemaDeCadastroPet.test;

import SistemaDeCadastroPet.services.CadastrarPet;

import java.util.Scanner;

public class SistemaDeCadastroTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opcao = menu();
        if (opcao <= 0) {
            opcao = menu();
        }
        if (opcao == 1) {
            CadastrarPet.cadastrarPet();
        }



    }

    public static int menu() {
        Scanner tc = new Scanner(System.in);
        System.out.println("[1] Cadastrar um novo pet");
        System.out.println("[2] Alterar os dados do pet cadastrado");
        System.out.println("[3] Deletar um pet cadastrado");
        System.out.println("[4] Listar todos os pets cadastrados");
        System.out.println("[5] Listar pets por algum critério (idade, nome, raça)");
        System.out.println("[6] Sair");
        return tc.nextInt();
    }


}
