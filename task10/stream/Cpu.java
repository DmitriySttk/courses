package task10.stream;

public class Cpu {
    private String name;
    private double frequency;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cpu(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public Cpu() {
    }


}
