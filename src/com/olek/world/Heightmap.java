package com.olek.world;

import java.util.List;

public class Heightmap {

    private Block[][] map;

    public Heightmap(Block[][][] blocks) {

        map = new Block[16][16];

        for(int y = blocks.length-1; y >= 0; y--){
            for(int x = 0; x < 16; x++) {
                for(int z = 0; z < 16; z++) {
                    try {
                        if(!blocks[y][x][z].getName().equals("minecraft:air") && map[x][z] == null) {
                            map[x][z] = blocks[y][x][z];
                        }
                    } catch (NullPointerException e){
                        System.out.println("null w heightmapie: "+ y +" " + x + " " + z);
                    }

                }
            }
        }
    }

    public Block[][] getMap() {
        return map;
    }
}
