public class Task
{
	public String description;
	public boolean completed=false;
	public Task(String desc)
	{
			description=desc;
	}
	public void complete()
	{
		completed=true;
	}
	public void affiche()
	{
		System.out.println(description+ " "+completed);
	}
}