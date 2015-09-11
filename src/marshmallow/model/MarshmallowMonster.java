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
}
