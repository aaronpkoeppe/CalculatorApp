public class AdvancedCalc implements AdvancedMath {
    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    @Override
    public double pow(double x, double y) {
        return Math.pow(x, y);
    }
}
