public class Main {
    public static void main(String[] args) {
       
        Pessoa p1;
        Pessoa p2;
        Piloto plt1;
        Balao b1;
        
        p1 = new Pessoa();
        p2 = new Pessoa();
        plt1 = new Piloto();
        b1 = new Balao();
       
        p1.nome = "Carlos";
        p1.CPF = "834.346.213-22";
        p1.RG = "54.156.324-5";
        p1.telefone = "(11) 3463-2346";
        p1.telefoneFamiliar = "(11) 5686-2463";
        p1.assinaturaTermo = 1;
        p1.endereço = "Brigadeiro Jordão";

        p2.nome = "Rogério";
        p2.CPF = "436.658.325-19";
        p2.RG = "25.346.346-6";
        p2.telefone = "(11) 3453-6347";
        p2.telefoneFamiliar = "(11) 4574-3463";
        p1.assinaturaTermo = 1;
        p2.endereço = "Jardim Belval";

        plt1.nome = "Marcia";
        plt1.CPF = "323.455.568-64";
        plt1.RG = "63.236.567-9";
        plt1.telefone = "(11) 4754-6793";
        plt1.telefoneFamiliar = "(11) 5684-3425";
        plt1.endereço = "Gonçalves Dias";
        plt1.num_reg_anac = 033;

        b1.capacidade = 4;
        b1.ID = 02;
        b1.reg_regularidade = 01;

        String resposta = b1.voar(new Combustivel());

        System.out.println(resposta);
} }