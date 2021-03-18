package task10.stream;

public class Cpu {
    private String name;
    private double frequency;

    public double getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }


    public Cpu(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public Cpu() {
    }

    @Override
    public String toString() {
        return "{Cpu " +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
