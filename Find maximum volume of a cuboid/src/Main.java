public class Main {
    public static double maxVolume(double perimeter, double area) {
        double part1 = perimeter - Math.sqrt(Math.pow(perimeter, 2) - (24 * area));
        double term = Math.pow(part1 / 12, 2);
        double height = (perimeter / 4) - (2 * (part1 / 12));
        double ans = term * height;
        return ans;
    }
    public static void main(String[] args) {
        int perimeter = 22, area = 15;
        System.out.println(maxVolume(perimeter,area));
    }
}