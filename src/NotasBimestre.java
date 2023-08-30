import java.util.*;



public class NotasBimestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("Que saber se tá na boa com suas notas esse bimestre? Fala ai a primeira nota e clica em ENTER : ");
		nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda : ");
		nota2 = scan.nextDouble();
		
		System.out.println("Informe a terceira : ");
		nota3 = scan.nextDouble();
		
		System.out.println("Informe a quarta : ");
		nota4 = scan.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("Sua media é : " + media);
		
		}

}
