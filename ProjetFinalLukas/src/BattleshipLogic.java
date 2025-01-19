import java.util.*;

public class BattleshipLogic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] coordinates = coordinateGenerator(6);
        ArrayList<Integer> allColumnHits = new ArrayList<>();
        ArrayList<Integer> allRowHits = new ArrayList<>();

        for (int i = 0; i < coordinates.length; i++) {
            System.out.println(coordinates[i]);
        }

        int j = 1;
        int hitCount = 0;
        int row;
        int column;
        
        do {
            System.out.println("Guess #" + j);
            System.out.println("Guess where the ship is: ");
            System.out.print("Column: ");
            column = in.nextInt();
            System.out.println();
            System.out.print("Row: ");
            row = in.nextInt();

            if (hitOrMiss(column, row, coordinates, allColumnHits, allRowHits)) {
                hitCount++;
                System.out.println("You hit a battleship!");
            } else {
                System.out.println("You missed");
            }

            j++;
        } while (j < 10 && hitCount != 5);

        if (hitCount == 5) {
            System.out.println("Victory!");
        } else {
            System.out.println("Game Over.");
            System.out.println("Coordinates were: ");
            for (int coord : coordinates) {
                System.out.print(coord + " ");
            }
        }

        in.close();
    }

    public static boolean hitOrMiss(int column, int row, int[] coordinates, ArrayList<Integer> allColumnHits, ArrayList<Integer> allRowHits) {
        boolean hit = false;

        if (allRowHits.contains(row) && allColumnHits.contains(column)) {
            System.out.println("You already hit this square");
            return false;
        }

        if (column == coordinates[0] && (row == coordinates[1] || row == coordinates[2] || row == coordinates[3] || row == coordinates[4] || row == coordinates[5])) {
            hit = true;
        }

        allColumnHits.add(column);
        allRowHits.add(row);
        return hit;
    }

    public static int[] coordinateGenerator(int sizeOfBoat) {
        int[] coordinates = new int[sizeOfBoat];
        coordinates[0] = (int) Math.round(Math.random());
        coordinates[1] = (int) Math.round(Math.random());
        for (int i = 2; i < sizeOfBoat; i++) {
            coordinates[i] = coordinates[i - 1] + 1;
        }
        return coordinates;
    }
}
