package lab_4.computer;

public class Computer {
    Processor processor;
    Monitor monitor;
    Memory memory;

    Computer() {
        this.processor = new Processor(ProcessorMarks.Intel, 30000, 4);
        this.monitor = new Monitor(MonitorMarks.LG, 30000, 1920, 1080);
        this.memory = new Memory(MemoryMarks.Kingston, 15000, 10000000);
    }

    public void print() {
        System.out.println(this.processor.toString());
        System.out.println(this.monitor.toString());
        System.out.println(this.memory.toString());
    }
}
