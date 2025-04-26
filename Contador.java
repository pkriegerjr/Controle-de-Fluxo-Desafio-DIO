import java.util.Scanner;
public class Contador {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 numeros o Primeiro tem que ser Menor que o Segundo para subtração");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Validar(y, x);
		int z = y - x;
		for (int i = 1; i <= z; i++)
		System.out.println(i);
		try {
			int a = 9 - 10;
			}
		catch (IllegalArgumentException ParametrosInvalidosException) {
			System.out.println("Erro" + ParametrosInvalidosException.getMessage());
		}
		finally {
		sc.close();	
		}
	}
	public static void Validar(int y, int x) {
        if (y < x) {
            throw new IllegalArgumentException("Primeiro numero é maior que o Segundo");
        }
	}
}
