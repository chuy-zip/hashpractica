import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class main {
	
	public static void main(String[] args) {
		
		Stack<Videogame> myStack = new Stack();
		Queue<Videogame> myQueue = new LinkedList<Videogame>();
		Videogame[] myArray = new Videogame[100];
		HashMap<String, Videogame> mapGames = new HashMap<String, Videogame>();
		
		Random rand = new Random();
		String randID;
		
		for (int i = 0; i < 100; i++) {
			randID = "" + rand.nextInt(10000);
			Videogame game = new Videogame(randID); 
			
			myStack.push(game);
			myQueue.add(game);
			myArray[i] = game;
			mapGames.put(game.getID(), game);

		}
		
		
		
	}
}
