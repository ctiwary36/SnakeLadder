public class SnakeLadder{

	public static void main(String[] args){
		int Player1Position = 0;
		int count = 0;
		System.out.println("Welcome to Snake and Ladder game");
		
		System.out.println("Game begins Player Position is: "+Player1Position);
	while(Player1Position<=99){
	
		System.out.println("Player1Position is " + Player1Position);
		int dice=(int) (Math.random() * 10) % 6+1;
		count =(count + 1);
		Player1Position = (Player1Position + dice);
		System.out.println("dice value is " + dice);

		int opt=(int) (Math.random() * 10) % 3+1;
		switch(opt) {
			case 1:
				System.out.println( "No Play You are in the same Position " +Player1Position );
				break;
	  
			case 2:
				Player1Position = (Player1Position + dice);
				  if(Player1Position>100){
					Player1Position = (Player1Position - dice);
					continue;
				}
				System.out.println( "your Position after ladder is :" + Player1Position );
				break;
	   
			case 3: 
			Player1Position = (Player1Position - dice);
	  	  
	  if(Player1Position<0){
		  Player1Position = 0;
	  }
	  
		 System.out.println( "Your Position after snake is " + Player1Position );
	   break;
	   }
	    }
		System.out.println( "Dice play number " + count );
		
		 }
		  }