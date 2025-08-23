package factory_method;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose map type (1 for cityMap / 2 for wildernessMap): ");
        String choice = sc.nextLine().trim().toLowerCase();

        Map map = createMap(choice, 10, 5);
        System.out.println("\nGenerated " + choice.substring(0,1).toUpperCase() + choice.substring(1) + " Map:");
        map.display();
    }

    protected static Map createMap(String type, int width, int height) {
        if ("1".equalsIgnoreCase(type)) {
            return new CityMap(width, height);
        } else if ("2".equalsIgnoreCase(type)) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}

