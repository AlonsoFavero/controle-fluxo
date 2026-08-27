import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException{

        Scanner scanner = new Scanner(System.in);

        int numeros1 = scanner.nextInt();
        int numeros2 = scanner.nextInt();

        int diferenca = numeros2 - numeros1;

        if (numeros2 < numeros1){
            throw new ParametrosInvalidosException("Os parâmetros informados são inválidos: o segundo parâmetro deve ser maior que o primeiro.");

        }

        for (int i = 1; i <= diferenca; i++){
            System.out.println("imprimindo o número: " + i );
        }

    }
}
