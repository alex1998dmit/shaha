package lab_4.computer;
enum MonitorMarks {
    LG,
    SAMSUNG,
    SONY,
    MSI
}

public class Monitor {
    public MonitorMarks mark;
    public double cost;
    public int width;

    public int height;

    public Monitor(MonitorMarks mark, double cost, int width, int height) {
        this.mark = mark;
        this.cost = cost;
        this.width = width;
        this.height= height;
    }

    @Override
    public String toString() {
        return "Монитор: " + mark + " цена " + cost + ", разрешение:" + width + "x" + height;
    }
}
