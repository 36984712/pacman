
package com.example.ruich.pacman;

/**
 * Pos - a simple xy position on the screen.  The screen
 * has xy range from 0 to 1, and 0,0 is in the top left corner.
 *
 * Eric McCreath 16/03/16.
 */
public class Pos {
    float x;
    float y;
    public Pos(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Pos(Pos p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float distance(Pos p) {
        float dx = x - p.x;
        float dy = y - p.y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
