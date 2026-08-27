import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numeros1 = scanner.nextInt();
        int numeros2 = scanner.nextInt();

        int diferenca = numeros2 - numeros1;

        try {


            if (numeros2 < numeros1) {
                throw new ParametrosInvalidosException("Os parâmetros informados são inválidos: o segundo parâmetro deve ser maior que o primeiro.");

            }

            for (int i = 1; i <= diferenca; i++) {
                System.out.println("imprimindo o número: " + i);
            }

        }catch (ParametrosInvalidosException e){

            System.out.println(e.getMessage());

        }

    }
}
