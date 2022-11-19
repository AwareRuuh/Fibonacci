import java.util.Scanner;

class Main {
 static boolean isPerfectSquare(int x) {
  
    int s = (int)Math.sqrt(x);
    return ( s * s == x); 
    }
  static boolean isFibonacci(int num1) 
    {
    return isPerfectSquare(5 * num1 * num1 + 4) || isPerfectSquare(5 * num1 * num1 - 4);
    }
  public static void main(String[] args)
  {
    Scanner sc1 = new Scanner (System.in);
    int num1;

    System.out.print("Insira um número para verificar se ele pertence a sequência de Fibonnacci: ");
    num1 = sc1.nextInt(); 
    for (int i = 0; i <= num1; i++)
      System.out.println(isFibonacci(i) ? i + " é um número fibonnacci!"
                        : i + " não é um número fibonnacci.");
  }
}