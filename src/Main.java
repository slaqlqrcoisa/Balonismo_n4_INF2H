public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", "834.346.213-22", "54.156.324-5", "(11) 3463-2346", "(11) 5686-2463", 1, "Brigadeiro Jordão");
        Pessoa p2 = new Pessoa("Rogério", "436.658.325-19", "25.346.346-6", "(11) 3453-6347", "(11) 4574-3463", 1, "Jardim Belval");
        Piloto plt1 = new Piloto("Marcia", "323.455.568-64", "63.236.567-9", "(11) 4754-6793", "(11) 5684-3425", "Gonçalves Dias", 33);
        Balao b1 = new Balao();
       
        b1.setCapacidade(4);
        b1.setID(2);
        b1.setRegRegularidade(1);

        String resposta = b1.voar(new Combustivel());

        System.out.println(resposta);
    }
}
