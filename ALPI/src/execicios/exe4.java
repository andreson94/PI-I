package execicios;

import java.util.Scanner;
/*Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos.*/
public class exe4 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6,soma,media,i = 0;
        n1 = as.nextInt();
        n2 = as.nextInt();
        n3 = as.nextInt();
        n4 = as.nextInt();
        n5 = as.nextInt();
        n6 = as.nextInt();

        while ( i <= 6){
            soma = n1 + n2 + n3 + n4 + n5 + n6;
            System.out.println("soma: " + soma);
            
        }

    }
}
