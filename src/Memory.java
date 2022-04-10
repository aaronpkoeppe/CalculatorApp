public class Memory extends Calculator {
    private double memoryValue = 0.0;

    public void setMemoryValue(double memoryValue) {
        this.memoryValue = memoryValue;
    }

    public void memoryClear() {
        memoryValue = 0.0;
        System.out.println("memory cleared\n");
    }

    public void memoryAdd(double y) {
        memoryValue += y;
        System.out.println("memory addition: " + memoryValue + " + " + y + " = " + (memoryValue + y));
        System.out.println(this.memoryValue);
    }

    public void memorySubtract(double y) {
        System.out.println("memory subtraction: " + memoryValue + "-" + + y + "=" + (memoryValue - y));
        this.memoryValue -= memoryValue;
        System.out.println(this.memoryValue);
    }

    public double memoryRecall() {
        return memoryValue;
    }
}
