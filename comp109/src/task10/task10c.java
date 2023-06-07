package task10;

public class task10c {
    public static void main(String[] args) {
        int[][] cityDistances = { { 0, 455, 480, 694 }, { 455, 0, 587, 475 }, { 480, 587, 0, 457 }, { 694, 475, 457, 0 } };
        String[] cities = { "Istnbul", "Ankara", "Izmir", "Antalya" };

        int minValue = cityDistances[0][1];
        int min_y = 0;
        int min_x = 1;

        // Loops in cities and prints them with tab stops.
        for (int i = 0; i < cities.length; i++) {
            System.out.print("\t");
            System.out.print(cities[i]);
        }

        System.out.print("\n");

        // Loops between cityDistances and prints a 2D Table with tab stops
        for (int y = 0; y < cityDistances.length; y++) {
            System.out.print(cities[y]); // Creates the city name on the left column
            for (int x = 0; x < cityDistances[y].length; x++) {
                System.out.print("\t");
                System.out.print(cityDistances[y][x]);
            }
            System.out.println("\n");
        }

        // Compares the cityDistances to find minimum value.
        for (int y = 0; y < cityDistances.length; y++) {
            for (int x = y + 1; x < cityDistances[y].length; x++) { // "x=y+1" helps us the check just the half of the table.
                if (cityDistances[y][x] < minValue) {
                    minValue = cityDistances[y][x];
                    min_y = y;
                    min_x = x;
                }
            }
        }

        System.out.print("Minimum distance: ");
        System.out.print(cities[min_y] + " - " + cities[min_x]);
        System.out.println("\n" + "------------------------------------------");
    }
}
