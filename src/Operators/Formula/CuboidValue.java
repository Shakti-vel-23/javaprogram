package Operators.Formula;
class CuboidValue {
    public static void main(String[] args) {
        double l = 5, w = 4, h = 3;
        double surfaceArea = 2 * (l*w + w*h + h*l);
        double volume = l * w * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}

