public class Client 
{
	public int age;
	public String ville;
	public String cp;
	public String rue;
	public String numrue;
	public String telephone;
	public String profession;
	public String nom;
	public Client(int a, String v,String c, String r, String n,String t,String p, String W)
	{
		age=a;
		ville=v;
		cp=c;
		rue=r;
		numrue=n;
		telephone=t;
		profession=W;
		nom=p;
	}
	public void affichecli()
	{
		System.out.println(nom+","+age+","+profession+","+telephone+","+ville+","+cp+","+rue+","+numrue);
	}
}
