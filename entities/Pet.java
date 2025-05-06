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
    private Integer idade;
    private Double peso;
    private String raca;
    private static List<Pet> pets = new ArrayList<>();

    public Pet() {
    }

    public Pet(String nome, TipoDeAnimal tipoDeAnimal, Sexo sexo, String endereco, int idade, double peso, String raca) {
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

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
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
               +idade + " anos - "
               +peso + "Kg - "
               +raca + "\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
