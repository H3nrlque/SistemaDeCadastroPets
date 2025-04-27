package SistemaDeCadastroPet.enums;

public enum TipoDeAnimal {
    Cachorro("Cachorro"),
    Gato("Gato");

    private String tipoDeAnimal;

    TipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public static TipoDeAnimal procurar(String tipo) {
        for (TipoDeAnimal value : values()) {
            if (tipo.equalsIgnoreCase(String.valueOf(value))) {
                return value;
            }
        }
        return null;
    }
}
