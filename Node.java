package temp;
import java.math.*;
import java.util.*;


  class Node{

		String color;
		String gender;
		public Node(rough3 r)
		{
			this.color=r.color;
			this.gender=r.gender;
			
		}
	   
		public void print()
		{
			System.out.println(this.color);
			System.out.println(this.gender);
		}
		
		
		
		
		static class rough3{
			
			String color;
			String gender;
			
			public rough3(String color)
			{
				this.color=color;
			}

			public rough3 color(String color)
			
			{
				//super.fly();
				
				this.color=color;
				return this;
				
			}
			
		public   rough3 gender(String gender)
			
			{
				//super.fly();
				
				this.gender=gender;
				return this;
				
			}

		public Node func()
		{
			Node n=new Node(this);
			return n;
		}
			
		}
	
	
    }