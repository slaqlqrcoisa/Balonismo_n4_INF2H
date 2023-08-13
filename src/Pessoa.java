public class Pessoa {
    
    private String nome;
    private String CPF;
    private String RG;
    private String telefone;
    private String telefoneFamiliar;
    private int assinaturaTermo;
    private String endereço;
    
    // Constructor
    public Pessoa(String nome, String CPF, String RG, String telefone, String telefoneFamiliar,
                  int assinaturaTermo, String endereço) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
        this.telefoneFamiliar = telefoneFamiliar;
        this.assinaturaTermo = assinaturaTermo;
        this.endereço = endereço;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public String getRG() {
        return RG;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getTelefoneFamiliar() {
        return telefoneFamiliar;
    }
    
    public int getAssinaturaTermo() {
        return assinaturaTermo;
    }
    
    public String getEndereço() {
        return endereço;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setTelefoneFamiliar(String telefoneFamiliar) {
        this.telefoneFamiliar = telefoneFamiliar;
    }
    
    public void setAssinaturaTermo(int assinaturaTermo) {
        this.assinaturaTermo = assinaturaTermo;
    }
    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
