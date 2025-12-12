package Operators;
class DistancePoint {
    public static void main(String[] args) {
        double x1 = 2, y1 = 3, x2 = 7, y2 = 9;
        double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println(distance);
    }
}
