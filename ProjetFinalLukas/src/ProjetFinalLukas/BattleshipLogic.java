package ProjetFinalLukas;
import java.util.ArrayList;
import java.util.Scanner;

public class BattleshipLogic {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] coordinates=coordinateGenerator(6);
		ArrayList allColumnHits=new ArrayList<Integer>();
		ArrayList allRowHits=new ArrayList<Integer>();
		
		for(int i=0; i<coordinates.length; i++) {
			System.out.println(coordinates[i]);
		}
		int j=1;
		int hitCount=0;
		int row=0;
		int column=0;
		do {
			System.out.println("Guess #"+j);
		System.out.println("Guess where the ship is: ");
		System.out.print("Column: ");
		column=in.nextInt();
		System.out.println();
		System.out.print("Row: ");
		row=in.nextInt();
		
		if(hitOrMiss(column,row, coordinates, allColumnHits, allRowHits)) {
			hitCount++;
			hitAnimation(hitCount);
		}else {
			System.out.println("You missed");
			
		}
		
			//  ____________ ____________ ____________ ____________ ____________
			// | / / / / / /|            |            |            |            |
			// |/ / / / / / |            |            |            |            |
			// | / / / / / /|            |            |            |            |
			// |/ / / / / / |            |            |            |            |
			// |_/_/_/_/_/_/|____________|____________|____________|____________|
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |____________|____________|____________|____________|____________|
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |____________|____________|____________|____________|____________|
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |____________|____________|____________|____________|____________|
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |            |            |            |            |            |
			// |____________|____________|____________|____________|____________|
		
				//  ____________ ____________ ____________ ____________ ____________
				// |            | / / / / / /|            |            |            |
				// |            |/ / / / / / |            |            |            |
				// |            | / / / / / /|            |            |            |
				// |            |/ / / / / / |            |            |            |
				// |____________|/_/_/_/_/_/_|____________|____________|____________|
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |____________|____________|____________|____________|____________|
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |____________|____________|____________|____________|____________|
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |____________|____________|____________|____________|____________|
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |            |            |            |            |            |
				// |____________|____________|____________|____________|____________|
		
		
		j++;
		}while(j<10 && hitCount!=5);
		if(hitCount==5) {
			animationDeVictoire();
			System.exit(0);
		}else {
			gameOverAnimation(coordinates);
			System.exit(0);
		}
		
		
		   
		
	}public static boolean hitOrMiss(int column, int row, int[] coordinates, ArrayList<Integer> allColumnHits, ArrayList<Integer> allRowHits) {
		
		boolean hit=false;
		if(allRowHits.contains(row) && allColumnHits.contains(column)){

	for(int i=0; i<coordinates.length; i++) {
		if(allRowHits.get(i)==row && allColumnHits.get(i)==column) {
			hit=false;
			System.out.println("You already hit this square");
			return hit;
		}else {
			
		}
	}
		}
		else {
		if(column==coordinates[0]) {
			if(row==coordinates[1]) {
				hit=true;
			}else if(row==coordinates[2]) {
				hit=true;
			}else if(row==coordinates[3]){
				hit=true;
			}else if(row==coordinates[4]){
				hit=true;
			}else if(row==coordinates[5]) {
				hit=true;
			}
	}else {
		hit=false;
		
	}
		allColumnHits.add(column);
		allRowHits.add(row);
		return hit;
	}
		return false;
		
		
		
		
		
	}public static int[] coordinateGenerator(int sizeOfBoat) {
		int[] coordinates= new int[sizeOfBoat];
		coordinates[0]=Integer.parseInt(String.valueOf(Math.round(Math.random())));
		coordinates[1]=Integer.parseInt(String.valueOf(Math.round(Math.random())));
		for(int i=2; i<sizeOfBoat; i++) {
			coordinates[i]=coordinates[i-1]+1;
		}
		return coordinates;
	}public static void hitAnimation(int hitCount) {
		if(hitCount==1) {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                       /");
		System.out.println("                                      /_");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                      __");
		System.out.println("                                     /  ");
		System.out.println("                                    /___");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                    ____");
		System.out.println("                                   /    ");
		System.out.println("                                  /____/");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                  ____|_");
		System.out.println("                                 /    / ");
		System.out.println("                                /____/  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                ____|__ ");
		System.out.println("                               /    /   ");
		System.out.println("                              /____/    ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                               ____|__  ");
		System.out.println("                              /    /    ");
		System.out.println("                             /____/     ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                            ____|__     ");
		System.out.println("                           /    /       ");
		System.out.println("                          /____/        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                           ____|_       ");
		System.out.println("                          /    /        ");
		System.out.println("     ____________________/____/___      ");
		System.out.println("     \\                           /     ");
		System.out.println("      \\                         /      ");
		System.out.println("       \\_______________________/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		int i=0;
		do {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     ________________________/_*___     ");
		System.out.println("     \\                    \\     /     ");
		System.out.println("      \\                    /    /      ");
		System.out.println("       \\_______________________/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                      |    *   *        ");
		System.out.println("                       *      |    *    ");
		System.out.println("                           |    *       ");
		System.out.println("     ___________________*___ __|____    ");
		System.out.println("     \\                     \\    /     ");
		System.out.println("      \\                    /    /      ");
		System.out.println("       \\___________________\\____/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     ________________________/    _*___     ");
		System.out.println("     \\                       \\ \\    /     ");
		System.out.println("      \\                      /  /    /      ");
		System.out.println("       \\___________________\\  \\___/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                      |    *   *        ");
		System.out.println("                       *      |    *    ");
		System.out.println("                           |    *       ");
		System.out.println("     ___________________*____  |________  ");
		System.out.println("     \\                     \\  \\ /   /     ");
		System.out.println("      \\                    /   /     /");
		System.out.println("       \\___________________\\ \\____/       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		i++;
		}while(i<3);
		
		
		
		System.out.println("                 *             *        *");
		System.out.println("                    |               * | ");
		System.out.println("                 *     |        *       ");
		System.out.println("                             |          ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                      \\      __/\\     ");
		System.out.println("      \\                     /    __/   /   ");
		System.out.println("       \\____________________\\  /     / ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 *             *        ");
		System.out.println("                    |       |        *  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                        \\     ");
		System.out.println("      \\                       /     __/\\  ");
		System.out.println("       \\______________________\\   /   /   ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 |             /        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _____________________________      ");
		System.out.println("     \\                        \\     ");
		System.out.println("      \\                       /        ");
		System.out.println("       \\______________________\\    __/\\");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		for(int q=0; q<5; q++) {
			System.out.println();
		}
		System.out.println();
		System.out.println("YOU HIT A BATTLESHIP");
		
		}else if(hitCount==2) {
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     ___________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                      __");
			System.out.println("                                     /  ");
			System.out.println("                                    /___");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                    ____");
			System.out.println("                                   /    ");
			System.out.println("                                  /____/");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\       ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                   ____|");
			System.out.println("                                  /    /");
			System.out.println("                                 /____/ ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                  ____|_");
			System.out.println("                                 /    / ");
			System.out.println("                                /____/  ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                ____|__ ");
			System.out.println("                               /    /   ");
			System.out.println("                              /____/    ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                               ____|__  ");
			System.out.println("                              /    /    ");
			System.out.println("                             /____/     ");
			System.out.println("                                        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                            ____|__     ");
			System.out.println("                           /    /       ");
			System.out.println("                          /____/        ");
			System.out.println("     _____________________________      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                           ____|_       ");
			System.out.println("                          /    /        ");
			System.out.println("     ____________________/____/___      ");
			System.out.println("     \\                        \\     ");
			System.out.println("      \\                       /        ");
			System.out.println("       \\______________________\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			int k=0;
			int i = 0;
			do {
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                         *    *  /         ");
			System.out.println("                          /      /        ");
			System.out.println("     ________________________/_*___     ");
			System.out.println("     \\                 /       \\     ");
			System.out.println("      \\                \\       /        ");
			System.out.println("       \\_______________/_______\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                      |    *   *        ");
			System.out.println("                       *      |    *    ");
			System.out.println("                           |    *       ");
			System.out.println("     __________________*___   _____|    ");
			System.out.println("     \\                   /  /     \\     ");
			System.out.println("      \\                  \\ \\     /        ");
			System.out.println("       \\_________________/ /______\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                         *    *  /         ");
			System.out.println("                          /      /        ");
			System.out.println("     __________________*___       ");
			System.out.println("     \\                   /   _____     ");
			System.out.println("      \\                  \\ /     \\          ");
			System.out.println("       \\_________________/  \\_____\\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			
			
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                  |    *   *        ");
			System.out.println("                 *      |    *    ");
			System.out.println("                       |    *       ");
			System.out.println("     _______________*______|  ");
			System.out.println("     \\                   /        ");
			System.out.println("      \\                  \\  _____         ");
			System.out.println("       \\_________________/  /     \\       ");
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println();
			}
			i++;
			}while(i<3);
			
			
			
			System.out.println("                 *             *       *");
			System.out.println("                    |               * | ");
			System.out.println("                 *     |        *       ");
			System.out.println("                             |          ");
			System.out.println("                                        ");
			System.out.println("     _______________________            ");
			System.out.println("     \\                    /            ");
			System.out.println("      \\                   \\           ");
			System.out.println("       \\__________________/            ");
			
			try{
				Thread.sleep(200);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                 *             *        ");
			System.out.println("                    |       |        *  ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _______________________            ");
			System.out.println("     \\                    /            ");
			System.out.println("      \\                   \\           ");
			System.out.println("       \\__________________/            ");
			
			try{
				Thread.sleep(200);
			}catch(Exception e) {
				System.out.println();
			}
			System.out.println("                 |             /        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("                                        ");
			System.out.println("     _______________________            ");
			System.out.println("     \\                    /            ");
			System.out.println("      \\                   \\           ");
			System.out.println("       \\__________________/            ");
			
			
			try{
				Thread.sleep(200);
			}catch(Exception e) {
				System.out.println();
			}
			for(int q=0; q<5; q++) {
				System.out.println();
			}
			System.out.println();
			System.out.println("YOU HIT A BATTLESHIP");
		}
		else if(hitCount==2) {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                      __");
		System.out.println("                                     /  ");
		System.out.println("                                    /___");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                    ____");
		System.out.println("                                   /    ");
		System.out.println("                                  /____/");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                   ____|");
		System.out.println("                                  /    /");
		System.out.println("                                 /____/ ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                  ____|_");
		System.out.println("                                 /    / ");
		System.out.println("                                /____/  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                ____|__ ");
		System.out.println("                               /    /   ");
		System.out.println("                              /____/    ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                               ____|__  ");
		System.out.println("                              /    /    ");
		System.out.println("                             /____/     ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                           ____|__     ");
		System.out.println("                          /    /       ");
		System.out.println("                         /____/        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         ____|_       ");
		System.out.println("                        /    /        ");
		System.out.println("     __________________/____/___      ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		int k=0;
		int i = 0;
		do {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     __________________/____/__     ");
		System.out.println("     \\                 /      \\     ");
		System.out.println("      \\                \\      /        ");
		System.out.println("       \\_______________/______\\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                      |    *   *        ");
		System.out.println("                       *      |    *    ");
		System.out.println("                           |    *       ");
		System.out.println("     __________________/_   _____|    ");
		System.out.println("     \\                 /  /     \\     ");
		System.out.println("      \\                \\ \\     /        ");
		System.out.println("       \\______________ _/ /______\\       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     __________________*__       ");
		System.out.println("     \\                  /   _____     ");
		System.out.println("      \\                 \\ /     \\          ");
		System.out.println("       \\________________/  \\_____\\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                  |    *   *        ");
		System.out.println("                 *      |    *    ");
		System.out.println("                       |    *       ");
		System.out.println("     _______________*______|  ");
		System.out.println("     \\                 /        ");
		System.out.println("      \\                \\  _____         ");
		System.out.println("       \\_____________ __/  /     \\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		i++;
		}while(i<3);
		
		
		
		System.out.println("                 *             *       *");
		System.out.println("                    |               * | ");
		System.out.println("                 *     |        *       ");
		System.out.println("                             |          ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                    /            ");
		System.out.println("      \\                   \\           ");
		System.out.println("       \\__________________/            ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 *             *        ");
		System.out.println("                    |       |        *  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                    /            ");
		System.out.println("      \\                   \\           ");
		System.out.println("       \\__________________/            ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 |             /        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                    /            ");
		System.out.println("      \\                   \\           ");
		System.out.println("       \\__________________/            ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		for(int q=0; q<5; q++) {
			System.out.println();
		}
		System.out.println();
		System.out.println("YOU HIT A BATTLESHIP");
		
		
	}else if(hitCount==3) {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                      __");
		System.out.println("                                     /  ");
		System.out.println("                                    /___");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                    ____");
		System.out.println("                                   /    ");
		System.out.println("                                  /____/");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                   ____|");
		System.out.println("                                  /    /");
		System.out.println("                                 /____/ ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                  ____|_");
		System.out.println("                                 /    / ");
		System.out.println("                                /____/  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                ____|__ ");
		System.out.println("                               /    /   ");
		System.out.println("                              /____/    ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                               ____|__  ");
		System.out.println("                              /    /    ");
		System.out.println("                             /____/     ");
		System.out.println("                                        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                           ____|__     ");
		System.out.println("                          /    /       ");
		System.out.println("                         /____/        ");
		System.out.println("     _______________________            ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         ____|_       ");
		System.out.println("                        /    /        ");
		System.out.println("     __________________/____/___      ");
		System.out.println("     \\                     \\          ");
		System.out.println("      \\                    /           ");
		System.out.println("       \\___________________\\          ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		int k=0;
		int i = 0;
		do {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     __________________/____/__     ");
		System.out.println("     \\                 /      \\     ");
		System.out.println("      \\                \\      /        ");
		System.out.println("       \\_______________/______\\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                      |    *   *        ");
		System.out.println("                       *      |    *    ");
		System.out.println("                           |    *       ");
		System.out.println("     __________________/_   _____|    ");
		System.out.println("     \\                 /  /     \\     ");
		System.out.println("      \\                \\ \\     /        ");
		System.out.println("       \\______________ _/ /______\\       ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         *    *  /         ");
		System.out.println("                          /      /        ");
		System.out.println("     __________________*__       ");
		System.out.println("     \\                  /   _____     ");
		System.out.println("      \\                 \\ /     \\          ");
		System.out.println("       \\________________/  \\_____\\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                  |    *   *        ");
		System.out.println("                 *      |    *    ");
		System.out.println("                       |    *       ");
		System.out.println("     _____________________|  ");
		System.out.println("     \\                 /        ");
		System.out.println("      \\                \\  _____         ");
		System.out.println("       \\_____________ __/  /     \\       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		i++;
		}while(i<3);
		
		
		
		System.out.println("                 *             *       *");
		System.out.println("                    |               * | ");
		System.out.println("                 *     |        *       ");
		System.out.println("                             |          ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 *             *        ");
		System.out.println("                    |       |        *  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 |             /        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		for(int q=0; q<5; q++) {
			System.out.println();
		}
		System.out.println();
		System.out.println("YOU HIT A BATTLESHIP");
	}
	else if(hitCount==4) {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                      __");
		System.out.println("                                     /  ");
		System.out.println("                                    /___");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                 ____|__");
		System.out.println("                                /    /  ");
		System.out.println("                               /____/   ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                             ____|__    ");
		System.out.println("                            /    /      ");
		System.out.println("                           /____/       ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                         ____|__        ");
		System.out.println("                        /    /          ");
		System.out.println("                       /____/           ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                ____|__ ");
		System.out.println("                               /    /   ");
		System.out.println("                              /____/    ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                               ____|__  ");
		System.out.println("                              /    /    ");
		System.out.println("                             /____/     ");
		System.out.println("                                        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                           ____|__     ");
		System.out.println("                          /    /       ");
		System.out.println("                         /____/        ");
		System.out.println("     ____________________               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                     ____|__            ");
		System.out.println("                    /    /              ");
		System.out.println("     ______________/____/               ");
		System.out.println("     \\                 /               ");
		System.out.println("      \\                \\              ");
		System.out.println("       \\_______________/               ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		int k=0;
		int i = 0;
		do {
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                   |    *   *           ");
		System.out.println("                 *      |    *          ");
		System.out.println("                    |    *              ");
		System.out.println("     ______________ _____               ");
		System.out.println("     \\            /    /               ");
		System.out.println("      \\           \\   \\              ");
		System.out.println("       \\_______________/               ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("             |    *   *                 ");
		System.out.println("            *      |    *               ");
		System.out.println("                 |    *                 ");
		System.out.println("     ______________   _____               ");
		System.out.println("     \\           /  /    /               ");
		System.out.println("      \\          \\ \\   \\              ");
		System.out.println("       \\_________/ /_____/               ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("               *    *  /                ");
		System.out.println("                  /      /              ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /   _____             ");
		System.out.println("      \\          \\ /    /             ");
		System.out.println("       \\_________/ \\     \\           ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("               |    *   *         ");
		System.out.println("              *      |    *       ");
		System.out.println("                   |    *         ");
		System.out.println("     ______________               ");
		System.out.println("     \\           /               ");
		System.out.println("      \\          \\  _____       ");
		System.out.println("       \\_________/  /    /       ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		i++;
		}while(i<3);
		
		
		
		System.out.println("            *             *      *");
		System.out.println("      |               * |         ");
		System.out.println("           *     |        *       ");
		System.out.println("                     |            ");
		System.out.println("                                  ");
		System.out.println("     ______________               ");
		System.out.println("     \\           /               ");
		System.out.println("      \\          \\              ");
		System.out.println("       \\_________/               ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 *             *        ");
		System.out.println("                    |       |        *  ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________               ");
		System.out.println("     \\           /               ");
		System.out.println("      \\          \\              ");
		System.out.println("       \\_________/               ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 |             /        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		for(int q=0; q<5; q++) {
			System.out.println();
		}
		System.out.println();
		System.out.println("YOU HIT A BATTLESHIP");
		
	}
	
}public static void animationDeVictoire() {
	 
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("          OOO                           ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("         OOOOO                          ");
		System.out.println("          OOO                           ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                           ");
		System.out.println("          OOO                           ");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("           |                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("          OOO                           ");
		System.out.println("                                        ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("            /                           ");
		System.out.println("           |                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("          OOO                           ");
		System.out.println("     ______________                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("            x                           ");
		System.out.println("           /                            ");
		System.out.println("           |                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("     _____OOO______                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("           x                            ");
		System.out.println("           |                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("     _____OOO______                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("           x                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("     _____OOO______                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("           x                            ");
		System.out.println("          OOO                           ");
		System.out.println("         OOOOO                          ");
		System.out.println("     _____OOO______                     ");
		System.out.println("     \\           /                     ");
		System.out.println("      \\          \\                    ");
		System.out.println("       \\_________/                     ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("      \\     x  /                         ");
		System.out.println("  \\   O    O OO   /                      ");
		System.out.println("         O OO O  -                        ");
		System.out.println("    /__O___O OO_ __\\__                   ");
		System.out.println("     \\   _\\    /     /                  ");
		System.out.println("      \\_/ /   /  \\   \\                 ");
		System.out.println("       \\___\\/______/                    ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                                          ");
		System.out.println("  ____         v       v                  ");
		System.out.println("  \\ /    v                  ________     ");
		System.out.println("   \\/                v      \\     /     ");
		System.out.println("       v       v       v      \\___/      ");
		System.out.println("   __        v                    v       ");
		System.out.println("  \\_\\   v             v                 ");
		System.out.println("                                          ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("              v      v              v      ");
		System.out.println("    v   v                                  ");
		System.out.println("                                           ");
		System.out.println("  v                v        v         v    ");
		System.out.println("                                           ");
		System.out.println("  v      v                                 ");
		System.out.println("                 v   v          v     v    ");
		System.out.println("                                           ");
		System.out.println("     v       v              v        v     ");
		
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("     v        v     v                 v    ");
		System.out.println("                            v              ");
		System.out.println("   v                                       ");
		System.out.println("                               v   v       ");
		System.out.println("        v                                  ");
		System.out.println("  v          v                             ");
		System.out.println("                                     v     ");
		System.out.println("                                           ");
		System.out.println("     v                       v             ");
		System.out.println("         v           v               v   v ");
		System.out.println(" \r\n" + 
				" \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("_. \r\n" + 
				" \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(" ._. \r\n" + 
				" | \r\n" + 
				"| \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("_. ._. \r\n" + 
				" | | \r\n" + 
				"| | \r\n" + 
				"| \r\n" + 
				"_ \r\n" + 
				" \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(" ._. ._. \r\n" + 
				" | | | \r\n" + 
				"| | | \r\n" + 
				" \\| \r\n" + 
				" __ \r\n" + 
				"/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("_. ._. ._. \r\n" + 
				" | | | | \r\n" + 
				"| | | | \r\n" + 
				"|  \\| \r\n" + 
				"_  __ \r\n" + 
				" \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(" ._. ._. ._. \r\n" + 
				" | | | | | \r\n" + 
				"| | | | | \r\n" + 
				" \\|  \\| \r\n" + 
				" __  __ \r\n" + 
				"/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("   ._. ._. ._. \r\n" + 
				" | | | | | | \r\n" + 
				"| | | | | | \r\n" + 
				"|  \\|  \\| \r\n" + 
				"_  __  __ \r\n" + 
				" \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("     ._. ._. ._. \r\n" + 
				"   | | | | | | \r\n" + 
				"  | | | | | | \r\n" + 
				" \\|  \\|  \\| \r\n" + 
				" __  __  __ \r\n" + 
				"   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("     ._. ._. ._. \r\n" + 
				"   | | | | | | \r\n" + 
				" \\  | | | | | | \r\n" + 
				"\\  \\|  \\|  \\| \r\n" + 
				"/  __  __  __ \r\n" + 
				"\\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("       ._. ._. ._. \r\n" + 
				"__   | | | | | | \r\n" + 
				"   \\  | | | | | | \r\n" + 
				"  \\  \\|  \\|  \\| \r\n" + 
				"  /  __  __  __ \r\n" + 
				"  \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("       ._. ._. ._. \r\n" + 
				"__   | | | | | | \r\n" + 
				"   \\  | | | | | | \r\n" + 
				"  \\  \\|  \\|  \\| \r\n" + 
				"  /  __  __  __ \r\n" + 
				"  \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("         ._. ._. ._. \r\n" + 
				"____   | | | | | | \r\n" + 
				"/    \\  | | | | | | \r\n" + 
				" |  \\  \\|  \\|  \\| \r\n" + 
				"_|  /  __  __  __ \r\n" + 
				"    \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("__         ._. ._. ._. \r\n" + 
				"| ____   | | | | | | \r\n" + 
				" |/    \\  | | | | | | \r\n" + 
				"   |  \\  \\|  \\|  \\| \r\n" + 
				"___|  /  __  __  __ \r\n" + 
				"      \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(" .__         ._. ._. ._. \r\n" + 
				"__| ____   | | | | | | \r\n" + 
				"/  |/    \\  | | | | | | \r\n" + 
				" |   |  \\  \\|  \\|  \\| \r\n" + 
				"_|___|  /  __  __  __ \r\n" + 
				"        \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("   .__         ._. ._. ._. \r\n" + 
				"_|__| ____   | | | | | | \r\n" + 
				"/ /  |/    \\  | | | | | | \r\n" + 
				"|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"|__|___|  /  __  __  __ \r\n" + 
				"          \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("     .__         ._. ._. ._. \r\n" + 
				"  _|__| ____   | | | | | | \r\n" + 
				" \\/ /  |/    \\  | | | | | | \r\n" + 
				" /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"/ |__|___|  /  __  __  __ \r\n" + 
				"            \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("       .__         ._. ._. ._. \r\n" + 
				" _  _|__| ____   | | | | | | \r\n" + 
				"\\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"   /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"\\_/ |__|___|  /  __  __  __ \r\n" + 
				"              \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("         .__         ._. ._. ._. \r\n" + 
				"_  _  _|__| ____   | | | | | | \r\n" + 
				"\\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"\\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("           .__         ._. ._. ._. \r\n" + 
				" __  _  _|__| ____   | | | | | | \r\n" + 
				"\\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				" \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"  \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                  \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("             .__         ._. ._. ._. \r\n" + 
				"_  __  _  _|__| ____   | | | | | | \r\n" + 
				"  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"/  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                    \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("               .__         ._. ._. ._. \r\n" + 
				" __  __  _  _|__| ____   | | | | | | \r\n" + 
				" |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"_/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                      \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                 .__         ._. ._. ._. \r\n" + 
				"__ __  __  _  _|__| ____   | | | | | | \r\n" + 
				"|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				" |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"___/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                        \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                   .__         ._. ._. ._. \r\n" + 
				"  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				" \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				")  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                          \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("                     .__         ._. ._. ._. \r\n" + 
				"__  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				" \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"_/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                            \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(".                      .__         ._. ._. ._. \r\n" + 
				"____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				" _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"<_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"___/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                              \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("__.                      .__         ._. ._. ._. \r\n" + 
				"| ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				"/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                                \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("__.                      .__         ._. ._. ._. \r\n" + 
				"  | ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				" |/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				" (  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"_|\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                                  \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(".___.                      .__         ._. ._. ._. \r\n" + 
				"|   | ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				"   |/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"   (  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"___|\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                                    \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("__.___.                      .__         ._. ._. ._. \r\n" + 
				"  |   | ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
				" |   |/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
				"__   (  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
				"_____|\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
				"                                    \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("____.___.                      .__         ._. ._. ._. \r\n" + 
						"__  |   | ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
						"   |   |/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
						"____   (  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
						" ______|\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
						"/                                     \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(" _____.___.                      .__         ._. ._. ._. \r\n" + 
							"\\__  |   | ____  __ __  __  _  _|__| ____   | | | | | | \r\n" + 
							" /   |   |/  _ \\|  |  \\ \\ \\/ \\/ /  |/    \\  | | | | | | \r\n" + 
							" \\____   (  <_> )  |  /  \\     /|  |   |  \\  \\|  \\|  \\| \r\n" + 
							" / ______|\\____/|____/    \\/\\_/ |__|___|  /  __  __  __ \r\n" + 
							" \\/                                     \\/   \\/  \\/  \\/ ");
		try{
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println();
		}
}public static void gameOverAnimation(int[] coordinates) {
	System.out.println(" ________                                                  \r\n" + 
			" /  _____/_____    _____   ____     _______  __ ___________ \r\n" + 
			"/   \\  ___\\__  \\  /     \\_/ __ \\   /  _ \\  \\/ // __ \\_  __ \\\r\n" + 
			"\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  (  <_> )   /\\  ___/|  | \\/\r\n" + 
			" \\______  (____  /__|_|  /\\___  >  \\____/ \\_/  \\___  >__|   \r\n" + 
			"        \\/     \\/      \\/     \\/                   \\/  ");
	try{
		Thread.sleep(500);
	}catch(Exception e) {
		System.out.println();
	}
	
	System.out.println("The coordinates were: \n Column "+coordinates[0]+"\n Rows "+coordinates[1]+", "+coordinates[2]+", "+coordinates[3]+", "+coordinates[4]+", and "+coordinates[5]);
}

}

