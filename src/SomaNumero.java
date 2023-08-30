import java.util.*;


public class SomaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos somar, digite o primeiro numero :");
		int numero1 = scan.nextInt();
		
		System.out.println("Boa, agora digita o segundo numero :");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("Legal, o resultado da soma dos numeros informados são : " + resultado);
				

	}

}
