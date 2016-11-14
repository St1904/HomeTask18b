public class Coordinate {
    public int x;
    public int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goNorth() {
        y++;
    }

    public void goSouth() {
        y--;
    }

    public void goWest() {
        x--;
    }

    public void goEast() {
        x++;
    }
}
