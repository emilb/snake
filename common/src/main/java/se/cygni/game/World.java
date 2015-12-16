package se.cygni.game;

import se.cygni.game.worldobjects.Empty;

/**
 * An immutable representation of the current world state.
 */
public class World {

    // The width and height (in Tiles) of the game world
    private final int width, height;

    private final Tile[][] worldmatrix;

    public World(int width, int height) {
        this.width = width;
        this.height = height;

        worldmatrix = new Tile[width][height];
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                worldmatrix[w][h] = new Tile(new Empty());
            }
        }
    }

    public World(World copy) {
        this(copy.getWidth(), copy.getHeight());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
