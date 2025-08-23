package factory_method;
import java.util.Random;
public class CityMap extends Map {
    private static final Random rnd = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int pick = rnd.nextInt(3);
        switch (pick) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            case 2: return new BuildingTile();
            default: return new ForestTile();
        }
    }
}
