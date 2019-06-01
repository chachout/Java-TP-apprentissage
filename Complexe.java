public class Complexe 
{
	public double r�el;
	public double imagi;
	public double module;
	public double argument;
	public Complexe(double a, double b)
	{
		r�el=a;
		imagi=b;
	}
	public double module()
	{
		return module=Math.sqrt(r�el*r�el+imagi*imagi);
	}
	public void affiche()
	{
		System.out.println(r�el+" "+imagi);
	}
	public double argument()
	{
		 return argument=Math.atan(imagi/r�el);
	}
	public Complexe somme(Complexe d)
	{
		double z=(this.r�el+d.r�el);
		double y=(this.imagi+d.imagi);
		Complexe h=new Complexe(z,y);
		return h ;
	}
	public Complexe produit(Complexe c)
	{
		double x=(this.r�el*c.r�el-this.imagi*c.imagi);
		double w=(this.r�el*c.imagi+this.imagi*c.r�el);
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
		if (this.r�el==e.r�el && this.imagi==e.imagi)
		{
			System.out.println("Les complexes sont �gaux");
		}
		else 
		{
			System.out.println("Les complexes ne sont pas �gaux");
		}
	}
}
