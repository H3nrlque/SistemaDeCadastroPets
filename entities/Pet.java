package SistemaDeCadastroPet.entities;

import SistemaDeCadastroPet.enums.Sexo;
import SistemaDeCadastroPet.enums.TipoDeAnimal;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String nome;
    private TipoDeAnimal tipoDeAnimal;
    private Sexo sexo;
    private String endereco;
    private int idade;
    private double peso;
    private String raca;
    private List<Pet> pets = new ArrayList<>();

    public Pet(String nome, TipoDeAnimal tipoDeAnimal, Sexo sexo, String endereco, int idade, double peso, String raca) {
        this.nome = nome;
        this.tipoDeAnimal = tipoDeAnimal;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public void adicionarPet(Pet pet) {
        if (!pets.contains(pet)) {
            pets.add(pet);
        }
    }

    public void deletarPet() {

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
}
