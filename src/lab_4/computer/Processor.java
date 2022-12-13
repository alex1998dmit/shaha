package lab_4.computer;

enum ProcessorMarks {
    Intel,
    AMD,
    APPLE
}

public class Processor {
    ProcessorMarks mark;
    double cost;
    double freq;

    Processor(ProcessorMarks mark, double cost, double freq) {
        this.mark = mark;
        this.cost = cost;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Процессор: " + mark + " цена " + cost + ", частота:" + freq + "ггц";
    }
}
