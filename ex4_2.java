import java.util.Scanner;
public class ex4_2 {
	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		double sens;
		System.out.println("Entrer sens : ");
		sens=clavier.nextDouble();
		double S=0;
		double n=0;
		while(S+sens<=(((Math.PI)*(Math.PI))/6)){
			n=n+1;
			S=S+(1/(n*n));
		}
		System.out.println("La somme S est égal à pi^² sur 6 à " + sens + "près au bout de " + n + "repetition");			
		
	}
}
