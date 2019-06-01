public class Ex1 
{
	public static void main(String[] args) 
	{
		Client p=new Client(33,"Bruz","35170","rue de la rabine","30","07 54 65 66 95","Cahuzac","dentiste");
		Compte c=new Compte(22000,p);
		p.affichecli();
		c.affichecom();
	}
}