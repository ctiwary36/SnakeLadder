public class SnakeLadder{

	public static void main(String[] args){
	
		System.out.println("Welcome to Snake and Ladder game");
		
		int PlayerPosition = 0;
		
		System.out.println("Game begins Player Position is: "+PlayerPosition);
		DiceThrow();
	}
	public static void DiceThrow(){
		int Dice = (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("You got Dice Value "+Dice);

	}
}
