package task1.variables;

public class Variables {
    //то же самое что и MainClass, глобальные переменные, только модификатор доступа private
    //для того, чтобы с ними что-то делать, создаются методы get (забрать) и set(записать) для каждой переменной

    //primitive variables;
    private byte aByte;
    private short aShort;
    private char aChar;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private boolean aBoolean;

    //reference variables;
    private String referenceString;
    private Byte referenceByte;
    private Short referenceShort;
    private Integer referenceInt;
    private Long referenceLong;
    private Character referenceChar;
    private Float referenceFloat;
    private Double referenceDouble;
    private Boolean referenceBoolean;


    //getters for primitive variables;
    public byte getaByte() {
        return aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public char getaChar() {
        return aChar;
    }

    public int getAnInt() {
        return anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public float getaFloat() {
        return aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public boolean getaBoolean() {
        return aBoolean;
    }

    //getters for reference variables;
    public String getReferenceString() {
        return referenceString;
    }

    public Byte getReferenceByte() {
        return referenceByte;
    }

    public Short getReferenceShort() {
        return referenceShort;
    }

    public Integer getReferenceInt() {
        return referenceInt;
    }

    public Long getReferenceLong() {
        return referenceLong;
    }

    public Character getReferenceChar() {
        return referenceChar;
    }

    public Float getReferenceFloat() {
        return referenceFloat;
    }

    public Double getReferenceDouble() {
        return referenceDouble;
    }

    public Boolean getReferenceBoolean() {
        return referenceBoolean;
    }

    //setters for primitive variables;
    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    //setters for reference variables;

    public void setReferenceBoolean(Boolean referenceBoolean) {
        this.referenceBoolean = referenceBoolean;
    }

    public void setReferenceByte(Byte referenceByte) {
        this.referenceByte = referenceByte;
    }

    public void setReferenceChar(Character referenceChar) {
        this.referenceChar = referenceChar;
    }

    public void setReferenceDouble(Double referenceDouble) {
        this.referenceDouble = referenceDouble;
    }

    public void setReferenceFloat(Float referenceFloat) {
        this.referenceFloat = referenceFloat;
    }

    public void setReferenceInt(Integer referenceInt) {
        this.referenceInt = referenceInt;
    }

    public void setReferenceLong(Long referenceLong) {
        this.referenceLong = referenceLong;
    }

    public void setReferenceShort(Short referenceShort) {
        this.referenceShort = referenceShort;
    }

    public void setReferenceString(String referenceString) {
        this.referenceString = referenceString;
    }
}