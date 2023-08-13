public class Combustivel {
    // Atributos
    private String tipo;
    private String nome;
    private boolean inspecaoRealizada;
    private double preco;
    private double quantidade;
    private String marca;
    private double volume;

    // Métodos
    public String voar(Combustivel gasPropano) {
        return "voando com " + gasPropano;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInspecaoRealizada() {
        return inspecaoRealizada;
    }

    public void setInspecaoRealizada(boolean inspecaoRealizada) {
        this.inspecaoRealizada = inspecaoRealizada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}