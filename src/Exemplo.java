import com.artur.service.Frete;
import com.artur.service.TipoFrete;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Informe a distância: ");
            int distancia = entrada.nextInt();

            System.out.println("Qual o tipo de frete (1) Normal, (2) Sedex: ");
            int opcao = entrada.nextInt();

            TipoFrete tipoFrete = TipoFrete.values()[opcao - 1];

            Frete frete = new Frete(tipoFrete);
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$%.2f", preco);
        }
    }
}
