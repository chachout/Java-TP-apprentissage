public class Ex5 {
	public static void main(String[] args) 
	{
		double b=puissance(2.,0);
		System.out.println(b);
		int c=factorielle(0);
		System.out.println(c);
		double a=exponentielle(3);
		System.out.println(a);
	}
	public static int factorielle(int z)
	{
		int s=1;
		for(int j=0;j<z;j++)
		{
			s=s*(z-j);
		}
		return s;
	}
	public static double puissance(double y, int x)
	{
		double u=1;
		for(int i=0;i<x;i++)
		{
			u=u*y;
		}
		return u;
	}
	public static double exponentielle(double w)
	{
		double t=0;
		int k=0;
		while ((puissance(w,k)/factorielle(k))>0.000001)
		{
			t=t+(puissance(w,k)/factorielle(k));
			k=k+1;
		}
		return t;
	}
}