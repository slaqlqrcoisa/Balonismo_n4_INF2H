public class Balao {
    private int capacidade;
    private int ID;
    private int reg_regularidade;
    
    // Métodos
    public String voar(Combustivel gasPropano) {
        return "voando com " + gasPropano;
    }
    
    // Getter e Setter
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRegRegularidade() {
        return reg_regularidade;
    }

    public void setRegRegularidade(int reg_regularidade) {
        this.reg_regularidade = reg_regularidade;
    }
}

