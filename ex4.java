import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n;
		System.out.println("Entrer n : ");
		n=clavier.nextInt();
		double s=0;
		for (double i=1;i<=n;i++){
			s=s+(1/(i*i));
		}
		System.out.println("La somme S est égal à " + s);			
		
	}
}
