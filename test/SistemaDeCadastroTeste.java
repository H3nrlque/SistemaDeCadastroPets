package SistemaDeCadastroPet.test;

import SistemaDeCadastroPet.entities.Pet;
import SistemaDeCadastroPet.services.CadastrarPet;

import java.util.Scanner;

public class SistemaDeCadastroTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opcao;
        do {
            opcao = menu();
            if (opcao <= 0) {
                opcao = menu();
            }
            switch (opcao) {
                case 1:
                    CadastrarPet.cadastrarPet();
                    break;
                case 2:
                    Pet.alteraPet();
                    break;
                case 3:
                    System.out.print("Por quantos critérios você deseja buscar[Max 2]? ");
                    int qua = tc.nextInt();
                    switch (qua) {
                        case 1:
                            Pet.buscarPorFiltro();
                            Pet.deletarPet();
                            break;
                        case 2:
                            Pet.buscarPor2Filtros();
                            Pet.deletarPet();
                            break;
                    }
                    break;
                case 4:
                    Pet.listarTodosOsPets();
                    break;
                case 5:
                    System.out.print("Por quantos critérios você deseja buscar[Max 2]?");
                    int q = tc.nextInt();
                    switch (q) {
                        case 1:
                            Pet.buscarPorFiltro();
                            break;
                        case 2:
                            Pet.buscarPor2Filtros();
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    opcao = menu();
            }
        } while (opcao != 6);
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
