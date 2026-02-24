import com.OrientacaoObjeto.entity.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Quantidade = 0;
        int soma = 0;

        do{
            System.out.println("Quantos carros você deseja adicionar? (Limite de 50 carros)");
            Quantidade = input.nextInt();
            input.nextLine();

        }while(Quantidade > 50);

        Carro[] carros = new Carro[Quantidade];

        for(int i = 0; i < Quantidade; i++) {
            Carro carro = new Carro();
            System.out.println("Digite o modelo do carro " + (i + 1) + ": ");
            carro.modelo = input.nextLine();
            System.out.println("Digite o valor do carro " + (i + 1) + ": ");
            carro.valor = input.nextInt();
            input.nextLine();

            carros[i] = carro;
        }

        for(int i = 0; i < Quantidade; i++) {
            System.out.println(carros[i].modelo + " " + carros[i].valor);
            soma += carros[i].valor;
        }
        System.out.println("Quantidade de carros: " + carros.length);
        System.out.println("Soma dos valores: " + soma);
    }

}