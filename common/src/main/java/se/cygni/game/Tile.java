package se.cygni.game;

import se.cygni.game.worldobjects.WorldObject;

public class Tile {

    private final WorldObject content;


    public Tile(WorldObject content) {
        this.content = content;
    }

    public Tile(Tile copy) {
        this(copy.getContent());
    }

    public WorldObject getContent() {
        return content;
    }
}
