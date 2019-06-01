public class Complexe 
{
	public double réel;
	public double imagi;
	public double module;
	public double argument;
	public Complexe(double a, double b)
	{
		réel=a;
		imagi=b;
	}
	public double module()
	{
		return module=Math.sqrt(réel*réel+imagi*imagi);
	}
	public void affiche()
	{
		System.out.println(réel+" "+imagi);
	}
	public double argument()
	{
		 return argument=Math.atan(imagi/réel);
	}
	public Complexe somme(Complexe d)
	{
		double z=(this.réel+d.réel);
		double y=(this.imagi+d.imagi);
		Complexe h=new Complexe(z,y);
		return h ;
	}
	public Complexe produit(Complexe c)
	{
		double x=(this.réel*c.réel-this.imagi*c.imagi);
		double w=(this.réel*c.imagi+this.imagi*c.réel);
		Complexe i=new Complexe(x,w);
		return i;
	}
	public Complexe carre()
	{
		Complexe j=this.produit(this);
		return j;
	}
	public void egalite(Complexe e)
	{
		if (this.réel==e.réel && this.imagi==e.imagi)
		{
			System.out.println("Les complexes sont égaux");
		}
		else 
		{
			System.out.println("Les complexes ne sont pas égaux");
		}
	}
}
