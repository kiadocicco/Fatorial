import java.util.Scanner;

public class FatNum {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Digite um número");
		int num=teclado.nextInt();
		int matrizi[]=new int[num];
		int calcula=1;
		for(int i=0; i<num; i++) {
			int a=i+1;
			matrizi[i]= a;
			System.out.println(matrizi[i]);
			
		}
		for(int i=0; i<matrizi.length; i++) {
		calcula=matrizi[i]*calcula;
		}
		System.out.println(calcula);
}}

