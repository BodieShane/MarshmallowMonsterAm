package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;

import java.util.Scanner;
public class MonsterController
{
	private MarshmallowMonster bodieMonster;
	private MarshmallowMonster userMonster;
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
		bodieMonster.toString();
		myOutput.displayMonsterGUI(bodieMonster.toString());
		makeUserMonster();
		//askQuestions();
		myOutput.displayMonsterGUI(" New Monste Info " + userMonster.toString());
	}
	
	
	private void askQuestions()
	{
		System.out.println(" Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		bodieMonster.setMonstername(betterMonsterName);
		
		System.out.println(" Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		bodieMonster. setMosterEyes(betterMonsterEyes);
		
		System.out.println( "Type in a diferent number of legs for the monste");
		double betterMonsterlegs = monsterScanner .nextDouble();
		bodieMonster. setmonsterLegs(betterMonsterlegs);
		
	}
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get Variables
		String username;
		int usereyes;
		double userlegs;
		double userHair;
		int userNoseCount;
		boolean userBellyButton;
		
		//Step two: Define variables by using scanner to get user input
		System.out.println("type in your name for your monster.");
		username = monsterScanner.next();
		System.out.println(" Type in the number of eyes for your monster");
		usereyes = monsterScanner.nextInt();
		System.out.println("type in the number"
				+ " noses for this monster");
		userNoseCount       =     monsterScanner.nextInt();
		System.out.println("How much hair dose your monster have? Type in a floating point or decimal number");
		userHair = monsterScanner.nextDouble();
		System.out.println(" How meney legs??????");
		userlegs=monsterScanner.nextDouble();
		System.out.println("Dose it have a bellybutton? Type true or false");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: make a monster - use tConstructor!!! Remember that the order of parameters matters!
		
		userMonster=new MarshmallowMonster (username, usereyes, userNoseCount, userlegs, userHair, userBellyButton);
	}
}


	


