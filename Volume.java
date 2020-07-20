public class Volume
{
    public static double findVolume(double R)
    {
        double v = 4 / 3.0 * 3.14 * Math.pow(R,3);
        return v;
    }
    public static double findVolume(double H, double R)
    {
        double v = 22 / 7 * R * R * H;
        return v;
    }
    public static double findVolume(double L, double B, double H)
    {
        double v = L * B * H;
        return v;
    }
}