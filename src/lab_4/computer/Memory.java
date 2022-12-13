package lab_4.computer;

enum MemoryMarks {
    SAMSUNG,
    Kingston,
}

public class Memory {
    int size;
    double cost;
    MemoryMarks mark;
    public Memory(MemoryMarks mark, double cost, int size) {
        this.mark = mark;
        this.cost = cost;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Память: " + mark + " цена " + cost + ", память:" + size + "мб";
    }
}
