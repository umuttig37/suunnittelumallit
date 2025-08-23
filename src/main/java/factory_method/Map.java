package factory_method;

import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new Tile[height][width];
        generate();
    }

    private void generate() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                tiles[row][col] = createTile();
            }
        }
    }

    protected abstract Tile createTile();

    public void display() {
        for (Tile[] row : tiles) {
            for (Tile t : row) {
                System.out.print(t.getCharacter());
            }
            System.out.println();
        }
    }
}
