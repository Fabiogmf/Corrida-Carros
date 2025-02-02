import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcao;

        Carro carro1 = new Carro("MBW", 200);
        Carro carro2 = new Carro("Audi", 180);
        Carro carro3 = new Carro("Chevrolet", 210);
        Carro carro4 = new Carro("Dacia", 170);
        Carro carro5 = new Carro("Hyundai", 190);

        System.out.println("Seja Bem Vindo ao Jogo da corrida!");
        System.out.println("Escolha o teu dentre as opções e torça para que ele seja o mais rápido.\nQual carro deve se sair melhor na corrida?");
        System.out.println("1- MBW");
        System.out.println("2- Audi");
        System.out.println("3- ChevroletW");
        System.out.println("4- Dacia");
        System.out.println("5- Hyundai");
        System.out.println("Escolha o número dentre os carros que você acha que vence a corrida:");
        opcao = in.nextInt();

        double tempoCarro1 = carro1.correr();
        double tempoCarro2 = carro2.correr();
        double tempoCarro3 = carro3.correr();
        double tempoCarro4 = carro4.correr();
        double tempoCarro5 = carro5.correr();

        if (tempoCarro1 < tempoCarro2 && tempoCarro1 < tempoCarro3 && tempoCarro1 < tempoCarro4 && tempoCarro1 < tempoCarro5) {
            Carro.vencedor = carro1.marca;
        }
        else if (tempoCarro2 < tempoCarro1 && tempoCarro2 < tempoCarro3 && tempoCarro2 < tempoCarro4 && tempoCarro2 < tempoCarro5) {
            Carro.vencedor = carro2.marca;
        }
        else if (tempoCarro3 < tempoCarro1 && tempoCarro3 < tempoCarro2 && tempoCarro3 < tempoCarro4 && tempoCarro3 < tempoCarro5) {
            Carro.vencedor = carro3.marca;
        }
        else if (tempoCarro4 < tempoCarro1 && tempoCarro4 < tempoCarro2 && tempoCarro4 < tempoCarro3 && tempoCarro4 < tempoCarro5) {
            Carro.vencedor = carro4.marca;
        }
        else {
            Carro.vencedor = carro5.marca;
        }

        System.out.println("\nResultado da corrida:");
        System.out.println("MBW: " + tempoCarro1 + " segundos");
        System.out.println("Audi: " + tempoCarro2 + " segundos");
        System.out.println("Chevrolet: " + tempoCarro3 + " segundos");
        System.out.println("Dacia: " + tempoCarro4 + " segundos");
        System.out.println("Hyundai: " + tempoCarro5 + " segundos");

        System.out.println("\nO carro vencedor é: " + Carro.vencedor);

        if ((opcao == 1 && Carro.vencedor.equals("MBW")) ||
                (opcao == 2 && Carro.vencedor.equals("Audi")) ||
                (opcao == 3 && Carro.vencedor.equals("Chevrolet")) ||
                (opcao == 4 && Carro.vencedor.equals("Dacia")) ||
                (opcao == 5 && Carro.vencedor.equals("Hyundai"))) {
            System.out.println("Parabéns! Você acertou o carro vencedor!");
        } else {
            System.out.println("Que pena! O carro que você escolheu não venceu.");
        }

    }
}