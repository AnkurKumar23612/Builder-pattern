package temp;



public class Leopard {

	String color;
	String gender;
	public Leopard(builder r)
	{
		this.color=r.color;
		this.gender=r.gender;
		
	}
   
	public void print()
	{
		System.out.println(this.color);
		System.out.println(this.gender);
	}
	
	
	
	
	static class builder{
		
		String color;
		String gender;
		
		public builder(String color)
		{
			this.color=color;
		}

		public builder setColor(String color)
		
		{
			//super.fly();
			
			this.color=color;
			return this;
			
		}
		
	public builder setGender(String gender)
		
		{
			//super.fly();
			
			this.gender=gender;
			return this;
			
		}

	public Leopard build()
	{
		Leopard n=new Leopard(this);
		return n;
	}
		
	}


}
