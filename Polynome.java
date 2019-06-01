public class Polynome 
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
}
