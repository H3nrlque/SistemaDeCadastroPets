package SistemaDeCadastroPet.entities;

import SistemaDeCadastroPet.enums.Sexo;
import SistemaDeCadastroPet.enums.TipoDeAnimal;
import SistemaDeCadastroPet.services.AlterandoDados;
import SistemaDeCadastroPet.services.DeletandoPet;
import SistemaDeCadastroPet.services.ProcurarPets;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String nome;
    private TipoDeAnimal tipoDeAnimal;
    private Sexo sexo;
    private String endereco;
    private String idade;
    private String peso;
    private String raca;
    public static final String nao = "Não Informado";
    private static List<Pet> pets = new ArrayList<>();

    public Pet() {
    }

    public Pet(String nome, TipoDeAnimal tipoDeAnimal, Sexo sexo, String endereco, String idade, String peso, String raca) {

        if (nome.trim().isEmpty() && idade.trim().isEmpty() && peso.trim().isEmpty() && raca.trim().isEmpty()) {
            nome = Pet.nao;
            idade = Pet.nao;
            peso = Pet.nao;
            raca = Pet.nao;
        }
        this.nome = nome;
        this.tipoDeAnimal = tipoDeAnimal;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public static void adicionarPet(Pet pet) {
        if (!pets.contains(pet)) {
            pets.add(pet);
        }
    }

    public static void listarTodosOsPets() {
        ProcurarPets.listarTodosOsPets(pets);
    }


    public static void buscarPorFiltro() {
         ProcurarPets.buscarPorFiltro(pets);
    }

    public static void buscarPor2Filtros() {
        ProcurarPets.buscarPor2Filtros(pets);
    }

    public static void alteraPet() {
        buscarPorFiltro();
        AlterandoDados.alterando(pets);

    }

    public static void deletarPet() {
        DeletandoPet.deletando(pets);

    }

    public static void setPets(List<Pet> pets) {
        Pet.pets = pets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeAnimal getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return nome+" - "
               +tipoDeAnimal.toString() + " - "
               +sexo.toString() + " - "
               +endereco + " - "
               +idade + " - "
               +peso + " - "
               +raca + "\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
