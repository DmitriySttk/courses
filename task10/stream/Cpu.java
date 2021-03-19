package task10.stream;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return Double.compare(cpu.frequency, frequency) == 0 &&
                Objects.equals(name, cpu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frequency);
    }
}
