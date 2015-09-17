package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;
import java.util.Scanner;
public class MonsterController
{
	private MarshmallowMonster bodieMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 2;
		double hair = 1;
		int nose = 3;
		boolean hasBellyButton= true;
		String name = "The thing under your bed";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		bodieMonster = new MarshmallowMonster( name,eyes,nose,hair,legs,hasBellyButton);
	}
	public void start()

	{
		myOutput.deisplayMonsterInfo(bodieMonster.toString());
		askQuestions();
		myOutput.deisplayMonsterInfo(" New Monste Info " + bodieMonster.toString());
	}
	
	
	private void askQuestions()
	{
		System.out.println(" Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		bodieMonster.setMonstername(betterMonsterName);
		System.out.println(" Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		bodieMonster. setMosterEyes(betterMonsterEyes);
	}
}


	


