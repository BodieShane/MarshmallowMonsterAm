package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;
public class MonsterController
{
	private MarshmallowMonster bodieMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 2;
		double hair = 1;
		int nose = 3;
		boolean hasBellyButton= true;
		String name = "Not the same as mine";
		
		myOutput = new MarshmallowOutput();
		bodieMonster = new MarshmallowMonster( name,eyes,nose,hair,legs,hasBellyButton);
	}
	public void start()

	{
		yOutput.displayMonsterInfo(bodieMonster);
	}
}
	


