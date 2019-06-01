public class Compte {
	private int numero;
	public String proprietaire;
	private float solde;
	public static int nbcompte=0;
	public Compte( float soldeInitial, Client a)
	{
		nbcompte=nbcompte+1;
		this.numero=nbcompte;
		this.proprietaire=a.nom;
		this.solde=soldeInitial;
	}
	public void affichecom()
	{
		System.out.println(numero + ","+this.proprietaire+","+this.solde);
	}
	public void debiter(float montant)
	{
		if (this.solde<0)
		{
			System.out.println("opération interdite, solde négatif");
		}
		else 
		{
			this.solde=this.solde-montant;
		}
	}
	public void crediter(float montant)
	{
		this.solde=this.solde+montant;
	}
	public void virer(Compte cible, float montant)
	{
		this.debiter(montant);
		this.crediter(montant);
	}
}
