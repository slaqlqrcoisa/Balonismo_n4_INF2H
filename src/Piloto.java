class Piloto extends Pessoa {
    private int num_reg_anac;
    
    public Piloto(String nome, String CPF, String RG, String telefone, String telefoneFamiliar,
                  String endereco, int num_reg_anac) {
        super(nome, CPF, RG, telefone, telefoneFamiliar, 1, endereco); 
        this.num_reg_anac = num_reg_anac;
    }
    
    // Getter e Setter
    public int getNum_reg_anac() {
        return num_reg_anac;
    }
    
    public void setNum_reg_anac(int num_reg_anac) {
        this.num_reg_anac = num_reg_anac;
    }
}
