public class Ex2 
{
	public static void main(String[] args) 
	{
		Compte c1=new Compte(1,"Dupond",1500);
		Compte c2=new Compte(2,"Martin",500);
		c1.affiche();
		c2.affiche();
		c1.crediter(200);
		c1.affiche();
		c2.debiter(800);
		c2.affiche();
		c2.virer(c1,300);
		c1.affiche();
		c2.affiche();
	}
}
