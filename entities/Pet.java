package SistemaDeCadastroPet.entities;

import SistemaDeCadastroPet.enums.Sexo;
import SistemaDeCadastroPet.enums.TipoDeAnimal;
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
        for (Pet pet : pets) {
            System.out.println(pet);
        }

    }

    public static void deletarPet(String nome) {
        for (Pet pet : pets) {
            if (pet.nome.equalsIgnoreCase(nome)) {
                pets.remove(pet);
            }
        }
    }

    public static void buscarPorFiltro() {
        ProcurarPets.buscarPorFiltro(pets);

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
}
