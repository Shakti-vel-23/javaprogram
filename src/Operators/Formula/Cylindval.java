package Operators.Formula;
class Cylindval {
    public static void main(String[] args) {
        double r = 5, h = 10;
        double surfaceArea = 2 * 3.14159 * r * (r + h);
        double volume = 3.14159 * r * r * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}

