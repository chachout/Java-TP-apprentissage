public class Ex3 
{
	public static void main(String[] args) 
	{
		Complexe z1=new Complexe(1,2);
		Complexe z2=new Complexe(-1,-2);
		Complexe zp;
		z1.affiche();
		z2.affiche();
		zp=z1.somme(z2);
		zp.affiche();
		zp=z1.carre();
		zp.affiche();
		Complexe z3=new Complexe(1,1);
		z3.affiche();
		System.out.println("module "+z3.module());
		System.out.println("argument "+z3.argument());
	}
}
