public class Polynome 
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
}
