class ShapesVolume
{
    public static void findVolume(double l)
    {
        double v = l * l * l;
        System.out.println("Volume of cube is " + v);
    }
    public static void findVolume(double l, double b, double h)
    {
        double v = l * b * h;
        System.out.println("Volume of cuboid is " + v);
    }
    public static void findVolume(double r, double h)
    {
        double v = 3.14 * r * r * h;
        System.out.println("Volume of cuboid is " + v);
    }
}