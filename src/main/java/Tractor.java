public class Tractor {

    Coordinate coordinate = new Coordinate(0, 0);
    int[] field = new int[] { 5, 5 };
    Orientation orientation = Orientation.NORTH;

    public void move(String command) {
        if (command.equals("F")) {
            moveForwards();
        } else if (command.equals("T")) {
            turnClockwise();
        }
    }

    public void moveForwards() {
        if (orientation == Orientation.NORTH)
            coordinate.goNorth();
        if (orientation == Orientation.EAST)
            coordinate.goEast();
        if (orientation == Orientation.SOUTH)
            coordinate.goSouth();
        if (orientation == Orientation.WEST)
            coordinate.goWest();

        if (coordinate.x > field[0]
                || coordinate.y > field[1]
                || coordinate.x < 0
                || coordinate.y < 0) {
            throw new TractorInDitchException();
        }
    }

    public void turnClockwise() {
        if (orientation == Orientation.NORTH) {
            orientation = Orientation.EAST;
        } else if (orientation == Orientation.EAST) {
            orientation = Orientation.SOUTH;
        } else if (orientation == Orientation.SOUTH) {
            orientation = Orientation.WEST;
        } else if (orientation == Orientation.WEST) {
            orientation = Orientation.NORTH;
        }
    }

    public int getPositionX() {
        return coordinate.x;
    }

    public int getPositionY() {
        return coordinate.y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

}