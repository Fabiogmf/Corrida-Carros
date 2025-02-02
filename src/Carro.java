public class Carro {
    String marca;
    double velocidade;
    static String vencedor; //Static para ser um vencedor global, para toda a classe


    public Carro (String marca, double velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public double correr() {
        double distancia = 100;
        double variacao = Math.random() * 10;  // Variação aleatória até 10 segundosp+
        return (distancia / velocidade) * variacao;
    }
}

