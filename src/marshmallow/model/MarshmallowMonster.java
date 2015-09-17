package marshmallow.model;

public class MarshmallowMonster
{

	private String monsterName;
	private int monsterEyes;
	private int monsterNose;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterbBellyButton;
	private int monsterNoses;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monstrHair, double monsterlegs, boolean monsterBellyButton)

	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses= monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	
	}
	//Getter and Setters
	public String getMonstername()
	{
		return getMonstername();
		
	}
		public void setmonsterBellyButton(boolean monsterBellyButton)
		{
			this.monsterBellyButton= monsterBellyButton;
		}
	
		public void setmonsterHair(double monsterHair)
		{
			this.monsterHair= monsterHair;
		}
	
		public void setmonsterLegs(double monsterLegs)
		{
			this.monsterLegs= monsterLegs;
		}
	
		public void setmonsterNoses(int monsterNose)
		{
			this.monsterNoses= monsterNose;
		}
	
		public void setMosterEyes(int MoserEyes)
		{
			this.monsterEyes= MoserEyes;
		}
		
		
		public int getMosterEyes()
		
		{
			return monsterEyes;
		}
		public int getmonsterNose()
		{
			return monsterNoses;
		}
		
		public void setMonstername(String monsterName)
		{
			this.monsterName = monsterName;
		}
		
		public double monsterHair()
		{
			return monsterHair;
		}
		
		public double monsterLegs()
		{
			return monsterLegs;
		}
		
		public boolean monsterbBellyButton()
		{
			return monsterbBellyButton;
		}
		
		public int monsterNoses()
		{
			return monsterNoses;
		}
		public boolean monsterBellyButton()
		{
			return monsterBellyButton;
		}
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes and It's name is " + monsterName + " I have " + monsterNoses + " noses's and" + monsterLegs + "Legs";
		
				
		return monster;
	}
}
