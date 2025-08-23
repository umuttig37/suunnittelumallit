package factory_method;

import java.util.Random;

public class WildernessMap extends Map {
    private static final Random rnd = new Random();

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int pick = rnd.nextInt(3);
        switch (pick) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new ForestTile();
        }
    }
}