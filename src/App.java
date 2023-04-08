import java.util.Scanner;

 public class App {
    
     // Início do Programa
     public static void main(String[] args) throws Exception { 

      //Declaração de Variaveis
      int n1;
      int n2;
      double n3;
      double prod;
      double soma;
      double cubo;

      // Solicitação de Dados
      Scanner teclado = new Scanner (System.in);
      System.out.println ("Digite o primeiro número inteiro:" );
      n1 = teclado.nextInt();
      System.out.println ("Digite o segundo número inteiro: " );
      n2 = teclado.nextInt();
      System.out.println ("Digite o número real: " );
      n3 = teclado.nextDouble();
      teclado.close();

      // Calcular o produto do dobro do primeiro com metade do segundo
      prod = (2 * n1) * (n2 / 2.0);

      // Calcular a somo do tripo do primeiro com o terceiro
      soma = (3 * n1) + n3;

      // Calcular o terceiro elevado ao cubo 
      cubo = Math.pow (n3 , 3);
       
      // Exibir os resultados
      System.out.println ("O produto do dobro do primeiro com metade do segundo é: " + prod);
      System.out.println ("A soma do triplo do primeiro com o terceiro é: " + soma);
      System.out.println ("O terceiro elevado ao cubo é: " + cubo);
    }
}
